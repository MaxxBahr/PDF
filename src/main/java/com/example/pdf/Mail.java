package com.example.pdf;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

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

    @FXML
    private TextArea textarea;

    @FXML
    private void speicherung(){
        String text = textarea.getText();
        System.out.println(text);
    }

}
