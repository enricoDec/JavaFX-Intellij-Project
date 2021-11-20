package com.enricodec;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL base = getClass().getClassLoader().getResource("");
        String rootFxmlFileRelative = "view/root.fxml";
        URL rootView = getClass().getResource(rootFxmlFileRelative);
        if (rootView == null) {
            assert base != null;
            System.err.println("Root View fxml file could not be found at: " + base.getPath() + rootFxmlFileRelative);
            System.exit(1);
        }
        Parent root = FXMLLoader.load(rootView);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
