package Practico7.EjercicioGit;

public class SemiRemolque extends Vehiculo {

    private int cantidadEjes;

    public SemiRemolque(){
        this.cantidadEjes = 0;
    }

    public SemiRemolque(int unaRueda, String unColor,int unaCantidadEjes){
        super(unaRueda, unColor);
        this.cantidadEjes = unaCantidadEjes;
    }

    public void setCantidadEjes(int unaCantidadEjes){
        this.cantidadEjes = unaCantidadEjes;
    }

    public int getCantidadEjes(){
        return this.cantidadEjes;
    }

    public String toString(){
        String retorno = super.toString();
        retorno = retorno += ". Cantidad ejes: " +this.getCantidadEjes();
        return retorno;
    }
}
