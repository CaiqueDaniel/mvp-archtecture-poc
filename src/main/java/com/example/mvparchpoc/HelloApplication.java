package com.example.mvparchpoc;

import com.example.mvparchpoc.router.Router;
import com.example.mvparchpoc.router.Routes;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Router.getInstance().navigateTo(Routes.LOGIN);
    }

    public static void main(String[] args) {
        launch();
    }
}