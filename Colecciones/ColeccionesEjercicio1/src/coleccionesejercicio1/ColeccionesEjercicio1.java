//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
package coleccionesejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ColeccionesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <String> razas = new ArrayList<>();        
        boolean bandera = true;
        
        while (bandera) {            
            System.out.println("ingrese 1 para ingresar una raza, ingrese 2 para salir y visualizar la lista");
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese la raza");
                    razas.add(leer.nextLine());
                    break;
                case 2:
                    System.out.println("saliendo");
                    System.out.println(razas.toString());
                    bandera = false;
                    break;                    
            }
        }
        
        
        Iterator <String> it = razas.iterator();
        System.out.println("ingrese una raza para eliminar de la lista");        
        String raza = leer.nextLine();
        while (it.hasNext()) {
            String aux = it.next();
            if(aux.equals(raza)){
                it.remove();
            }
        }
        razas.forEach(e -> System.out.print(" "+e) );
        
        
        
    }
    
    
    
}
