package com.hjq.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_order.*

/**
 *
 * @Description:     订单模块
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:19
 *
 */
class OrderFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_order

    override fun initView(view: View) {
        super.initView(view)

        order_top_bar.addBackBtnListener(View.OnClickListener {
            findNavController().popBackStack()
        })

        order_detail_btn.setOnClickListener {
            findNavController().navigate(R.id.nav_orderFragment_to_orderDetailFragment)
        }


    }
}