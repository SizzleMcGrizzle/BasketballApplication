package me.p3074098.basketballapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationEntry extends Application {
    
    /*
    
    This method gives us a stage, which is basically the window of our application.
    
    With that, we can use the FXMLLoader to load our main application page, which is the application.fxml
    file. Then, with that object created, we can use the load() method, which returns a JavaFX Node (in this
    case it would be an AnchorPane, as that is application.fxml's parent component- an AnchorPane IS A Node)
    
    Then, we make a Scene object with that Node, set the title, disallow it from being resized, and add the scene to the stage.
    
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationEntry.class.getResource("controller/application.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Basketball Scorekeeper");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    /*
    
    This is how our application gets started, the launch() method does several things in the background including calling our start() method.
    
     */
    public static void main(String[] args) {
        launch();
    }
}