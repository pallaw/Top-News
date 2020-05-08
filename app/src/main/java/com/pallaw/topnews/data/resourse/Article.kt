package com.pallaw.topnews.data.resourse

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "article")
data class Article(

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: String = "",

    @ColumnInfo(name = "author")
    @SerializedName("author")
    var author: String = "",

    @ColumnInfo(name = "content")
    @SerializedName("content")
    var content: Any? = Any(),

    @ColumnInfo(name = "description")
    @SerializedName("description")
    var description: String = "",

    @ColumnInfo(name = "publishedAt")
    @SerializedName("publishedAt")
    var publishedAt: String = "",

    @ColumnInfo(name = "source")
    @SerializedName("source")
    var source: Source = Source(),

    @ColumnInfo(name = "title")
    @SerializedName("title")
    var title: String = "",

    @ColumnInfo(name = "url")
    @SerializedName("url")
    var url: String = "",

    @ColumnInfo(name = "urlToImage")
    @SerializedName("urlToImage")
    var urlToImage: String = ""
)