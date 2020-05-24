
package com.mycompany.sistemareparto.controller;

/**
 *
 * @author Vinil
 */
public enum Scenes{
    //ROOT("view/root"), 
    PRINCIPAL("fxml/Principal"), //Es el nombre de la plantilla .fxml
    //CONN("view/connections"),
    PRIMARY("fxml/Primary"),
    PEDIDOS("fxml/Pedidos"),
    GESTOR("fxml/Gestor"),
    REPARTIDORES("fxml/Repartidores"),
    CLIENTES("fxml/Clientes"),
    PRODUCTOS("fxml/Productos");

    private String url;
 
    Scenes(String fxmlFile) {
        this.url = fxmlFile;
    }
 
    public String getUrl() {
        return url;
    }
}