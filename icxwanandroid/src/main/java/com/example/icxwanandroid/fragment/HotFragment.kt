package com.example.icxwanandroid.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.icxwanandroid.R
import com.example.icxwanandroid.bean.HotBean
import com.example.icxwanandroid.view.HotView

class HotFragment : Fragment() , HotView{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_hot , container , false);
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun getHotKeySuc(result: HotBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCommonUse(result: HotBean) {
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