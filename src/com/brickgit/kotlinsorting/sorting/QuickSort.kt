package com.brickgit.kotlinsorting.sorting

import com.brickgit.kotlinsorting.utils.swap

/**
 * Created by Daniel Lin on 27/05/2017.
 */

object QuickSort: Sort {

    override fun sort(ints: IntArray): IntArray {
        sort(ints, 0, ints.lastIndex)
        return ints
    }

    private fun sort(ints: IntArray, from: Int, to: Int) {
        if (from > to) return

        var pivot = (to - from) / 2 + from
        val mid = ints[pivot]
        ints.swap(pivot, to)

        pivot = from
        for (index in from until to) {
            if (ints[index] < mid) {
                ints.swap(pivot++, index)
            }
        }
        ints.swap(pivot, to)

        sort(ints, from, pivot - 1)
        sort(ints, pivot + 1, to)
    }

    override fun getName() = "QuickSort"
}