package com.example.jaco_cli;

import com.example.jaco_cli.datafetch.DataProviderService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.DataInput;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
       // Scene scene = new Scene(new StackPane(new Label("JavaFX")), 200,200);
        stage.setTitle("JaCo");
        scene.setFill(Color.DARKSLATEGREY);
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/Images/JaCoIcon.png")));
        stage.setScene(scene);
        stage.show();
       // new DataProviderService().getData("India");
    }

    public static void main(String[] args) {
        launch();
    }
}