package com.hjq.navigation.fragment

import android.annotation.SuppressLint
import android.view.View
import androidx.navigation.*
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.fragment
import com.hjq.navigation.R
import com.hjq.navigation.base.BaseFragment
import com.hjq.navigation.nav_graph
import kotlinx.android.synthetic.main.fragment_order_detail.*

/**
 *
 * @Description:     订单详情页
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:24
 *
 */
class OrderDetailFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_order_detail

    @SuppressLint("RestrictedApi")
    override fun initView(view: View) {
        super.initView(view)
        detail_top_bar.addBackBtnListener(View.OnClickListener {
            findNavController().popBackStack()
        })



        intent_to_other.setOnClickListener {

            findNavController().apply {
                val newGraph = createGraph(nav_graph.id, nav_graph.dest.other) {
                    fragment<OtherFragment>(nav_graph.dest.other) {
                        label = "OtherFragment"
                        action(nav_graph.action.to_other_detail) {
                            destinationId = nav_graph.dest.other_detail
                            navOptions {
                                anim {
                                    enter = R.anim.slide_in_right
                                    exit = R.anim.slide_out_left
                                    popEnter = R.anim.slide_in_left
                                    popExit = R.anim.slide_out_right
                                }
                            }
                        }
                    }
                    fragment<Other2Fragment>(nav_graph.dest.other_detail) {
                        label = "Other2Fragment"
                    }
                }

                graph.addAll(newGraph)
            }
            val builder = NavOptions.Builder().setLaunchSingleTop(true)
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right).build()
            findNavController().navigate(
                nav_graph.dest.other,
                null,
                builder
            )

        }
    }
}