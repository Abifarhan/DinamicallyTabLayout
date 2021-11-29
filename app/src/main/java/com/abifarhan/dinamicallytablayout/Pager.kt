package com.abifarhan.dinamicallytablayout

import android.content.Context
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class Pager : PagerAdapter() {
    var views: List<View>
    var context:Context

    fun Pager(views: List<View>, context: Context) {
        this.views = views
        this.context = context
    }

    fun getView(position: Int): View {
        return views[position]
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
    }

}