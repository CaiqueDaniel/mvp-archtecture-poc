package com.example.mvparchpoc.config;

import com.example.mvparchpoc.modules.login.presenters.LoginPagePresenterImpl;
import com.example.mvparchpoc.modules.login.views.pages.LoginPage;
import com.example.mvparchpoc.modules.login.views.pages.LoginPageImpl;
import com.example.mvparchpoc.modules.tasks.presenters.TaskPagePresenterImpl;
import com.example.mvparchpoc.modules.tasks.views.pages.TaskPage;
import com.example.mvparchpoc.modules.tasks.views.pages.TaskPageImpl;
import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class DependencyInjector {
    private static DependencyInjector instance;

    @Getter
    private final LoginPage loginPage = new LoginPageImpl();

    @Getter
    private final TaskPage taskPage = new TaskPageImpl();

    private DependencyInjector() {
        loginPage.setPresenter(new LoginPagePresenterImpl(loginPage));
        taskPage.setPresenter(new TaskPagePresenterImpl(taskPage));
    }

    public static DependencyInjector getInstance() {
        if (instance == null)
            instance = new DependencyInjector();
        return instance;
    }
}
