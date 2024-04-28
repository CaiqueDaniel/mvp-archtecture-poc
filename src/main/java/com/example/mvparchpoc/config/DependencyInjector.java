package com.example.mvparchpoc.config;

import com.example.mvparchpoc.modules.login.presenters.LoginPagePresenterImpl;
import com.example.mvparchpoc.modules.login.views.pages.LoginPage;
import com.example.mvparchpoc.modules.login.views.pages.LoginPageImpl;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class DependencyInjector {
    private static DependencyInjector instance;

    @Getter
    private final LoginPage loginPage = new LoginPageImpl();

    private DependencyInjector() {
        loginPage.setPresenter(new LoginPagePresenterImpl(loginPage));
    }

    public static DependencyInjector getInstance() {
        if (instance == null)
            instance = new DependencyInjector();
        return instance;
    }
}
