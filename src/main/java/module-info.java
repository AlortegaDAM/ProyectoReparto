module com.mycompany.sistemareparto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    //requires java.xml.bind;
    requires java.prefs;
    requires java.sql;
    requires com.h2database;

    
    opens com.mycompany.sistemareparto to javafx.fxml;
    exports com.mycompany.sistemareparto;
}