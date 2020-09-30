package Practico8.EjercicioGit;

public class Persona {

    private String nombre;
    private int telefono;
    private String email;

    public Persona(){
        this.nombre = "desconocido";
        this.telefono = 0;
        this.email = "desconocido";
    }

    public Persona(String unNombre, int unTelefono, String unEmail){
        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.email = unEmail;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setEmail(String unEmail){
        this.email = unEmail;
    }

    public String getEmail(){
        return this.email;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() + " Telefono: " + this.getTelefono() + " Email: " + this.getEmail();
    }



}
