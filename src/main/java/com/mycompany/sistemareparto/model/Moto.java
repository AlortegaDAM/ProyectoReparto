
package com.mycompany.sistemareparto.model;

import java.util.Objects;


public class Moto {
    private int id;
    private String matricula;
    private boolean en_uso;
    private String marca;
    private double km;

    public Moto() {
        this.id=-1;
        this.matricula="sin definir";
        this.en_uso=false;
        this.km=0;
        this.marca="Sin marca";
    }

    public Moto(String matricula, String marca, double km) {
        this.matricula = matricula;
        this.marca = marca;
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isEn_uso() {
        return en_uso;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEn_uso(boolean en_uso) {
        this.en_uso = en_uso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moto other = (Moto) obj;
        if (Double.doubleToLongBits(this.km) != Double.doubleToLongBits(other.km)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Moto{" + "matricula=" + matricula + ", marca=" + marca + ", km=" + km + '}';
    }
    
    
    
    
}
