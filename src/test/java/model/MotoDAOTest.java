
package model;

import com.mycompany.sistemareparto.model.MotoDAO;
import com.mycompany.sistemareparto.model.Moto;
import org.junit.Test;

public class MotoDAOTest {
    
    
    @Test
    public void addMoto(){
    MotoDAO m=new MotoDAO();
    Moto moto=new Moto("CVB5060", "Vespa", 18000);
    
    m.add(moto);
    
    }
}
