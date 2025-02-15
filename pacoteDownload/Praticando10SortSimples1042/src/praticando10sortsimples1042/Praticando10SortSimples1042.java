/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando10sortsimples1042;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando10SortSimples1042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int V[] = new int[3];
        Scanner teclado = new Scanner(System.in);
        int cc = 0;
        while (cc < 3) {
            V[cc] = teclado.nextInt();
            cc++;
        }
        
        int i = 0;
        
        int copia[] = new int[V.length];
        System.arraycopy(V, 0, copia, 0, V.length);
        while (i < copia.length) {
            Arrays.sort(copia);
            System.out.println(copia[i]);
            i++;
        }
        
        System.out.println(" ");
        
        int j = 0;
        while ( j < V.length) {
            System.out.println(V[j]);
            j++;
        }
            
        
    }
    
}
