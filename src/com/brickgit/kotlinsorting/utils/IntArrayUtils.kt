package com.brickgit.kotlinsorting.utils

/**
 * Created by Daniel Lin on 26/05/2017.
 */

fun IntArray.print() {
    println()
    this.forEach {
        print("$it ")
    }
}

fun IntArray.swap(from: Int, to: Int) {
    if (from == to) return
    if (from !in 0..lastIndex) return
    if (to !in 0..lastIndex) return

    val temp = get(from)
    set(from, get(to))
    set(to, temp)
}

fun IntArray.replaceBy(source: IntArray, from: Int) {
    if (from < 0) return

    var index = from
    var indexSource = 0

    while (index <= lastIndex && indexSource <= source.lastIndex) {
        set(index++, source[indexSource++])
    }
}