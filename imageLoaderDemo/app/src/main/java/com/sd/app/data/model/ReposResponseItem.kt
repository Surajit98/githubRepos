package com.sd.app.data.model


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity( tableName = "repos")
data class ReposResponseItem(
    @SerializedName("description")
    val description: String?,
    @PrimaryKey
    @SerializedName("id")
    val id: Int?,
    @Embedded(prefix = "license_")
    @SerializedName("license")
    val license: License?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("open_issues_count")
    val openIssuesCount: Int?,
    @Embedded(prefix = "permissions_")
    @SerializedName("permissions")
    val permissions: Permissions?
)