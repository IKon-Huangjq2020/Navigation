package com.hjq.navigation.weight

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.hjq.navigation.R
import kotlinx.android.synthetic.main.nav_view_top_bar.view.*

/**
 *
 * @Description:     类作用描述
 * @Author:         hjq
 * @CreateDate:     2020/12/3 15:42
 *
 */
class NavTopBar constructor(
    context: Context,
    attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private var mTitleName: String? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.nav_view_top_bar, this, true)
        attrs?.let {
            val array =
                getContext().obtainStyledAttributes(attrs, R.styleable.NavTopBar, 0, 0)
            mTitleName = array.getString(R.styleable.NavTopBar_top_bar_title_text)
            array.recycle()
        }

        if (!mTitleName.isNullOrEmpty()) {
            top_bar_title.text = mTitleName
        }

    }

    fun addBackBtnListener(listener: View.OnClickListener) {
        back_btn.visibility = View.VISIBLE
        back_btn.setOnClickListener(listener)
    }
}