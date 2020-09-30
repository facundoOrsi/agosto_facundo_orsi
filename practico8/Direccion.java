package Practico8.EjercicioGit;

public class Direccion {

    private String calle;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion(){
        this.calle = "desconocida";
        this.ciudad = "desconocida";
        this.estado = "desconocido";
        this.pais = "desconocido";
    }

    public Direccion(String unaCalle, String unaCiudad, String unEstado, String unPais){
        this.calle = unaCalle;
        this.ciudad = unaCiudad;
        this.estado = unEstado;
        this.pais = unPais;
    }

    public void setCalle(String unaCalle){
        this.calle = unaCalle;
    }

    public String getCalle(){
        return this.calle;
    }

    public void setCiudad(String unaCiudad){
        this.ciudad = unaCiudad;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public void setEstado(String unEstado){
        this.estado = unEstado;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setPais(String unPais){
        this.pais = unPais;
    }

    public String getPais(){
        return this.pais;
    }

    public String toString(){
        return "Calle: " +this.getCalle()+ " ,Ciudad: " +this.getCiudad()+ " ,Estado: " +this.getEstado()+ " y Pais: " +this.getPais();
    }

     public static int obtenerCodigoTel(){
        return 0;
    }



}
