package com.example.heitorcolangelo.espressotests.UiTests.ListOfView;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ListOfUsers.ListInstrumentedTest;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.LoginTelaNovoInstrumentedTest;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ListUiTest {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Test
    public void ScrollInListOfUsers() throws Exception {
        new LoginTelaNovoInstrumentedTest().LoginWithSuccess();
        new ListInstrumentedTest().ScrollInList();

    }
}
