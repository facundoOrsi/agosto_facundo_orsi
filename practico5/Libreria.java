package Practico5;

import java.util.Scanner;

public class Libreria {

        public static void main(String args[]){

            int contador = 1;
            Scanner input = new Scanner(System.in);

            while (contador<=2){
                System.out.println("Ingrese el ISBN del libro");
                int isbn = input.nextInt();

                System.out.println("Ingrese el titulo");
                String titulo = input.next();

                System.out.println("Ingrese el autor");
                String autor = input.next();

                System.out.println("Ingrese el numero de paginas");
                int numeroPaginas = input.nextInt();

                Libro libro = new Libro();
                libro.setISBN(isbn);
                libro.setTitulo(titulo);
                libro.setAutor(autor);
                libro.setNumeroDePaginas(numeroPaginas);
                System.out.println(libro);
                System.out.println("**************");

                contador++;
            }





        }
}
