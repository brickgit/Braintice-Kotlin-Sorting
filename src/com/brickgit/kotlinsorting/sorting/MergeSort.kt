package com.brickgit.kotlinsorting.sorting

import com.brickgit.kotlinsorting.utils.replaceBy

/**
 * Created by Daniel Lin on 27/05/2017.
 */

object MergeSort: Sort {
    override fun sort(ints: IntArray): IntArray {
        sort(ints, 0, ints.lastIndex)

        return ints
    }

    private fun sort(ints: IntArray, from: Int, to: Int) {
        if (from >= to) return

        val mid = (to - from) / 2 + from

        var startLeft = from
        val endLeft = mid
        var startRight = mid + 1
        val endRight = to

        sort(ints, startLeft, endLeft)
        sort(ints, startRight, endRight)

        val buffer = IntArray(to - from + 1)
        var index = 0

        while (startLeft <= endLeft && startRight <= endRight) {
            buffer[index++] =
                    if (ints[startLeft] <= ints[startRight])
                        ints[startLeft++]
                    else
                        ints[startRight++]
        }

        while (startLeft <= endLeft) buffer[index++] = ints[startLeft++]
        while (startRight <= endRight) buffer[index++] = ints[startRight++]

        ints.replaceBy(buffer, from)
    }

    override fun getName() = "MergeSort"
}