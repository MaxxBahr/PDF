package com.example.pdf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowLaunchGUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindowLaunchGUI.class.getResource("mainwindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Medi Vault");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}