package com.pallaw.topnews.ui.news


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.pallaw.topnews.R
import com.pallaw.topnews.data.dummy.DummyContent.DummyNews
import kotlinx.android.synthetic.main.fragment_news.view.*


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
            .inflate(R.layout.fragment_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
//        holder.mIdView.text = item.id
//        holder.mContentView.text = item.content

        with(holder.mView) {
            tag = item
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: ImageView = mView.img_news_item

    }

    interface OnNewsItemClickListener {
        fun onNewsItemClicked(news: DummyNews?)
    }
}
