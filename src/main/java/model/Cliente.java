
package model;


public class Cliente extends Persona{
    private String direccion;
    private double movil;
    private String mail;

    public Cliente() {
    }
    public Cliente(String direccion, double movil, String mail){
        this.id=super.id;
        this.nombre=super.nombre;
        this.direccion=direccion;
        this.movil=movil;
        this.mail=mail;
    }
        public Cliente(int id,String nombre,String direccion, double movil, String mail){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.movil=movil;
        this.mail=mail;
    }
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMovil() {
        return movil;
    }

    public void setMovil(double movil) {
        this.movil = movil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "direccion=" + direccion + ", movil=" + movil + ", mail=" + mail + '}';
    }

}