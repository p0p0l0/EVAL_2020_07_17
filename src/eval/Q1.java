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
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n;

        System.out.println("Saisir un nombre");
        n = reader.nextInt();

        for (int i = n; i < n + 10; i++) {

            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }

        }

    }

}
