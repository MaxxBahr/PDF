package com.example.pdf;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainWindowControls {
    @FXML
    protected void knopfDruecken() throws Exception {
        Mail mailApp = new Mail();
        mailApp.start(new Stage());
    }

}