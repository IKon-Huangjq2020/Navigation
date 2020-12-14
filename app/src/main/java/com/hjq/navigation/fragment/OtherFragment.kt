package com.hjq.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import com.hjq.navigation.nav_graph
import kotlinx.android.synthetic.main.fragment_other.*

/**
 *
 * @Description:     Other模块
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:15
 *
 */
class OtherFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_other

    override fun initView(view: View) {
        super.initView(view)
        other_top_bar.addBackBtnListener(View.OnClickListener {
            findNavController().popBackStack()
        })
        other_detail.setOnClickListener {
            findNavController().navigate(nav_graph.action.to_other_detail)
        }

    }
}