package actividadextra2;

import Servicio.AlquilerServicio;
import Servicio.PeliculaServicio;
import actividadextra2.newpackage.Alquileres;
import actividadextra2.newpackage.Pelicula;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ActividadExtra2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeliculaServicio ps1 = new PeliculaServicio();
        Pelicula p1 = new Pelicula("Barbie", "Romance", LocalDate.of(2000, Month.DECEMBER, 20), 100, true);
        Pelicula p2 = new Pelicula("Bambi", "Animada", LocalDate.of(2010, Month.APRIL, 20), 100, true);
        Pelicula p3 = new Pelicula("Duro de matar", "Acción", LocalDate.of(2002, Month.DECEMBER, 20), 100, true);
        Pelicula p4 = new Pelicula("Cincuenta Sombras", "XXX", LocalDate.of(2003, Month.JUNE, 20), 100, true);
        Pelicula p5 = new Pelicula("Naruto", "Anime", LocalDate.of(2000, Month.DECEMBER, 20), 100, true);
//       Pelicula p1 = ps1.CrearPelicula(); 
//        System.out.println(p1.toString()); 
        boolean bandera = true;
        
        

       
        while (bandera) {
            
            Pelicula[] todas = {p1, p2, p3, p4, p5};
            String [] listaDisponible = new String [5];
            for (int i = 0; i < listaDisponible.length; i++) {
                if (todas[i].isDisponible()) {
                    listaDisponible[i] = todas[i].getTitulo();
                }else{
                    listaDisponible[i] = "alquilada"; 
                }
            }

            String [] alquiladas = new String[5];
            AlquilerServicio as1 = new AlquilerServicio();

            for (int i = 0; i < alquiladas.length; i++) {
                if (!todas[i].isDisponible()) {
                    alquiladas[i] = todas[i].getTitulo();
                }else{
                    alquiladas[i] = "pelicula disponible";
                }
            }

            System.out.println("opcion 1: alquilar pelicula opcion 2: ver listas opcion 3 salir");
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:        
                    
                     Alquileres a1 = as1.CrearAlquileres(todas);
                    
                    
                    break;
                case 2:
                    ps1.ListarPeliculas(listaDisponible);
                    as1.listarAlquidas(alquiladas);
                    break;
                case 3:
                    System.out.println("selecciono salir");
                    bandera=false;
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }                                  
        
        }

        

        
        
    }
}
