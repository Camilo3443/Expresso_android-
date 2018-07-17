package com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Robot;

        import android.text.method.HideReturnsTransformationMethod;

        import com.example.heitorcolangelo.espressotests.InstrumentedTests.ScreenLogin.robots.LoginRobot;
        import com.example.heitorcolangelo.espressotests.R;
        import com.example.heitorcolangelo.espressotests.common.ScreenRobot;

        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.HINT_PASSWORD;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.HINT_USER_NAME;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.MSG_ERRO_LOGIN;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.TXT_HEADER;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.TXT_LOGIN;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.WRITE_EMAIL;
        import static com.example.heitorcolangelo.espressotests.TestNovoPageObjects.TestLogin.Constants.ConstantsLogin.WRITE_PASS;

public class LoginRobotCursoExpresso extends ScreenRobot {

                                                                                                              //ATRIBUIR UM NOME PARA OS ID'S DOS COMPONENTES DO APP
    public static final int BTN_LOGIN = R.id.login_button;
    public static final int CAMPO_SENHA = R.id.login_password;
    public static final int CAMPO_NOME = R.id.login_username;
    public static final int IMAGEM = R.id.login_image;


                                                                                                        //CRIAR A LOGICA CHAMANDO OS METODOS DA CLASSE DE SCREEN ROBOT

    public LoginRobotCursoExpresso checkHintForEmail() {                                //checkHintForEmail= ATRIBUIR UM NOME PARA O METODODO QUE VAI SER USADO DA SCREEN ROBOT
        checkViewHasHint(CAMPO_NOME, HINT_USER_NAME);
        return this;
    }

    public LoginRobotCursoExpresso checkHintForPassword() {
        checkViewHasHint(CAMPO_SENHA, HINT_PASSWORD);
        return this;
    }

    public LoginRobotCursoExpresso checkBoton() {
        checkIsDisplayed(BTN_LOGIN);
        return this;
    }
    public LoginRobotCursoExpresso checkImage() {
        checkIsDisplayed(IMAGEM);
        return this;

    }
    public LoginRobotCursoExpresso clckiLogin() {
        clickOnView(BTN_LOGIN);
        return this;

   //}public LoginRobotCursoExpresso clckOk() {
     //   clickOnView(BTN_LOGIN);
    //  return this;
    }

    public LoginRobotCursoExpresso writeEmail(){
        enterTextIntoView(CAMPO_NOME, WRITE_EMAIL )
                .closeKeyboard();
        return this;

    }
    public LoginRobotCursoExpresso writePass() {
        enterTextIntoView(CAMPO_SENHA, WRITE_PASS)
                .closeKeyboard();
        return this;

    } public LoginRobotCursoExpresso checkFieldError() {
        checkDialogWithTextIsDisplayed(MSG_ERRO_LOGIN)
               .closeKeyboard();
       return this;

    }
}
