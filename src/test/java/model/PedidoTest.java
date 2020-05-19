
package model;
import com.mycompany.sistemareparto.model.Producto;
import com.mycompany.sistemareparto.model.Pedido;
import java.util.List;
import org.junit.Test;
public class PedidoTest {
    
    @Test
    public void nuevoPedido(){
        boolean r=false;
        Pedido p=new Pedido(1, 1);
        System.out.println(p.toString());
    }
    @Test
    public void agregarProductos(){
        Pedido p=new Pedido(1, 1);
        Producto  uno= new Producto( 5, "Salmorejo", "Plato frío", 6.5);
        uno.setCantidad(2);
        Producto  dos= new Producto( 6, "Flamenquin", "de pollo", 10);
        dos.setCantidad(4);
        
        
    
    
    }
}
