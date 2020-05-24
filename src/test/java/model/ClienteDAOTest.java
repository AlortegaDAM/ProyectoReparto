
package model;

import com.mycompany.sistemareparto.model.Cliente;
import com.mycompany.sistemareparto.model.ClienteDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;


public class ClienteDAOTest {
    
    List<Cliente> listacli;
    
    
    
    /*@Test
    public void deletePrueba(){
        
        ClienteDAO c=new ClienteDAO();
        c.delete(2);
        
    
    }*/
    
    @Test
    public void addPrueba(){
        
        ClienteDAO cdao=new ClienteDAO();
        Cliente  c= new Cliente( "Jaime", "Calle la palma", 600777731, "Jaime@prueba.es");
        cdao.add(c);
        System.out.println(c);
    
    } 

    /*@Test
    public void updatePrueba(){
        
        ClienteDAO cdao=new ClienteDAO();
        listacli=cdao.load();
        Cliente c= listacli.get(2);
        c.setNombre("Nombreupdate");
        c.setMail("Update@mail.es");
        cdao.update(c);
        
        System.out.println(c);
    
    }
    
    @Test
    public void loadPrueba() {
        ClienteDAO cdao=new ClienteDAO();
        List <Cliente> lista=new ArrayList<>();
        lista = cdao.load();
        Iterator iter = lista.iterator();
            while (iter.hasNext())
        System.out.println(iter.next());
        
    }*/
}
