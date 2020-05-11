
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;


public class RepartidorDAOTest {
    
    /*@Test
    public void deletePrueba(){
        
        RepartidorDAO rp=new RepartidorDAO();
        rp.delete(2);
        
    
    }
    */
    @Test
    public void addPrueba(){
        
        RepartidorDAO rpdao=new RepartidorDAO();
        Repartidor rp= new Repartidor( "Daniel", "Tardes");
        rpdao.add(rp);
        System.out.println(rp);
    
    } 
/*
    @Test
    public void updatePrueba(){
        
        RepartidorDAO rpdao=new RepartidorDAO();
        Repartidor rp= new Repartidor( "Juan", "Calle La Perla");
        rp.setNombre("Pamela");
        rp.setTurno("Tarde");
        rpdao.update(rp);
        
        System.out.println(rp);
    
    }
    
    @Test
    public void loadPrueba() {
        RepartidorDAO rpdao=new RepartidorDAO();
        List <Repartidor> lista=new ArrayList<>();
        lista = rpdao.load();
        Iterator iter = lista.iterator();
            while (iter.hasNext())
        System.out.println(iter.next());
        
    }*/
}
