package com.mycompany.sistemareparto.controller;

import com.mycompany.sistemareparto.App;
//import com.mycompany.sistemareparto.model.Connection;
//import com.mycompany.sistemareparto.model.dao.ContactDao;
import com.mycompany.sistemareparto.utils.MapEntry;
//import com.mycompany.sistemareparto.utils.PreferencesUtil;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AppController extends Controllers {
    //scene actual cargada
    public Scene scene;
    //public Scenes backScene;
    //public Scenes currentScene;
    
   // public Connection currentConnection;

   /* @Override
    void onLoad() {
        //currentConnection=PreferencesUtil.getPreference();
    }*/
    public void setRoot(String fxml)throws IOException{
        scene.setRoot(loadFXML(fxml));
    }
    public static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource(fxml + ".fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader (App.class.getResource("fxml/Principal.fxml"));
        return fxmlLoader.load();
    }
    /**
     * Recibe la url de una archivo FXML (de la carpeta resources) y devuelve su contenedor y controlador
     * @param fxml url del archivo 
     * @return @see(MapEntry) de un contenedor y su controlador si lo tuviera
     * @throws IOException en caso de error de lectura
     *//*
    public static MapEntry<Parent,Controllers> loadFXML(String fxml) throws IOException {
        System.out.println("AQUI");
        System.out.println(fxml);
        System.out.println("AQUI");
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        System.out.println(fxmlLoader);
        Parent p=fxmlLoader.load();
        Controllers c=fxmlLoader.getController();
        MapEntry<Parent, Controllers> result=new MapEntry<>(p,c);
        return result;
    }
   */
    /**
     * Carga en el Layout de la app principal la escena que se le pase en la 
     * zona central. (requisito: el layout principal debe ser borderpane).
     * Le pasa automaticamente al controlador de la escena la referncia a la
     * clase principal para poder tener acceso a su controlador.
     * @param scene La escena a cargar @see(Scenes)
     *//*
    public void changeScene(Scenes scene){
        try {
            MapEntry<Parent, Controllers> m=loadFXML(scene.getUrl());
            this.app.rootLayout.setCenter(m.getKey());
            if(m.getValue()!=null)
                 m.getValue().setMainApp(this.app);
            if(backScene!=currentScene){
                backScene=currentScene;
            }
            this.currentScene=scene;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    */
    /**
     * Abre una ventana modal
     * @param scene La ventana a abrir (ruta del archivo FXML)
     * @param title Título de la ventana modal.
     * @param parentController El controlador de la scene que abre el modal, this?
     * @param params Cualquier objeto que se quiere pasar como información de entrada al modal
     * @return Devuelve el controlador de la propia escena que se carga como modal
     *//*
    public Controllers openModal(Scenes scene,String title,Controllers parentController,Object params){
        try {
            System.out.println(scene.getUrl());
            MapEntry<Parent, Controllers> m=loadFXML(scene.getUrl());
            Stage modalStage=new Stage();
            modalStage.setTitle(title);
            modalStage.initModality(Modality.APPLICATION_MODAL);
            modalStage.initOwner(this.app.mainStage);
            
            Scene modalScene=new Scene(m.getKey());
            modalStage.setScene(modalScene);
           
            if(m.getValue()!=null){
                 m.getValue().setMainApp(this.app);
                 ModalControllers mc=(ModalControllers)m.getValue();
                 mc.setParentController(parentController);
                 mc.setStage(modalStage);
                 mc.setParams(params);
            }
            modalStage.showAndWait();
            return m.getValue();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }*/
     /**
     * No se usa en este proyecto, dado que nunca se cambiará el rootLayout.
     * Se deja como documentación
     * @param fxml
     * @throws IOException 
     */
    /* private void setRoot(Scenes scene) throws IOException {
        this.backScene=null;
        this.currentScene=null;
        MapEntry<Parent, Controllers> m=loadFXML(scene.getUrl());
        this.app.scene.setRoot(m.getKey());
        this.app.controller=(AppController)m.getValue();
    }*/


    // AQUI SE CARGAN TODAS LAS PANTALLAS 





    
    @FXML
    private MenuItem con;
     
    @FXML
    public void pantallaPedido() throws IOException{
        //changeScene(Scenes.PEDIDOS);
        setRoot("fxml/Pedidos");
    }
    
    @FXML
    public void salir(){
        System.exit(0);
    }
    @FXML
    public void pantallaCliente() throws IOException{
        setRoot("fxml/Cliente");
    }
    @FXML
    public void pantallaRepartidor() throws IOException{
       setRoot("fxml/Repartidor");
    }
    @FXML
    public void pantallaProducto() throws IOException{
        setRoot("fxml/Producto");
    }
    
    public void title(String txt){
        this.app.mainStage.setTitle(txt);//+" ( "+(this.currentConnection==null?"Desconectado":this.currentConnection.getName())+" )");
    }
    

}