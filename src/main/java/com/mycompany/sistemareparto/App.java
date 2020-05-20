package com.mycompany.sistemareparto;

import com.mycompany.sistemareparto.controller.AppController;
import com.mycompany.sistemareparto.controller.Controllers;
import com.mycompany.sistemareparto.controller.Scenes;
import com.mycompany.sistemareparto.utils.MapEntry;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.BorderPane;

public class App extends Application {

    public Scene scene;
    public Stage mainStage;
    public BorderPane rootLayout;
    
    /**
     * Main Controller must be accessible from everywhere
     */
    public AppController controller;

    @Override
    public void start(Stage stage) throws IOException {
       
       MapEntry<Parent, Controllers> m=AppController.loadFXML(Scenes.PRINCIPAL.getUrl());
        
        mainStage=stage;
        rootLayout=(BorderPane)m.getKey();
        scene = new Scene(rootLayout, 640, 480);
        stage.setScene(scene);
        
        controller=(AppController)m.getValue();
        controller.setMainApp(this);
        controller.changeScene(Scenes.CLIENTES);
        stage.show();    
    }

    public static void main(String[] args) {
        launch();
    }

}