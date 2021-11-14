package me.p3074098.basketballapplication.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TeamController extends AnchorPane {
    
    
    @FXML
    private TextField nameTextInput;
    
    @FXML
    private Label scoreLabel;
    
    @FXML
    private Button oneButton;
    
    @FXML
    private Button twoButton;
    
    @FXML
    private Button threeButton;
    
    @FXML
    private Button resetButton;
    
    @FXML
    private AnchorPane anchor;
    
    private int score = 0;
    
    @FXML
    private void onScoreButtonClick(ActionEvent e) {
        Button source = (Button) e.getSource();
        
        int add;
        if (source.equals(oneButton))
            add = 1;
        else if (source.equals(twoButton))
            add = 2;
        else
            add = 3;
        
        score += add;
        
        render();
    }
    
    @FXML
    private void onResetButtonClick(ActionEvent e) {
        score = 0;
        
        render();
    }
    
    public void render() {
        scoreLabel.setText(String.valueOf(score));
    }
    
    public AnchorPane getAnchor() {
        return anchor;
    }
    
    
}
