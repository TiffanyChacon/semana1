/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

/**
 *
 * @author Tiffany
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamaño = 6;
      
        for(int a=1; a<tamaño;a++)
        {
            for(int espacios=1;espacios<tamaño-a;espacios++)
            {
            System.out.print(" ");
            }
            for(int tex=1;tex<=2*a-1;tex++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
