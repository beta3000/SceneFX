package com.ciro.app.controller;

import com.ciro.app.Main;

public class ChangeController {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void goBack(){
        System.out.println("Go back");
        main.firstWindow();
    }
}
