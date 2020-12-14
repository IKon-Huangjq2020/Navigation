package com.hjq.navigation

/**
 *
 * @Description:     类作用描述
 * @Author:         hjq
 * @CreateDate:     2020/12/14 13:52
 *
 */
object nav_graph {
    const val id = 1 // graph id

    object dest {
        const val other = 2
        const val other_detail = 3
        const val custom_dest_id = 7
    }

    object action {
        const val to_other_detail = 4
    }

    object args {
        const val plant_id = "plantId"
    }
}