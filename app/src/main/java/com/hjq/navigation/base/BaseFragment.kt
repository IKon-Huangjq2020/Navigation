package com.hjq.navigation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 *
 * @Description:     基类Fragment
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:15
 *
 */
abstract class BaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = getLayoutId()
        if (layoutId > 0) {
            return inflater.inflate(layoutId, container, false)
        }
        return null
    }

    abstract fun getLayoutId(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
        initData()
    }

    open fun initView(view: View) {}
    open fun initData() {}
}