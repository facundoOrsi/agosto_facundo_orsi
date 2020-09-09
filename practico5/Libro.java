package Practico5;

public class Libro {

        //atributos
        private int ISBN;
        private String titulo;
        private String autor;
        private int numeroDePaginas;

        //constructor sin parametros
        public Libro(){
            this.ISBN = 1;
            this.titulo = "Sin título";
            this.autor = "Stephen Hawking";
            this.numeroDePaginas = 100;
        }

        //constructor con todos los parametros
        public Libro(int unISBN, String unTitulo, String unAutor, int losNumerosDePaginas){
            this.ISBN = unISBN;
            this.titulo = unTitulo;
            this.autor = unAutor;
            this.numeroDePaginas = losNumerosDePaginas;
        }

        //metodos
        public void setISBN(int unISBN){
            this.ISBN = unISBN;
        }

        public int getISBN(){
            return this.ISBN;
        }

        public void setTitulo(String unTitulo){
            this.titulo = unTitulo;
        }

        public String getTitulo(){
            return this.titulo;
        }

        public void setAutor(String unAutor){
            this.autor = unAutor;
        }

        public String getAutor(){
            return this.autor;
        }

        public void setNumeroDePaginas(int unNumeroDePagina){
            this.numeroDePaginas = unNumeroDePagina;
        }

        public int getNumeroDePaginas(){
            return this.numeroDePaginas;
        }

        public String toString(){
            String informacion = "El libro con ISBN " +this.getISBN()+ " creado por el autor " + this.getAutor()+
            " tiene " +this.getNumeroDePaginas() + " páginas";

            return informacion;
        }


}
