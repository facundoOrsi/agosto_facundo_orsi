package Practico7.EjercicioGit;

public class Motocicleta extends Vehiculo {

    private int velocidad;
    private String cilindrada;

    public Motocicleta(){
        this.velocidad = 0;
        this.cilindrada = "desconocida";
    }

    public Motocicleta(int unaRueda, String unColor, int unaVelocidad, String unaCilindrada){
        super(unaRueda, unColor);
        this.velocidad = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }

    public void setVelocidad(int unaVelocidad){
        this.velocidad = unaVelocidad;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public void setCilindrada(String unaCilindrada){
        this.cilindrada = unaCilindrada;
    }

    public String getCilindrada(){
        return this.cilindrada;
    }

    public String toString(){
        String retorno = super.toString();
        retorno = retorno += ". Velocidad: " +this.getVelocidad()+ " y cilindrada: " +this.getCilindrada();
        return retorno;
    }
}
