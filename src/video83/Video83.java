
package video83;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;
        
        
        System.out.println("Llenar el arreglo");
        for (int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
            
        }
        
        // Pedimos la posicion en el rango de 0 a 9
        do {
            System.out.print("Digite una posicion(0-9): ");
            posicion= teclado.nextInt();
            
        } while(posicion<0 || posicion>9);
        
        //Eliminando el elemento de posicion indicada
        for (int i=posicion;i<9;i++){
            arreglo[i] = arreglo [i+1];
        }
        
        System.out.println("\nEl arreglo queda:");
        for (int i=0;i<9;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
       
    }
    
}
