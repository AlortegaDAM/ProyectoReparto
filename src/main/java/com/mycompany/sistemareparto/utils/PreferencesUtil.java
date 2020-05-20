/*package com.mycompany.sistemareparto.utils;
//PENDIENTE DE MIGRAR
import com.mycompany.sistemareparto.App;
import com.mycompany.sistemareparto.model.Conexion;
import java.util.List;
import java.util.prefs.Preferences;

public class PreferencesUtil {
    public static Conexion getPreference(){
        Conexion result=null;
        Preferences prefs= Preferences.userNodeForPackage(App.class);
        String nameC=prefs.get("conn", null);
        if(nameC!=null){
            List<Conexion> conns=XMLUtil.loadDataXML();
            Conexion search=new Conexion(nameC);
            int index=conns.indexOf(search);
            if(index>-1){
                result=conns.get(index);
            }else{
                setPreference(null);
            }
        }
        
        return result;
    }
    
    public static void setPreference(String nameC){
        Preferences prefs= Preferences.userNodeForPackage(App.class);
        if(nameC!=null){
            prefs.put("conn",nameC);
        }else{
            prefs.remove("conn");
        }
        
    }
}*/
