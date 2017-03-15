package com.ciro.app.controller;

import com.ciro.app.Main;
import javafx.stage.Stage;

public class SecondController {
    private Main main;
    private Stage secondaryStage;

    public void setMain(Main main, Stage secondaryStage) {
        this.main = main;
        this.secondaryStage = secondaryStage;
    }

    public void goBack(){
        System.out.println("Go back");
        secondaryStage.close();
    }
}
