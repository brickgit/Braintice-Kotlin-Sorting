package com.brickgit.kotlinsorting.sorting

import com.brickgit.kotlinsorting.utils.swap

/**
 * Created by Daniel Lin on 26/05/2017.
 */

object SelectionSort: Sort {

    override fun sort(ints: IntArray): IntArray {
        for (i in 0 .. ints.lastIndex) {
            var min = i
            for (j in i + 1 .. ints.lastIndex) {
                if (ints[j] < ints[min]) {
                    min = j
                }
            }
            ints.swap(i, min)
        }

        return ints
    }

    override fun getName() = "SelectionSort"
}