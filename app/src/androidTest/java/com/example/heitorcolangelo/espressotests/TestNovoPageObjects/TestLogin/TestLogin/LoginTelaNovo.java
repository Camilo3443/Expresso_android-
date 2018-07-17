package com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.TestLogin;

import android.os.Bundle;
import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Robot.LoginRobotCursoExpresso;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



public class LoginTelaNovo {


    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true); //aqui eu set a tela que vou abrir




    @Test
    public void ValidarTxtLogin() {
        //CHAMAR AS LOGICAS CRIADAS NA LOGIN TELA NOVO
        new LoginRobotCursoExpresso()
                .checkHintForEmail()
                .checkHintForPassword()
                .checkBoton()
                .checkImage();


    }
        @Test
                public void LoginTeste() throws InterruptedException{                           // throws = PERMITE CHAMAR FUNCOES DE OUTROS ROBOS SEM DAR ERRO, SE FICAR CINZA PODE APAGAR

            new LoginRobotCursoExpresso()
                    .writeEmail()
                    .writePass()
                    .clckiLogin()
                    .sleep(5);

        }
    @Test
    public void LoginTesteErroEmail() throws InterruptedException {

        new LoginRobotCursoExpresso()
                .writeEmail()
                .clckiLogin()
                .checkFieldError()
                .sleep(5);
    }





        }






