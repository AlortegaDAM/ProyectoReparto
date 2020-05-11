
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;


public class ClienteDAOTest {
    /*@Test
    public void deletePrueba(){
        
        ClienteDAO c=new ClienteDAO();
        c.delete(2);
        
    
    }
    /*
    @Test
    public void addPrueba(){
        
        ClienteDAO cdao=new ClienteDAO();
        Cliente  c= new Cliente( 5, "Juan", "Barrio nuevo", 600234231, "Juancliente@prueba1.es");
        cdao.add(c);
        System.out.println(c);
    
    } 

    @Test
    public void updatePrueba(){
        
        ClienteDAO cdao=new ClienteDAO();
        Cliente c= new Cliente(1, "Juan", "Calle La Perla", 654212304, "Juancliente@prueba1.es");
        c.setNombre("Pamela");
        c.setMail("Pamela@mail.es");
        cdao.update(c);
        
        System.out.println(c);
    
    }
    */
    @Test
    public void loadPrueba() {
        ClienteDAO cdao=new ClienteDAO();
        List <Cliente> lista=new ArrayList<>();
        lista = cdao.load();
        Iterator iter = lista.iterator();
            while (iter.hasNext())
        System.out.println(iter.next());
        
    }
}
