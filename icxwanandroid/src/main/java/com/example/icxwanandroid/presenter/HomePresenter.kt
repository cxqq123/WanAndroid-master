package com.example.icxwanandroid.presenter

interface HomePresenter {

    fun getBanner()

    fun getHomeList(curPage:Int)

    fun collect(id:Int,position:Int)

    fun cancelCollect(id:Int,position:Int)
}