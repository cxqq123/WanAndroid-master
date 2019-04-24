package com.example.icxwanandroid.view

import com.example.icxwanandroid.bean.BannerBean
import com.example.icxwanandroid.bean.HomeListBean

interface HomeFragmentView : IBaseView{

    //加载Banner成功
    fun loadBannerSuccess(result : BannerBean)

    //加载HomeList列表页成功
    fun loadHomeListSuccess(result: HomeListBean)

    //收藏成功
    fun collectSuccess(result : HomeListBean , position : Int)

    //取消收藏成功
    fun cancelCollectSuccess(result: HomeListBean , position: Int)
}