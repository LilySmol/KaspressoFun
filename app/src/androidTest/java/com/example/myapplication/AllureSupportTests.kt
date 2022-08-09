package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import com.kaspersky.components.alluresupport.withAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import screen.MainScreen
import screen.SecondScreen

class AllureSupportTests : TestCase (
    kaspressoBuilder = Kaspresso.Builder.withAllureSupport() ){

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @get:Rule
    val secondActivityTestRule = ActivityTestRule(SecondActivity::class.java, true, false)

    @Test
    fun checkText() = run {
        step("Launch main activity") {
            activityTestRule.launchActivity(null)
        }

        step("Main button click") {
            MainScreen {
                button.click()
            }
        }

        step("Second screen is open") {
            SecondScreen {
                textField.isVisible()
                textField.hasText("Hi!")
            }
        }
    }
}