package com.example.myapplication

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        println(reverseSeq(10).joinToString())
    }

    fun reverseSeq(n: Int): Array<Int> {
        var array = arrayOf(n)
        for (i in n downTo 1) {
            array += i
        }
        return array
    }
}