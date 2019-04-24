package com.example.icxwanandroid.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.icxwanandroid.R
import com.example.icxwanandroid.bean.HomeListBean
import com.example.icxwanandroid.bean.KnowledgeBean
import com.example.icxwanandroid.view.KnowledgeView

class KonwledgeFragment : Fragment() , KnowledgeView{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_konwledge  , container , false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun getKnowledgeSuc(result: KnowledgeBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKnowLedgeContent(result: HomeListBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun collectSuccess(result: HomeListBean, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cancelCollectSuccess(result: HomeListBean, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadComplete() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadError(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}