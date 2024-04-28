package com.example.mvparchpoc.config;

import com.example.mvparchpoc.base.Page;
import javafx.stage.Stage;

import java.io.IOException;

public class Renderer {
    private Stage stage;
    private static Renderer instance;

    public void render(Page page) throws IOException {
        if (stage != null) stage.close();
        stage = new Stage();
        stage.setScene(page.createScene());
        stage.show();
    }

    public static Renderer getInstance() {
        if (instance == null)
            instance = new Renderer();
        return instance;
    }
}
