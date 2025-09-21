package de.hochschulebochum;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hallo JavaFX mit Maven! =D");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Basisprojekt");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
