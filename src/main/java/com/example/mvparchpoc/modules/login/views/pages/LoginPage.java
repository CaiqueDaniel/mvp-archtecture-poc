package com.example.mvparchpoc.modules.login.views.pages;

import com.example.mvparchpoc.base.View;
import com.example.mvparchpoc.modules.login.presenters.LoginPagePresenter;

public interface LoginPage extends View<LoginPagePresenter> {
    void addValidationError(String field, String errorMessage);

    void removeValidationError(String field);
}
