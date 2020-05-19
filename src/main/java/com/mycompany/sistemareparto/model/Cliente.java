
package com.mycompany.sistemareparto.model;


public class Cliente extends Persona{
    private String direccion;
    private double movil;
    private String mail;

    public Cliente() {
        this.id=-1;
    }
    public Cliente(String direccion, double movil, String mail){
        this.id=-1;
        this.nombre=super.nombre;
        this.direccion=direccion;
        this.movil=movil;
        this.mail=mail;
    }
        public Cliente(String nombre,String direccion, double movil, String mail){
        this.id=-1;
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
    

    @Override
    public boolean equals(Object o) {
        boolean result=false;
        if(o!=null){
            if(this==o){
                result=true;
            }else if(o instanceof Cliente){
                Cliente aux=(Cliente)o;    
                result= (this.id==aux.getId()
                && this.nombre.equals(aux.getNombre()))
                && this.mail.equals(aux.getMail());
            }
        }
        return result;
    }
}