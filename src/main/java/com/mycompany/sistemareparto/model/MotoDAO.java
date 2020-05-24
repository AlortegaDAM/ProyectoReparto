
package com.mycompany.sistemareparto.model;

import com.mycompany.sistemareparto.model.CRUD;
import com.mycompany.sistemareparto.model.Conexion;
import com.mycompany.sistemareparto.model.Moto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MotoDAO implements CRUD{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    @Override
    public void delete(int id) {
        String sql="delete from moto where id=?";
        
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch(SQLException ex){
        Logger.getLogger(MotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List load() {
        List <Moto> elementos=new ArrayList<>();
        String sql="select * from moto";
        try{
        //establecemos conexion
        con=cn.Conectar();
        //preparación de la sentencia SQL
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        
        //Recorremos el conjunto de resultados de la QUERY
        while(rs.next()){
            //Creación de objetos en nuestra Aplicación JAVA con los datos de la tabla
            Moto m=new Moto();
            m.setId(rs.getInt(4));
            m.setMatricula(rs.getString(1));
            m.setMarca(rs.getString(2));
            m.setKm(rs.getDouble(3));
            elementos.add(m);
        }
            
        }catch (SQLException ex){
            Logger.getLogger(MotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return elementos;
    }
        @Override
    public int add(Object element) {
        int r=0;
        if(element instanceof Moto){
        Moto m=(Moto) element;
        
        String sql="insert into moto (matricula, marca, km) values(?,?,?)";
        
       try{
       //conexion
       con=cn.Conectar();
       //preparamos la sentencia SQL
       ps=con.prepareStatement(sql);
       ps.setString(1,m.getMatricula());
       ps.setString(2,m.getMarca());
       ps.setDouble(3,m.getKm());
       //ejecutamos
       r=ps.executeUpdate();
       }catch(SQLException ex) {
            Logger.getLogger(MotoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

    @Override
    public int update(Object element) {
        int r=0;
        if(element instanceof Moto){
            Moto m=(Moto) element;
            String sql="update moto set matricula=?, marca=?, km=? where id=?";
            try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, m.getMatricula());
            ps.setString(2, m.getMarca());
            ps.setDouble(3, m.getKm());
            r=ps.executeUpdate();
            }
            catch(SQLException ex){
            Logger.getLogger(MotoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }
}
