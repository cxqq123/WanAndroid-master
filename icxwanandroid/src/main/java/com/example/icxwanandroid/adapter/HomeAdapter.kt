package com.example.icxwanandroid.adapter

import android.content.Context
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.icxwanandroid.R
import com.example.icxwanandroid.bean.HomeListBean
import java.text.SimpleDateFormat

class HomeAdapter : BaseQuickAdapter<HomeListBean.Datas , BaseViewHolder>{

    private var collect : Boolean = false

    constructor(context: Context, datas: List<HomeListBean.Data>?) : this(context, datas, false)
    constructor(context: Context, datas: List<HomeListBean.Data>?, isCollect: Boolean) : super(R.layout.item_rv_home) {
        collect = isCollect
    }


    override fun convert(helper: BaseViewHolder?, item: HomeListBean.Datas?) {
        val format = SimpleDateFormat("yyyy-MM-dd")
        if(collect){
            item!!.collect = collect
        }
        helper!!.setText(R.id.home_item_author, item!!.author)
                .setText(R.id.home_item_time, format.format(item.publishTime))
                .setText(R.id.home_item_title, item.title)
                .setText(R.id.home_item_type, item.chapterName)
                .setImageResource(
                        R.id.home_item_collect,
                        if (item.collect) R.drawable.ic_action_like else R.drawable.ic_action_no_like)
                .addOnClickListener(R.id.home_item_collect)
                .addOnClickListener(R.id.home_item_type)

    }

}