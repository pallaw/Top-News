package com.pallaw.topnews.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pallaw.topnews.R
import com.pallaw.topnews.data.dummy.DummyContent
import com.pallaw.topnews.data.dummy.DummyContent.DummyNews

class NewsListFragment : Fragment(), MyNewsRecyclerViewAdapter.OnNewsItemClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = MyNewsRecyclerViewAdapter(DummyContent.NEWS, this@NewsListFragment)
            }
        }
        return view
    }

    override fun onNewsItemClicked(news: DummyNews?) {
        findNavController().navigate(R.id.action_newslistFragment_to_newsDetailFragment)
        Toast.makeText(requireActivity(), "clicked $news", Toast.LENGTH_LONG).show()
    }

}
