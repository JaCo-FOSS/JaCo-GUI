package com.example.jaco_cli;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;


public class AboutController {
    public void OpenGNULink()throws Exception{
        Desktop.getDesktop().browse(new URI("https://www.gnu.org/licenses/gpl-3.0.html"));
    }
    public void OpenDev()throws Exception{
        Desktop.getDesktop().browse(new URI("https://github.com/JaCo-FOSS"));
    }

    public void goBackButton(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Stage sstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        sstage.setScene(scene);
        sstage.show();
    }
}
