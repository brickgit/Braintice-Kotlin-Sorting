package com.brickgit.kotlinsorting.sorting

/**
 * Created by Daniel Lin on 27/05/2017.
 */

object InsertionSort: Sort {
    override fun sort(ints: IntArray): IntArray {
        for (i in 1 .. ints.lastIndex) {
            val num = ints[i]

            var j = i - 1
            while (j >= 0 && ints[j] > num) {
                ints[j + 1] = ints[j]
                j--
            }
            ints[j + 1] = num
        }

        return ints
    }

    override fun getName() = "InsertionSort"
}