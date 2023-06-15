package Entidad;

import java.util.Scanner;


public class Libro {

    
    public int isbn;
    public String titulo;
    public String autor;
    public int nPaginas;
    
    /**
     * empty constructor 
     */
    public Libro() {
    }
    
    /**
     * constructor whit all the parameters 
     * @param isbn
     * @param titulo
     * @param autor
     * @param nPaginas 
     */
    public Libro(int isbn, String titulo, String autor, int nPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }    
    
    /**
     * method for user input
     */
     public void cargarLibro (){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN del libro:");
        isbn = leer.nextInt();
        
        leer.nextLine();
                
        System.out.println("Ingrese el título del libro:");
        titulo = leer.nextLine();

        System.out.println("Ingrese el autor del libro:");
        autor = leer.nextLine();

        System.out.println("Ingrese el número de páginas del libro:");
        nPaginas = leer.nextInt();
    }
    
    /**
     * method for print information on console
     */
    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + nPaginas);
    }
    
    
}

