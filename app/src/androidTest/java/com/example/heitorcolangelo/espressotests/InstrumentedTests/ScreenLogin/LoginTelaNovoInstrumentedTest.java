package com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin;

import android.support.test.rule.ActivityTestRule;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.constants.LoginConstants;
import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.robots.LoginRobot;
import com.example.heitorcolangelo.espressotests.common.ScreenRobot;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.bouncycastle.asn1.cmp.PKIStatus.waiting;


public class LoginTelaNovoInstrumentedTest {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true); //aqui eu set a tela que vou abrir

    @Test   //declarando os testes novos
    public void LoginWithSuccess() throws Exception {
        new LoginRobot()
                .writeEmail(LoginConstants.EMAIL_SUCCESS)
                .writePassword(LoginConstants.PASS_SUCCESS)
                .pressContinue()
                .sleep(5);
    }

    @Test
    public void VerifyElements() throws Exception {
        new LoginRobot()
                .checkButtonLoginIsClickable()
                .checkButtonIsDisplayed()
                .checkHintForEmailField()
                .checkHintForPasslField();
    }

   @Test
    public void ClickContinueButton() throws Exception {
        new LoginRobot()
                .pressContinue()
                .assertErrorDialog()
                .pressBack()
                .writeEmail(LoginConstants.EMAIL_SUCCESS)
                .pressContinue()
                .assertErrorDialog()
                .pressBack()
                .writePassword(LoginConstants.PASS_SUCCESS)
                .pressContinue();

    }

        @Test
        public void LogingWithError () throws Exception{
        new LoginRobot()
                .writeEmail(LoginConstants.EMAIL_ERROR)
                .writePassword(LoginConstants.PASS_ERROR)
                .closeKeyboard()
                .pressContinue();




    }
}
