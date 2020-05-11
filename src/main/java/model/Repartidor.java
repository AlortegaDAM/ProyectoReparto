
package model;


public class Repartidor extends Persona {
    
    private String turno;

    public Repartidor(String turno) {
        this.turno = turno;
    }
    
    public Repartidor(String nombre, String turno){
    this.nombre=nombre;
    this.turno=turno;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString()+"Repartidor{" + "turno=" + turno + '}';
    }

    
    
    
}
