
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RepartidorDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int add(Object element) {
        int r=0;
        if(element instanceof Repartidor){
        Repartidor rp=(Repartidor) element;
        
        String sql="insert into repartidor (nombre, turno) values(?,?)";
        
       try{
       //conexion
       con=cn.Conectar();
       //preparamos la sentencia SQL
       ps=con.prepareStatement(sql);
       ps.setString(1,rp.getNombre());
       ps.setString(2,rp.getTurno());
       //ejecutamos
       r=ps.executeUpdate();
       }catch(SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

    @Override
    public int update(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
