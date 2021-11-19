package com.pallaw.topnews.data.repository

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.pallaw.topnews.data.model.resourse.Article
import com.pallaw.topnews.data.remote.ApiService
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Pallaw Pathak on 10/05/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
class ArticleDataSourceFactory(
    private val apiServiceService: ApiService,
    private val compositeDisposable: CompositeDisposable
) : DataSource.Factory<Int, Article>() {

    val newsLiveDataSource = MutableLiveData<ArticleDataSource>() 

    override fun create(): DataSource<Int, Article> {
        val newsDataSource =
            ArticleDataSource(
                apiServiceService,
                compositeDisposable
            )
        newsLiveDataSource.postValue(newsDataSource)
        return newsDataSource
    }
}