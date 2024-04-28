package com.example.mvparchpoc.modules.login.presenters;

import com.example.mvparchpoc.modules.login.dtos.LoginFormData;
import com.example.mvparchpoc.modules.login.views.pages.LoginPage;
import com.example.mvparchpoc.router.Router;
import com.example.mvparchpoc.router.Routes;

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

        if (!formData.email().isEmpty() && !formData.password().isEmpty())
            Router.getInstance().navigateTo(Routes.TASKS);
    }
}
