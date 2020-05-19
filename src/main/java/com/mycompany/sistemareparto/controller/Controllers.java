package com.mycompany.sistemareparto.controller;

import com.mycompany.sistemareparto.App;

public abstract class Controllers {
    App app;
    public void setMainApp(App app){
        this.app=app;
        this.onLoad();
    }
    //To be ovewritten
    void onLoad(){};
    //To be ovewritten
    void doOnCloseModal(Object response){}
}
