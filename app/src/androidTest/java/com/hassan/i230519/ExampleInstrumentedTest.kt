package com.hassan.i230519

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.hassan.i230519", appContext.packageName)
    }
}
/*
* @RunWith(AndroidJUnit4::class)
class NavigationTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun testNavigationToMainActivity() {
        // Click login button
        onView(withId(R.id.loginBtn)).perform(click())

        // Check that MainActivity's title text is displayed
        onView(withId(R.id.mainTitle))
            .check(matches(isDisplayed()))
    }
}
*/

/*
* @RunWith(AndroidJUnit4::class)
class ButtonClickTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButtonClickUpdatesText() {
        // Perform button click
        onView(withId(R.id.updateBtn)).perform(click())

        // Check that text is updated
        onView(withId(R.id.resultText))
            .check(matches(withText("Updated Successfully")))
    }
}
*/