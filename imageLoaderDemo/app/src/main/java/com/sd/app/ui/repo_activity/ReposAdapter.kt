package com.sd.app.ui.repo_activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.sd.app.R
import com.sd.app.data.model.ReposResponseItem
import com.sd.app.databinding.ListItemReposBinding

class ReposAdapter(private val repos: ArrayList<ReposResponseItem>) :
    RecyclerView.Adapter<ReposAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemReposBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.list_item_repos,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = repos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = repos[position]
    }

    fun add(list: java.util.ArrayList<ReposResponseItem>) {
        repos.addAll(list)
        notifyDataSetChanged()
    }

    fun clear(){
        repos.clear()
        notifyDataSetChanged()
    }

    class ViewHolder(
        val binding: ListItemReposBinding
    ) : RecyclerView.ViewHolder(binding.root) {
    }
}