/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemareparto.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Vinil
 */
public class RepartidoresController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void pantallaPrincipal() throws IOException{
        //changeScene(Scenes.PEDIDOS);
       // setRoot("fxml/Pedidos");
    }
    
    @FXML
    public void salir(){
        System.exit(0);
    }
    @FXML
    public void nuevoRepartidor() throws IOException{
        //setRoot("fxml/Cliente");
    }
    @FXML
    public void guardarRepartidor() throws IOException{
       //setRoot("fxml/Repartidor");
    }
    @FXML
    public void actualizar() throws IOException{
        //setRoot("fxml/Producto");
    }
    @FXML
    public void borrarRepartidor() throws IOException{
       // setRoot("fxml/Producto");
    }
}
