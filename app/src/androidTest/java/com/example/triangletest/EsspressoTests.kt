package com.example.triangletest


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class EsspressoTests {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun canGetEquilateralTriangle() {

        onView(withId(R.id.edtTextNumberAB)).perform(ViewActions.typeText("3"))
        onView(withId(R.id.edtTextNumberBC)).perform(ViewActions.typeText("3"))
        onView(withId(R.id.edtTextNumberCA)).perform(ViewActions.typeText("3"))
        onView(withId(R.id.btnUpdateTriangle)).perform(click())
        onView(withText("The Triangle is: Equilateral")).check(matches(isDisplayed()))
    }

    @Test
    fun canGetIsocelesTriangle() {

        onView(withId(R.id.edtTextNumberAB)).perform(ViewActions.typeText("2"))
        onView(withId(R.id.edtTextNumberBC)).perform(ViewActions.typeText("2"))
        onView(withId(R.id.edtTextNumberCA)).perform(ViewActions.typeText("3"))
        onView(withId(R.id.btnUpdateTriangle)).perform(click())
        onView(withText("The Triangle is: Isoceles")).check(matches(isDisplayed()))
    }

    @Test
    fun canGetScaleneTriangle() {

        onView(withId(R.id.edtTextNumberAB)).perform(ViewActions.typeText("1"))
        onView(withId(R.id.edtTextNumberBC)).perform(ViewActions.typeText("2"))
        onView(withId(R.id.edtTextNumberCA)).perform(ViewActions.typeText("3"))
        onView(withId(R.id.btnUpdateTriangle)).perform(click())
        onView(withText("The Triangle is: Scalene")).check(matches(isDisplayed()))
    }
}
