
package com.mycompany.sistemareparto.controller;

/**
 *
 * @author Vinil
 */
public enum Scenes{
    //ROOT("view/root"), 
    PRINCIPAL("view/Principal"), //Es el nombre de la plantilla .fxml
    //CONN("view/connections"),
    PEDIDOS("view/Pedidos"),
    GESTOR("view/Gestor"),
    REPARTIDORES("view/Repartidores"),
    CLIENTES("view/Clientes"),
    PRODUCTOS("view/Productos");

    private String url;
 
    Scenes(String fxmlFile) {
        this.url = fxmlFile;
    }
 
    public String getUrl() {
        return url;
    }
}