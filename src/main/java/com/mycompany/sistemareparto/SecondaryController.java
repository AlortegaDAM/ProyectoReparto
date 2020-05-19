package com.mycompany.sistemareparto;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        Appantigua.setRoot("primary");
    }
}