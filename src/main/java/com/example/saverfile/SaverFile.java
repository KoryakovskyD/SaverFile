package com.example.saverfile;

import com.example.services.SaverDispatcher;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SaverFile extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = new BorderPane();

        MenuBar menuBar = new MenuBar();
        root.setTop(menuBar);
        Menu menuFile = new Menu("File");
        menuBar.getMenus().add(menuFile);
        Menu menuSettings = new Menu("Settings");
        menuBar.getMenus().add(menuSettings);
        Menu menuProperties = new Menu("Properties");
        menuProperties.setOnAction(e -> {
            PropAppStage propAppStage = new PropAppStage();
        });
        menuSettings.getItems().add(menuProperties);

        TextArea textArea = new TextArea();
        root.setCenter(textArea);

        Button btn = new Button();
        btn.setText("Save");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SaverDispatcher saverDispatcher = new SaverDispatcher();
                saverDispatcher.saveFile(textArea.getText());
            }
        });
        root.setBottom(btn);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}