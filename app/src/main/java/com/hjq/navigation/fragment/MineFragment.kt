package com.hjq.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_mine.*

/**
 *
 * @Description:     我的模块
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:22
 *
 */
class MineFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_mine

    override fun initView(view: View) {
        super.initView(view)
        mine_top_bar.addBackBtnListener(View.OnClickListener {
            findNavController().popBackStack()
        })
    }
}