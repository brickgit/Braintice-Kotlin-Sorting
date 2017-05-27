package com.brickgit.brainticesorting.sorting

import com.brickgit.brainticesorting.utils.swap

/**
 * Created by Daniel Lin on 26/05/2017.
 */

object BubbleSort: Sort {
    override fun sort(ints: IntArray): IntArray {
        for (i in ints.lastIndex downTo 0) {
            var swapped = false
            for (j in 0 until i) {
                if (ints[j] > ints[j + 1]) {
                    ints.swap(j, j + 1)
                    swapped = true
                }
            }
            if (!swapped) break
        }

        return ints
    }

    override fun getName() = "BubbleSort"
}