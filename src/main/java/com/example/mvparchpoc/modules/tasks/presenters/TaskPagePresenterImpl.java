package com.example.mvparchpoc.modules.tasks.presenters;

import com.example.mvparchpoc.modules.tasks.views.pages.TaskPage;
import com.example.mvparchpoc.router.Router;
import com.example.mvparchpoc.router.Routes;

import java.util.ArrayList;
import java.util.List;

public class TaskPagePresenterImpl implements TaskPagePresenter {
    private final TaskPage page;

    public TaskPagePresenterImpl(TaskPage page) {
        this.page = page;
    }

    @Override
    public void fetchTasks() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 400; i++)
            list.add(STR."Teste \{i}");

        page.setList(list);
    }

    @Override
    public void logout() {
        Router.getInstance().navigateTo(Routes.LOGIN);
    }
}
