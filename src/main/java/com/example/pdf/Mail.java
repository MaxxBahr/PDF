package com.example.pdf;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Mail extends Application {

    @FXML
    private ChoiceBox<Integer> dayChoiceBox, monthChoiceBox, yearChoiceBox; // kdlaskdasd
    @FXML
    private TextArea textarea;

    public void initialize() {

        for (int i = 1; i <= 30; i++) {
            dayChoiceBox.getItems().add(i);
        }
        for (int z = 1; z <= 12; z++) {
            monthChoiceBox.getItems().add(z);
        }

        for (int k = 2023; k <= 2030; k++) {
            yearChoiceBox.getItems().add(k);
        }


    }

    public void selection() {
        LocalDate currentDate = LocalDate.now();
        int currentmonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        int currentYear = currentDate.getYear();

        if (monthChoiceBox.getItems().get(0) == currentmonth && yearChoiceBox.getItems().get(0) == currentYear) {
            for (int i = 0; i < currentDay; i++) {
                dayChoiceBox.getItems().remove(i);
            }
        } else {
            initialize();
        }
        if (yearChoiceBox.getItems().get(0) == currentYear) {
            for (int k = 0; k < currentmonth; k++) {
                monthChoiceBox.getItems().remove(k);
            }
        } else {
            initialize();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindowLaunchGUI.class.getResource("mail.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mail bearbeiten");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void speicherung() {
        String text = textarea.getText();
        System.out.println(text);
    }

}
