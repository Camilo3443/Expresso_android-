//package com.example.heitorcolangelo.espressotests.mocks.testesNovosPadraoExpresso;

import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;


import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class TesteNovo2PadraoExpresso extends ScreenRobot {
   @Rule
   public ActivityTestRule<LoginActivity>
           mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

   @Test
    public void AguardarTelaLogin() throws InterruptedException{    //consumir coisas de outras classes sem dar erro
//PADRÃO EXPRESSO
        Thread.sleep(50000);
        onView(withId(R.id.login_username)).check(matches(isDisplayed()));
        onView(withId(R.id.login_password)).check(matches(isDisplayed()));
        onView(withId(R.id.login_button)).check(matches(isDisplayed()));
        onView(withId(R.id.login_image)).check(matches(isDisplayed()));
        onView(withId(R.id.login_button)).check(matches(isClickable()));
        onView(withId(R.id.login_username)).check(matches(withHint(R.string.login_username)));// VERIFICA OQ ESTA NO HINT DO CAMPO
        onView(withId(R.id.login_password)).check(matches(withHint(R.string.login_password)));
        onView(withId(R.id.login_button)).perform(click());


    }


}
