
package org.example;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your first value");
        int x = scanner.nextInt();

        System.out.println("whats your second value");
        int y = scanner.nextInt();

        System.out.println("1: Addition \" \"2: Subtraction \" \"3: Multiplication \" \"4: Division");
        int opp = scanner.nextInt();

        if (opp == 1){
            System.out.println(x+y);
        }
        if (opp == 2){
            System.out.println(x-y);
        }
        if (opp == 3){
            System.out.println(x*y);
        }
        if (opp == 4){
            if (y == 0) {
                System.out.println ("undefined");
            }
            else
                System.out.println(x/y);
        }
    }
}