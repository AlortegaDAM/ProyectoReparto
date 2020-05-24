
package model;
import com.mycompany.sistemareparto.model.Producto;
import com.mycompany.sistemareparto.model.ProductoDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;


public class ProductoDAOTest {
    
    /*@Test
    public void deletePrueba(){
        
        ProductoDAO p=new ProductoDAO();
        p.delete(5);
        System.out.println(p);
    
    }
    */
    @Test
    public void addPrueba(){
        
        ProductoDAO pdao=new ProductoDAO();
        Producto  p= new Producto( 5, "Gazpacho", "Fresquito", 6.5);
        pdao.add(p);
        System.out.println(p);
    
    } 

    /*@Test
    public void updatePrueba(){
        
        ProductoDAO pdao=new ProductoDAO();
        Producto  p= new Producto( 5, "Salmorejo", "Plato frío", 6.5);
        p.setCodigo(10);
        p.setDescripcion("Mu rico");
        p.setId(6);
        pdao.update(p);
        
        System.out.println(p);
    
    } /* 
    @Test
    public void loadPrueba() {
        ProductoDAO pdao=new ProductoDAO();
        List <Producto> lista=new ArrayList<>();
        lista = pdao.load();
        Iterator iter = lista.iterator();
            while (iter.hasNext())
                System.out.println(iter.next());
        
    }*/
    
}
