module com.example.mvparchpoc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires lombok;

    opens com.example.mvparchpoc.modules.login.views.pages to javafx.fxml;
    exports com.example.mvparchpoc;
}