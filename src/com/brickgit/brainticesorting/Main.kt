package com.brickgit.brainticesorting

/**
 * Created by Daniel Lin on 25/05/2017.
 */

import com.brickgit.brainticesorting.sorting.*
import java.util.*
import kotlin.system.measureNanoTime


fun main(args: Array<String>) {

    val sortings = listOf(BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort)

    val original = prepare()

    for (sorting in sortings) {
        print("\n<${sorting.getName()}> is running")

        val times = 100

        var nSecs: Long = 0
        for (i in 1 .. times) {
            printProgress(i)
            var data = original.copyOf()
            nSecs += measureNanoTime { data = sorting.sort(data) }
        }

        println("\nTime = ${nSecs / 1000000.0} ms")
    }
}

private fun prepare(): IntArray {
    val size = 10000

    val random = Random()
    val seed = 10000

    val ints = IntArray(size)
    for (i in 0 .. ints.lastIndex) {
        ints[i] = (random.nextInt(seed))
    }

    return ints
}

private fun printProgress(index: Int) {
    if (index % 10 == 0) print(".")
}
