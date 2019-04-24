package com.example.icxwanandroid.view

import com.example.icxwanandroid.bean.HomeListBean
import com.example.icxwanandroid.bean.KnowledgeBean

/**
 * desc：
 * author：Created by xusong on 2019/3/11 15:50.
 */

interface KnowledgeView : IBaseView {

    fun getKnowledgeSuc(result: KnowledgeBean)

    fun getKnowLedgeContent(result: HomeListBean)

    fun collectSuccess(result:HomeListBean,position:Int)

    fun cancelCollectSuccess(result:HomeListBean,position:Int)
}