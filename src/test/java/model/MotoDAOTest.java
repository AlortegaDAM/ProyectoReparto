
package model;

import com.mycompany.sistemareparto.model.MotoDAO;
import com.mycompany.sistemareparto.model.Moto;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MotoDAOTest {
    MotoDAO m;
    Moto moto;
    List<Moto> listam;
    @Test
    public void addMoto(){
    m=new MotoDAO();
    moto=new Moto("CVB5060", "Vespa", 18000);
    
    m.add(moto);
    
    }
    @Test
    public void deleteMoto(){
    m.delete(1);
    }
    @Test
    public void updateMoto(){
    moto.setMarca("MARCA_CAMBIADA");
    moto.setMatricula("Matriculacambioprueba");
    m.update(moto);
    }
    
    public void loadMoto(){
        
        listam=m.load();
        System.out.println(listam);
    }
}
