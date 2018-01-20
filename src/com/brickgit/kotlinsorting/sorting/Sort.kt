package com.brickgit.kotlinsorting.sorting

/**
 * Created by Daniel Lin on 26/05/2017.
 */

interface Sort {
    fun sort(ints: IntArray): IntArray
    fun getName(): String
}