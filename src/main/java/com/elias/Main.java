package com.elias;

import Controller.CustomerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * for this application we are gonna use the mvci, which means model view controller interactor.
     * the whole point is to follo the separation of concerns.
     *
     * @param args arguments from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(new CustomerController().getView()));
        stage.show();
    }
}