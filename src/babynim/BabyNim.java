/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynim;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class BabyNim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 3;
        int aInp;
        int b = 3;
        int bInp;
        int c = 3;
        int cInp;

        System.out.println("A: " + a + "    B: " + b + "    C: " + c);

        while (a > 0 && b > 0 && c > 0) {
            System.out.println("Choose a pile: ");
            String choice = input.next();

            if (choice.equals("a")) {
                System.out.print("How many to remove from pile A: ");
                aInp = input.nextInt();
                a = a - aInp;
                System.out.println("A: " + a + "    B: " + b + "    C: " + c);
                System.out.println("Choose a pile: ");
                choice = input.next();
            }
            if (choice.equals("b")) {
                System.out.print("How many to remove from pile B: ");
                bInp = input.nextInt();
                b = b - bInp;
                System.out.println("A: " + a + "    B: " + b + "    C: " + c);
                System.out.println("Choose a pile: ");
                choice = input.next();
            }
            if (choice.equals("c")) {
                System.out.print("How many to remove from pile C: ");
                cInp = input.nextInt();
                c = c - cInp;
                System.out.println("A: " + a + "    B: " + b + "    C: " + c);
                System.out.println("Choose a pile: ");
                choice = input.next();
            }
            
        }
        System.out.println("All piles are empty. Good job!");
    }

}
