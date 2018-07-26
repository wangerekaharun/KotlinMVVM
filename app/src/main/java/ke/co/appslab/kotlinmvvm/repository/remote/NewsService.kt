package ke.co.appslab.kotlinmvvm.repository.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import io.reactivex.Observable
import io.reactivex.Observer
import ke.co.appslab.kotlinmvvm.models.News

class NewsService {

//    fun fetchFromNetwork():Observer<List<News>> {
//        val firebaseFirestore = FirebaseFirestore.getInstance()
//        return Observable.create(
//                firebaseFirestore.collection("news")
//                .orderBy("id", Query.Direction.ASCENDING)
//                .get()
//                .addOnSuccessListener { queryDocumentSnapshots ->
//                    if (!queryDocumentSnapshots.isEmpty) {
//
//                    }
//                }
//                    )
//    }
}