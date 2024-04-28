package com.example.mvparchpoc.config;

import com.example.mvparchpoc.base.Page;
import javafx.stage.Stage;

import java.io.IOException;

public class Renderer {
    private final Stage stage = new Stage();
    private static Renderer instance;

    public void render(Page page) throws IOException {
        stage.setScene(page.createScene());
        stage.show();
    }

    public static Renderer getInstance() {
        if (instance == null)
            instance = new Renderer();
        return instance;
    }
}
