package Practico7.EjercicioGit;

public class Auto extends Vehiculo {

    private int velocidadMaxima;
    private String cilindrada;

    public Auto(){
        this.velocidadMaxima = 0;
        this.cilindrada = "desconocida";
    }

    public Auto(int unaRueda, String unColor, int unaVelocidad, String unaCilindrada){
        super(unaRueda, unColor);
        this.velocidadMaxima = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }

    public void setVelocidadMaxima(int unaVelocidad){
        this.velocidadMaxima = unaVelocidad;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setCilindrada(String unaCilindrada){
        this.cilindrada = unaCilindrada;
    }

    public String getCilindrada(){
        return this.cilindrada;
    }

    public String toString(){
        String retorno = super.toString();
        retorno = retorno += ". Velocidad maxima: " +this.getVelocidadMaxima()+ " y cilindrada: " +this.getCilindrada();
        return retorno;
    }
}
