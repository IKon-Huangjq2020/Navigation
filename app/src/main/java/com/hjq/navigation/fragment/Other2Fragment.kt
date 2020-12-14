package com.hjq.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_other_detail.*

/**
 *
 * @Description:     Home模块
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:15
 *
 */
class Other2Fragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_other_detail

    override fun initView(view: View) {
        super.initView(view)

        order_top_bar.addBackBtnListener(View.OnClickListener {
            findNavController().popBackStack()
        })

    }
}