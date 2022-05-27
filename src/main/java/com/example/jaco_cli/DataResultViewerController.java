package com.example.jaco_cli;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DataResultViewerController {
    @FXML
    private Stage bkstage;
    @FXML
    private Label country, totalCases,todayCases,deaths,todayDeaths,recovered,active,critical,casesPerOneMillion,deathsPerOneMillion,totalTests,testsPerOneMillion;

    public void showData(String[] str){
        if(str[0].substring(11,str[0].length()-1).equals("\"World")){
            country.setText(str[0].substring(12,str[0].length()-1));
            testsPerOneMillion.setText(str[11].substring(21,str[11].length()-1));
        }
        else{
            country.setText(str[0].substring(11,str[0].length()-1));
            testsPerOneMillion.setText(str[11].substring(21));
        }
        totalCases.setText(str[1].substring(8));
        todayCases.setText(str[2].substring(13));
        deaths.setText(str[3].substring(9));
        todayDeaths.setText(str[4].substring(14));
        recovered.setText(str[5].substring(12));
        active.setText(str[6].substring(9));
        critical.setText(str[7].substring(11));
        casesPerOneMillion.setText(str[8].substring(21));
        deathsPerOneMillion.setText(str[9].substring(22));
        totalTests.setText(str[10].substring(13));

    }
    public void goBack(ActionEvent event)throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("index.fxml"));
        bkstage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        bkstage.setScene(scene);
        bkstage.show();
    }
}
