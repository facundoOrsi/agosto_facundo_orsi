package Practico8.EjercicioGit;

import Practico5.Producto;
import Practico8.Grupo;

public class Profesor extends Persona {

    private float salario;
    private Direccion direccion;

    public Profesor(){
        this.salario = 30000;
    }

    public Profesor(String unNombre, int unTelefono, String unEmail, float unSalario){
        super(unNombre, unTelefono, unEmail);
        this.salario = unSalario;
    }

    public void setSalario(float unSalario){
        this.salario = unSalario;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setDireccion(Direccion unaDireccion){
        this.direccion = unaDireccion;
    }

    public Direccion getDireccion(){
        return this.direccion;
    }

    public String toString(){
        return "El profesor " + this.getNombre() + " ,su telefono es " +this.getTelefono() + " ,su email " +this.getEmail() +
                " ,su salario $ " + this.getSalario()+ " y direccion " +this.getDireccion();
    }
}
