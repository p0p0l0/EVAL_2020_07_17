/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.util.Scanner;

/**
 *
 * @author Thierry
 */
public class Q2 {

   
    public static void main(String[] args) {
        
        int n; 
        long prod;

        Scanner reader = new Scanner(System.in);

        prod = 1;

        System.out.print("saisir un entier positif ");
        n = reader.nextInt();
        for (int i = 1; i <= 2*n; i+=2) {
            
            prod = prod * i;
        }
        System.out.println("Le produit est: " +prod);
    }
    
}
