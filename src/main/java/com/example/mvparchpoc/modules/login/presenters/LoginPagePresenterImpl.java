package com.example.mvparchpoc.modules.login.presenters;

import com.example.mvparchpoc.modules.login.dtos.LoginFormData;
import com.example.mvparchpoc.modules.login.views.pages.LoginPage;

public class LoginPagePresenterImpl implements LoginPagePresenter {
    private final LoginPage page;

    public LoginPagePresenterImpl(LoginPage page) {
        this.page = page;
    }

    @Override
    public void onSubmit(LoginFormData formData) {
        if (formData.email().isEmpty())
            page.addValidationError("email", "Campo obrigatório");
        else page.removeValidationError("email");

        if (formData.password().isEmpty())
            page.addValidationError("password", "Campo obrigatório");
        else page.removeValidationError("password");

    }
}
