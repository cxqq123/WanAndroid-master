package com.example.icxwanandroid.view

import com.example.icxwanandroid.bean.HotBean

/**
 * desc：
 * author：Created by xusong on 2019/3/11 15:50.
 */

interface HotView : IBaseView {

    fun getHotKeySuc(result: HotBean)

    fun getCommonUse(result: HotBean)
}