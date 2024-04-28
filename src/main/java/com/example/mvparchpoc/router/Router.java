package com.example.mvparchpoc.router;

import com.example.mvparchpoc.base.Page;
import com.example.mvparchpoc.config.DependencyInjector;
import com.example.mvparchpoc.config.Renderer;

import javax.swing.JOptionPane;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Router {
    private final Map<Routes, Page> routes = new HashMap<>();
    private static Router instance;

    private Router() {
        routes.put(Routes.LOGIN, (Page) DependencyInjector.getInstance().loginPage());
    }

    public void navigateTo(Routes path) {
        Optional<Page> page = Optional.ofNullable(routes.get(path));
        if (page.isEmpty()) return;
        this.handlePageChange(page.get());
    }

    private void handlePageChange(Page page) {
        try {
            Renderer.getInstance().render(page);
        } catch (Exception exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possivel carregar essa página");
        }
    }

    public static Router getInstance() {
        if (instance == null)
            instance = new Router();
        return instance;
    }
}

