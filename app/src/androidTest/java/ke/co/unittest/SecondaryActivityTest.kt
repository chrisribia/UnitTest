package ke.co.unittest


import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{
    @get: Rule
    val activityRule : ActivityScenarioRule<SecondaryActivity> = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView(){
        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_visibilityOfBackButton(){
        onView(withId(R.id.button2))
            .check(matches(isDisplayed()))
        onView(withId(R.id.textView2))
            .check(matches(isDisplayed()))
    }
    @Test
    fun test_TextDisplayedMatchesWithWhatIInteded(){
        onView(withId(R.id.button2))
            .check(matches( withText("back Home")))
        onView(withId(R.id.textView2))
            .check(matches(withText("Secondary activity")))
    }



}