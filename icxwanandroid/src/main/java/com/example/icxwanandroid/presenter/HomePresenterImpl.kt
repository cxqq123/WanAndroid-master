package com.example.icxwanandroid.presenter

import android.util.Log
import com.example.icxwanandroid.bean.BannerBean
import com.example.icxwanandroid.bean.HomeListBean
import com.example.icxwanandroid.net.ApiService
import com.example.icxwanandroid.net.RetrofitHelper
import com.example.icxwanandroid.view.HomeFragmentView
import com.example.icxwanandroid.view.IBaseView

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class HomePresenterImpl(view: IBaseView) : HomePresenter{

    private var mView : HomeFragmentView = view as HomeFragmentView

    override fun getBanner() {
        mView.loading()
        RetrofitHelper.instance.create(ApiService::class.java)
                .getBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<BannerBean> {

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: BannerBean) {
                        Log.e("getBanner: " , "onNext : ")
                        mView.loadBannerSuccess(t!!)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getBanner: " , "onError : " + e.toString())
                        mView.loadError(e.toString())
                    }

                    override fun onComplete() {
                        Log.e("getBanner: " , "onComplete : ")
                        mView.loadComplete()
                    }
                })
    }

    override fun getHomeList(curPage: Int) {
        mView.loading()
        RetrofitHelper.instance.create(ApiService::class.java)
                .getHomeList(curPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<HomeListBean> {
                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: HomeListBean) {
                        Log.e("getHomeList: " , "onNext : ")
                        mView.loadHomeListSuccess(t!!)
                    }

                    override fun onError(e: Throwable) {
                        Log.e("getHomeList: " , "onError : " + e.toString())
                        mView.loadError(e.toString())
                    }

                    override fun onComplete() {
                        Log.e("getHomeList: " , "onComplete : ")
                        mView.loadComplete()
                    }
                })

    }

    override fun collect(id: Int, position: Int) {

        mView.loading()
        RetrofitHelper.instance.create(ApiService::class.java)
                .addCollectArticle(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<HomeListBean> {
                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: HomeListBean) {
                        mView.collectSuccess(t!! , position)
                    }

                    override fun onError(e: Throwable) {
                        mView.loadError(e.toString())
                    }

                    override fun onComplete() {
                        mView.loadComplete()
                    }
                })

    }

    override fun cancelCollect(id: Int, position: Int) {
        mView.loading()
        RetrofitHelper.instance.create(ApiService::class.java)
                .removeCollectArticle(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<HomeListBean> {
                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onNext(t: HomeListBean) {
                        mView.cancelCollectSuccess(t!!,position)
                    }

                    override fun onError(e: Throwable) {
                        mView.loadError(e.toString())
                    }

                    override fun onComplete() {
                        mView.loadComplete()
                    }
                })
    }


}