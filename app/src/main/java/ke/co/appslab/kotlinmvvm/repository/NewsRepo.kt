package ke.co.appslab.kotlinmvvm.repository

import android.util.Log
import io.reactivex.Observable
import io.reactivex.ObservableSource
import ke.co.appslab.kotlinmvvm.database.dao.NewsDao
import ke.co.appslab.kotlinmvvm.models.News

class NewsRepo(val newsDao: NewsDao) {

    fun getNews():Observable<List<News>> {
        return Observable.concatArray(
//                getNewsFromFirebase(),
                getNewsFromDb())
    }

    fun getNewsFromDb():Observable<List<News>> {

        return newsDao.getNews().filter { it.isNotEmpty() }
                .toObservable()
                .doOnNext {
                    Log.d("","$it.size")
                }
    }

//    fun getNewsFromFirebase(): Observable<List<News>> {
//
//    }

}