package com.example.j208_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/** Main application: loads the Scene Builder layout and displays the calculator. */
public class J208_1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Find the FXML layout in the same resource location as this class.
        FXMLLoader loader = new FXMLLoader(J208_1.class.getResource("J208_1.fxml"));
        // Build the JavaFX scene using the layout defined in Scene Builder.
        Scene scene = new Scene(loader.load());
        stage.setTitle("MenuDemo - Simple Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        // Launch JavaFX, which calls start() after initialization.
        launch(args);
    }
}
