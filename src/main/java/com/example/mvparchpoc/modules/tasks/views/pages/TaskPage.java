package com.example.mvparchpoc.modules.tasks.views.pages;

import com.example.mvparchpoc.base.View;
import com.example.mvparchpoc.modules.tasks.presenters.TaskPagePresenter;

import java.util.List;

public interface TaskPage extends View<TaskPagePresenter> {
    void setList(List<String> tasks);
}
