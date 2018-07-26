package ke.co.appslab.kotlinmvvm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import ke.co.appslab.kotlinmvvm.adapters.NewsAdapter
import ke.co.appslab.kotlinmvvm.models.News
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*
import org.jetbrains.anko.toast

class HomeActivity : AppCompatActivity() {

    private val newsList  = ArrayList<News>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        initView()

    }
    private fun addItems() {
        newsList.add(News("Waymo teams up with Walmart for self-driving shuttles","1h ago",R.drawable.logo))
        newsList.add(News("Facebook shares plunge after earnings call","2h ago",R.drawable.logo))
        newsList.add(News("Facebook launches Watch Party to all users","3h ago",R.drawable.logo))
        newsList.add(News("Apple fixes performance on the new MacBook Pro","4h ago",R.drawable.logo))
        newsList.add(News("Uber self driving cars are back on the road","1d ago",R.drawable.logo))

    }
    private fun initView() {
        val newsItemsList = newsRv;
        newsItemsList.layoutManager = LinearLayoutManager(this)
        addItems()
        newsItemsList.adapter =NewsAdapter(applicationContext,newsList)

        toast("Hello World")

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
