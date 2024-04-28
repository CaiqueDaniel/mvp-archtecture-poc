package com.example.mvparchpoc.modules.tasks.views.pages;

import com.example.mvparchpoc.base.Page;
import com.example.mvparchpoc.modules.tasks.presenters.TaskPagePresenter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.List;

public class TaskPageImpl extends Page implements TaskPage {
    private TaskPagePresenter presenter;
    private static final String TEMPLATE = "modules/tasks/views/pages/TaskPage.fxml";

    @FXML
    private ListView<String> listTasks;
    @FXML
    private Button btnLogout;

    public TaskPageImpl() {
        super(TEMPLATE);
    }

    @Override
    public void setPresenter(TaskPagePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setList(List<String> tasks) {
        this.listTasks.getItems().clear();
        this.listTasks.getItems().addAll(tasks);
    }

    @FXML
    private void initialize() {
        presenter.fetchTasks();
        addEventListener();
    }

    private void addEventListener() {
        btnLogout.setOnMouseClicked((_) -> presenter.logout());
    }
}
