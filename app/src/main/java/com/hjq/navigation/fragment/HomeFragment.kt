package com.hjq.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 *
 * @Description:     Home模块
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:15
 *
 */
class HomeFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun initView(view: View) {
        super.initView(view)
        order_btn.setOnClickListener {
            findNavController().navigate(R.id.nav_homeFragment_to_orderFragment)
        }
        mine_btn.setOnClickListener {
            findNavController().navigate(R.id.nav_homeFragment_to_mineFragment)
        }
    }
}