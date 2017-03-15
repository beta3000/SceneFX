package com.ciro.app;

import com.ciro.app.controller.ChangeController;
import com.ciro.app.controller.FirstController;
import com.ciro.app.controller.SecondController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        firstWindow();
    }

    public void firstWindow(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/FirstView.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();

            Scene scene = new Scene(anchorPane);

            FirstController firstController = fxmlLoader.getController();
            firstController.setMain(this);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void secondWindow(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/SecondView.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();

            Scene scene = new Scene(anchorPane);
            Stage secondaryStage = new Stage();

            SecondController secondController = fxmlLoader.getController();
            secondController.setMain(this, secondaryStage);

            secondaryStage.initModality(Modality.APPLICATION_MODAL);

            secondaryStage.setScene(scene);
            secondaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeWindow() {

        try {

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/ChangeView.fxml"));

            AnchorPane pane = loader.load();

            Scene scene = new Scene(pane);

            ChangeController changeController = loader.getController();

            changeController.setMain(this);

            primaryStage.setScene(scene);

            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
