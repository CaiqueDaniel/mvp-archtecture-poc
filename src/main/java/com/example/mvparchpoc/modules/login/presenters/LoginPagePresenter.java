package com.example.mvparchpoc.modules.login.presenters;

import com.example.mvparchpoc.modules.login.dtos.LoginFormData;

public interface LoginPagePresenter {
    void onSubmit(LoginFormData formData);
}
