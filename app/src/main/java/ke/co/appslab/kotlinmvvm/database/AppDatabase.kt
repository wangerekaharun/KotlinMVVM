package ke.co.appslab.kotlinmvvm.database

import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import ke.co.appslab.kotlinmvvm.database.dao.NewsDao

abstract class AppDatabase : RoomDatabase() {
    //Singleton
    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase? {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "news_db")
                    .fallbackToDestructiveMigration()
                    .build()
        }
        return INSTANCE
    }
    fun destroyInstance() {
        INSTANCE = null
    }
    //dao
    abstract fun  newsDao(): NewsDao
}

