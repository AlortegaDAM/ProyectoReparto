/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemareparto.controller;

import com.mycompany.sistemareparto.model.Cliente;
import com.mycompany.sistemareparto.model.ClienteDAO;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Vinil
 */
public class ClientesController implements Initializable {
    
    
    public TableView tablacli;
    public TextField nombrecli;
    public TextField direccioncli;
    public TextField movilcli;
    public TextField mailcli;
    public Cliente c;
    public ClienteDAO cdao;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Cliente> listacli=cdao.load();
        tablacli.setItems((ObservableList) listacli);
    }   
    
    @FXML
    public void pantallaPrincipal() throws IOException{
        //changeScene(Scenes.PEDIDOS);
       // setRoot("fxml/Principal");
    }
    
    @FXML
    public void salir(){
        System.exit(0);
    }
    @FXML
    public void nuevoCliente() throws IOException{
       nombrecli.setText("");
       direccioncli.setText("");
       movilcli.setText("");
       mailcli.setText("");
    }
    @FXML
    public void guardarCliente() throws IOException{
       c=new Cliente(nombrecli.getText(), direccioncli.getText(), (Double)movilcli.getUserData(), mailcli.getText());
       cdao.add(c);
       nuevoCliente();
    }
    @FXML
    public void actualizarCliente() throws IOException{
       c=new Cliente(nombrecli.getText(), direccioncli.getText(), (Double)movilcli.getUserData(), mailcli.getText());
       cdao.update(c);
       nuevoCliente();
    }
    @FXML
    public void borrarCliente() throws IOException{
       c=new Cliente(nombrecli.getText(), direccioncli.getText(), (Double)movilcli.getUserData(), mailcli.getText());
       cdao.add(c);
       nuevoCliente();
    }
    
    
}
