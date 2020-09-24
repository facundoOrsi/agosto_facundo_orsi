package Practico7.EjercicioGit;

import java.util.Scanner;

public class EmpresaVehiculos {

    public static void main(String args[]){

        Vehiculo motocicleta1 = new Motocicleta(2, "negra", 150, "250");
        System.out.println(motocicleta1);
        System.out.println("***************");

        Vehiculo motocicleta2 = new Motocicleta(3, "roja", 300, "1000");
        System.out.println(motocicleta2);
        System.out.println("***************");

        Vehiculo semiRemolque1 = new SemiRemolque(18, "blanco", 4);
        System.out.println(semiRemolque1);
        System.out.println("***************");
        
        Vehiculo semiRemolque2 = new SemiRemolque(9, "amarillo", 8);
        System.out.println(semiRemolque2);

    }
}
