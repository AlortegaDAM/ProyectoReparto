package com.mycompany.sistemareparto;

import com.mycompany.sistemareparto.controller.AppController;
import static com.mycompany.sistemareparto.controller.AppController.loadFXML;
import javafx.fxml.FXMLLoader;
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

    /*@Override
    public void start(Stage stage) throws IOException {
       
       MapEntry<Parent, Controllers> m=AppController.loadFXML(Scenes.PRINCIPAL.getUrl());
        
        mainStage=stage;
        rootLayout=(BorderPane)m.getKey();
        scene = new Scene(rootLayout, 640, 480);
        stage.setScene(scene);
        
        controller=(AppController)m.getValue();
        controller.setMainApp(this);
        controller.changeScene(Scenes.PRIMARY);
        stage.show();    
    }*/
    @Override
    public void start (Stage stage) throws IOException{
        scene=new Scene(loadFXML("Principal"), 640, 400);
        stage.setScene(scene);
        stage.show();
    }
    /*
    public void setRoot(String fxml)throws IOException{
        scene.setRoot(loadFXML(fxml));
    }
    public static Parent loadFXML(String fxml) throws IOException{
        //FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource(fxml + ".fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
*/
    public static void main(String[] args) {
        launch();
    }

}