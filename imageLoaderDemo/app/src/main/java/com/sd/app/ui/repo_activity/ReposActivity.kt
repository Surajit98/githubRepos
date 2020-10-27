package com.sd.app.ui.repo_activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.sd.app.R
import com.sd.app.data.model.ReposResponseItem
import com.sd.app.databinding.ActivityReposBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class ReposActivity : AppCompatActivity() {

    private val viewModel: ReposViewModel by viewModel()
    private lateinit var binding: ActivityReposBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_repos)
        binding.apply {
            lifecycleOwner = this@ReposActivity
            viewModel = this@ReposActivity.viewModel
        }
        setViews()
        addObservers()
    }

    private fun addObservers() {

        viewModel.getRepos()!!.observe(this, Observer {
            setList(it)
        })
        viewModel.showMessage.observe(this, Observer {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
        })

        viewModel.fetchRepos().observe(this, Observer {

        })
        viewModel.load()
    }

    private fun setList(list: List<ReposResponseItem>) {
        if (binding.adapter == null) {
            binding.adapter = ReposAdapter(list as ArrayList<ReposResponseItem>)
        } else {
            if (viewModel.fetchNextPage.value == true) {
                binding.adapter?.apply { add(list as java.util.ArrayList<ReposResponseItem>) }
            } else {
                binding.adapter?.apply {
                    clear()
                    add(list as java.util.ArrayList<ReposResponseItem>)
                }
            }

        }
    }

    private fun setViews() {
        supportActionBar?.title = "Github Repos"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.list.addOnScrollListener(object :
            LoadMoreListener(binding.list.layoutManager as LinearLayoutManager) {
            override fun loadMoreItems() {
                viewModel.load()
            }

            override val isLastPage: Boolean
                get() = viewModel.isLastPage
            override val isLoading: Boolean
                get() = viewModel.getLoading()?.value ?: false
        })
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }


    }
}