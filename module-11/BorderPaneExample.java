/*
 BorderPaneExample.java
 Demonstrates how to use the JavaFX BorderPane layout.
 The BorderPane layout arranges nodes in five regions:
 top, bottom, left, right, and center.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {

        // Create BorderPane layout
        BorderPane pane = new BorderPane();

        // Place nodes in the five regions
        pane.setTop(new Label("Top Region"));
        pane.setBottom(new Label("Bottom Region"));
        pane.setLeft(new Button("Left Button"));
        pane.setRight(new Button("Right Button"));
        pane.setCenter(new Label("Center Content Area"));

        // Create scene
        Scene scene = new Scene(pane, 400, 300);

        stage.setTitle("JavaFX BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
