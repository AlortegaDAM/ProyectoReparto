
package model;

import com.mycompany.sistemareparto.model.Cliente;
import com.mycompany.sistemareparto.model.Pedido;
import com.mycompany.sistemareparto.model.PedidoDAO;
import com.mycompany.sistemareparto.model.ClienteDAO;
import com.mycompany.sistemareparto.model.Producto;
import com.mycompany.sistemareparto.model.ProductoDAO;
import com.mycompany.sistemareparto.model.Repartidor;
import com.mycompany.sistemareparto.model.RepartidorDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;


public class PedidoDAOTest {
    PedidoDAO pdao;
    Pedido pedido;
    List<Pedido> listap;
    
    @Test
    public void addPedido(){
        PedidoDAO pedidodao=new PedidoDAO();
        Pedido pedido=new Pedido();
        ClienteDAO cdao=new ClienteDAO();
        RepartidorDAO rdao=new RepartidorDAO();
        List<Cliente> lista_c=cdao.load();
        List<Repartidor> lista_r=rdao.load();
        
        int idc=lista_c.get(2).getId();
        int idr=lista_r.get(0).getId();
        
        ProductoDAO pdao=new ProductoDAO();
        List<Producto> lista_p=pdao.load();
        //seteo el pedido
        pedido.setIdCliente(idc);
        pedido.setIdRepartidor(idr);
        for(int i=0;i<lista_p.size();i++){
            Producto aux=lista_p.get(i);
            aux.setCantidad(3+i);
            
            pedido.addProducto(aux);
        }
        
        pedidodao.add(pedido);
        
    }/*
    @Test
    public void deletePedidotest(){
        PedidoDAO pdao=new PedidoDAO();
        pdao.delete(2);
    }
    */
    @Test
    public void updatePedido(){
        listap=pdao.load();
        pedido=listap.get(1);
        pedido.setIdRepartidor(1);
        pedido.setIdCliente(2);
        pdao.update(pedido);
        
    }
}
