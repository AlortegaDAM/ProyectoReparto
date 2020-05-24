/*package com.mycompany.sistemareparto.controller;

import com.mycompany.sistemareparto.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}*/

package com.mycompany.sistemareparto.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class PrimaryController extends Controllers implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @Override
    void onLoad() {
        this.app.controller.title("SISTEMA DE REPARTO");
        //this.app.controller.enableCon();
    }

}
