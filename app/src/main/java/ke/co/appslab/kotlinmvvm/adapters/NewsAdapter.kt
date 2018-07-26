package ke.co.appslab.kotlinmvvm.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ke.co.appslab.kotlinmvvm.R
import ke.co.appslab.kotlinmvvm.models.News
import kotlinx.android.synthetic.main.item_news_details.view.*

class NewsAdapter(val context: Context, val newsList: ArrayList<News>):RecyclerView.Adapter<NewsAdapter.MyViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news_details,parent,false))
    }
    override fun getItemCount(): Int{
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val news: News = newsList.get(position)
        holder.newsTitleText.text = news.newsTitle
        holder.newsTimeText.text = news.newsTime
        holder.newsImage.setImageResource(news.newsImg)
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newsTitleText = view.newsTitleText
        val newsTimeText =view.newsTimeText
        val newsImage= view.imageView

    }
}