package com.example.mvparchpoc.base;

import com.example.mvparchpoc.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public abstract class Page {
    private final String template;

    protected Page(String template) {
        this.template = template;
    }

    public final Scene createScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(template));
        fxmlLoader.setController(this);
        return new Scene(fxmlLoader.load());
    }
}
