package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import com.kaspersky.components.alluresupport.withAllureSupport

import screen.MainScreen
import screen.SecondScreen

import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest : TestCase() {
    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @get:Rule
    val secondActivityTestRule = ActivityTestRule(SecondActivity::class.java, true, false)

    @Test
    fun checkText() {
        println("Tested checkText!!!")

        activityTestRule.launchActivity(null)

        MainScreen {
            button.click()
        }

        SecondScreen {
            textField.isVisible()
            textField.hasText("Hi!")
        }
    }

    @Test
    fun secondActivityCheck() {
        println("Tested checkText!!!")
        secondActivityTestRule.launchActivity(null)

        SecondScreen {
            textField.isVisible()
            textField.hasText("Hi!")
        }
    }

    @Test
    fun failText() {
        println("Tested checkText!!!")
        activityTestRule.launchActivity(null)

        MainScreen {
            button.click()
        }

        SecondScreen {
            textField.isVisible()
            textField.hasText("1111")
        }
    }
}