package me.p3074098.basketballapplication.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;


/**
 * For now, we don't need to do anything in this class because all of
 * our logic is taken care of in the {@link TeamController} class.
 * <p>
 * In the future, maybe we want to add a completeGame() method, we could
 * keep track of each of our TeamControllers in this class and then calculate the
 * winner based off of their score.
 */
public class ApplicationController {
    @FXML
    AnchorPane applicationAnchor;
}