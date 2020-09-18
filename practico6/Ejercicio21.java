package Practico6;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String args[]){

                Scanner input = new Scanner(System.in);
                int[] array5Elementos = new int[5];
                int contador = 1;
                int pedirNro = 0;


                for(int i = 0 ; i < array5Elementos.length; i++){
                    System.out.println("Ingrese un número");
                    pedirNro = input.nextInt();
                    array5Elementos[i] = pedirNro;
                }
                nroPositivosNegativosYCeros(array5Elementos);

    }

    //Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    //Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de
    //números positivos, negativos y ceros:
    //Ej. “Se ingresaron 2 números positivos, 1 número negativo y 1 cero”

    public static void nroPositivosNegativosYCeros(int[] array){
            int contadorPositivos = 0;
            int contadorNegativos = 0;
            int contadorCeros = 0;

            for(int i = 0; i < array.length; i++){
                if(array[i] > 0){
                    contadorPositivos++;
                }
                if(array[i] < 0){
                    contadorNegativos++;
                }
                if(array[i] == 0){
                    contadorCeros++;
                }
            }
            System.out.println("Se ingresaron " +contadorPositivos+ " números positivos, "
                    +contadorNegativos+ " números negativos y " +contadorCeros+ " cero");
    }
}
