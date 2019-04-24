package com.example.icxwanandroid.view

interface IBaseView {

    fun loading()

    fun loadComplete()

    fun loadError(msg : String)
}