module com.mycompany.sistemareparto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    //requires java.xml.bind;
    requires java.prefs;
    requires java.sql;
    requires com.h2database;

    
    opens com.mycompany.sistemareparto to javafx.fxml;
    opens com.mycompany.sistemareparto.controller to javafx.fxml;
    exports com.mycompany.sistemareparto;
    exports com.mycompany.sistemareparto.model;  //para que JAXB pueda acceder a Connection y Connection wrapper
    
    
    
    
    //opens com.mycompany.sistemareparto.utils to java.xml.bind; //Para que JAXB pueda ejecutarse en XMLUtil

    //opens com.mycompany.sistemareparto.model to java.xml.bind; //Para que JAXB pueda ejecutarse en ConnectionWrapper
    

}