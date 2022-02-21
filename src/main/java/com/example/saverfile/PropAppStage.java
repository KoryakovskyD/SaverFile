package com.example.saverfile;

import com.example.propPacket.PropApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PropAppStage extends Stage {
    public PropAppStage() {
        init();
    }

    private void init() {
        GridPane root = new GridPane();

        Label label = new Label("File extension");
        root.add(label, 0, 0);
        ObservableList<String> observableList = FXCollections.observableArrayList("txt", "doc");
        ChoiceBox<String> choiceBox = new ChoiceBox<>(observableList);
        root.add(choiceBox, 1,0);
        choiceBox.setOnAction(e -> {
            PropApp.setValue("FormatFile", choiceBox.getValue());
        });

        Scene scene = new Scene(root, 300, 250);

        setTitle("Settings");
        setScene(scene);
        show();
    }
}
