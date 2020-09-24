package Practico7.EjercicioGit;

public class Vehiculo {

    protected int ruedas;
    protected String color;

    public Vehiculo(){
        this.ruedas = 0;
        this.color = "desconocido";
    }

    public Vehiculo(int unaRueda, String unColor){
        this.ruedas = unaRueda;
        this.color = unColor;
    }

    public void setRuedas(int unaRueda){
        this.ruedas = unaRueda;
    }

    public int getRuedas(){
        return this.ruedas;
    }

    public void setColor(String unColor){
        this.color = unColor;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "Tiene " +this.getRuedas()+ " ruedas y es de color " +this.getColor();
    }
}
