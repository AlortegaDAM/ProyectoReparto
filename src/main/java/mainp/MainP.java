package mainp;

import java.sql.Connection;
import model.Cliente;
import model.Conexion;
import model.Producto;
import model.ProductoDAO;

public class MainP {

    public static void main(String[] args) {

        
        
        
        
        Cliente p=new Cliente(1,"Alba","El brillante",600000000,"ALBA");
        System.out.println(p.getId());
      
        System.out.print(p);
        
        
        
    }

}
