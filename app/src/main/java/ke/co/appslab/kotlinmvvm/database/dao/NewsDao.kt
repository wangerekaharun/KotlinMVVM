package ke.co.appslab.kotlinmvvm.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import io.reactivex.Single
import ke.co.appslab.kotlinmvvm.models.News

@Dao
interface NewsDao {

    @Query("SELECT * FROM news")
    fun getNews():Single<List<News>>

    @Insert(onConflict = REPLACE)
    fun insertNews(news:List<News>)

}