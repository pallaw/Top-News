package com.pallaw.topnews.ui.news


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pallaw.topnews.R
import com.pallaw.topnews.data.dummy.DummyContent.DummyNews
import com.pallaw.topnews.util.TimeConverter
import kotlinx.android.synthetic.main.item_news.view.*


class MyNewsRecyclerViewAdapter(
    private val mValues: List<DummyNews>,
    private val mListener: OnNewsItemClickListener?
) : RecyclerView.Adapter<MyNewsRecyclerViewAdapter.ViewHolder>() {

    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as DummyNews
            // Notify the active callbacks interface (the activity, if the fragment is attached to
            // one) that an item has been selected.
            mListener?.onNewsItemClicked(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
        holder.txt_news_item_time_ago.text =
            TimeConverter.getTimeAgo("2020-05-08T12:31:42Z")

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val img_news_item: ImageView = mView.img_news_item
        val txt_news_item_time_ago: TextView = mView.txt_news_item_time_ago

    }

    interface OnNewsItemClickListener {
        fun onNewsItemClicked(news: DummyNews?)
    }
}
