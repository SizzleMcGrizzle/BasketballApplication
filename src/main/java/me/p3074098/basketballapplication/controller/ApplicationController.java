package me.p3074098.basketballapplication.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {
    
    @FXML
    AnchorPane applicationAnchor;
    
    @FXML
    private VBox boxOne;
    
    @FXML
    private VBox boxTwo;
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addChild(boxOne);
        addChild(boxTwo);
    }
    
    private void addChild(VBox to) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("team.fxml"));
        
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        TeamController teamController = fxmlLoader.getController();
        
        to.getChildren().add(teamController.getAnchor());
    }
}