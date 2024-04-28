package com.example.mvparchpoc.modules.login.views.pages;

import com.example.mvparchpoc.base.Page;
import com.example.mvparchpoc.modules.login.dtos.LoginFormData;
import com.example.mvparchpoc.modules.login.presenters.LoginPagePresenter;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.*;

public class LoginPageImpl extends Page implements LoginPage {
    private static final String TEMPLATE = "modules/login/views/pages/LoginPage.fxml";
    private LoginPagePresenter presenter;
    private final Map<String, String> validationErrors = new HashMap<>();

    @FXML
    private VBox boxEmail, boxPassword;
    @FXML
    private TextField txtEmail, txtPassword;
    @FXML
    private Label lblEmail, lblPassword;
    @FXML
    private Button btnSubmit;

    public LoginPageImpl() {
        super(TEMPLATE);
    }

    @Override
    public void setPresenter(LoginPagePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addValidationError(String field, String errorMessage) {
        validationErrors.put(field, errorMessage);
        this.render();
    }

    @Override
    public void removeValidationError(String field) {
        validationErrors.remove(field);
        this.render();
    }

    @FXML
    private void initialize() {
        this.render();
        this.addEventListeners();
    }

    private void render() {
        Optional.ofNullable(validationErrors.get("email"))
                .ifPresentOrElse((message) -> {
                    lblEmail.setText(message);
                    lblEmail.setVisible(true);
                }, () -> lblEmail.setVisible(false));

        Optional.ofNullable(validationErrors.get("password"))
                .ifPresentOrElse((message) -> {
                    lblPassword.setText(message);
                    lblPassword.setVisible(true);
                }, () -> lblPassword.setVisible(false));
    }

    private void addEventListeners() {
        btnSubmit.setOnMouseClicked((_) -> {
            presenter.onSubmit(new LoginFormData(txtEmail.getText(), txtPassword.getText()));
        });
    }
}
