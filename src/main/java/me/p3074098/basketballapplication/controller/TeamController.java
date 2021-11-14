package me.p3074098.basketballapplication.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TeamController extends AnchorPane {
    
    
    /**
     * The @FXML annotation will let JavaFX know that this is a
     * component in our team.fxml file that has an fx:id
     * <p>
     * JavaFX will automatically assign a value to these variables,
     * to which we can then use in our program
     */
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
    
    /**
     * This constructor will make a new FXMLLoader object (necessary for loading a .fxml file)
     * <p>
     * Then, it will set the controller class to this class, so we can use all the child
     * elements of the team.fxml component tree, giving us access to the buttons, text labels, etc.
     * <p>
     * After, we will use the load() method from FXMLLoader to load it, which returns a Node, but in our case,
     * given that this class extends AnchorPane, it will return an AnchorPane (but we can just make the type a Node
     * because AnchorPane IS A Node).
     * <p>
     * Then, we will apply listeners to the buttons so when they are clicked they will perform specific actions.
     */
    public TeamController() {
        super();
        
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("team.fxml"));
            
            loader.setController(this);
            
            Node n = loader.load();
            
            this.getChildren().add(n);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        setListeners();
    }
    
    /**
     * In this method, we add event handlers to each of our buttons. In these handlers, we
     * are listening to the ActionEvent.ACTION event, which is the event called when a
     * button is clicked,
     * <p>
     * After specifying which event in each handler, we add the actual logic for when a
     * button is clicked. This uses a lambda, which means that we define an event variable
     * name, in this case event, use the "->" convention, and put curly brackets to inline a
     * method, then we fill in the logic. This is identical to adding event handlers in javascript
     * using arrow functions.
     */
    private void setListeners() {
        oneButton.addEventHandler(ActionEvent.ACTION, event -> {
            score += 1;
            render();
        });
        
        twoButton.addEventHandler(ActionEvent.ACTION, event -> {
            score += 2;
            render();
        });
        
        threeButton.addEventHandler(ActionEvent.ACTION, event -> {
            score += 3;
            render();
        });
        
        resetButton.addEventHandler(ActionEvent.ACTION, event -> {
            score = 0;
            
            render();
        });
    }
    
    public void render() {
        scoreLabel.setText(String.valueOf(score));
    }
}
