package com.example.jaco_cli;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;

public class HelloController {
    @FXML
    private Stage sstage;

    @FXML
    protected void onHelloButtonClick(ActionEvent event)throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("index.fxml"));
        sstage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        sstage.setScene(scene);
        sstage.show();
    }

    public void OpenDev()throws Exception{
        Desktop.getDesktop().browse(new URI("https://github.com/JaCo-FOSS"));
    }
    public void About(ActionEvent event)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("About.fxml"));
        sstage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        sstage.setScene(scene);
        sstage.show();
    }
}