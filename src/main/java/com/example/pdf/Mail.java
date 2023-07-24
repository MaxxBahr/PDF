package com.example.pdf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mail extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindowLaunchGUI.class.getResource("mail.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mail bearbeiten");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
