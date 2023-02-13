/*
 * File: MainConsole.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.02.13
 * Github:
 * Licence: GNU GPL
 */

import java.util.Scanner;

public class MainConsole {
    public MainConsole(){
        about();
        Cone cone = new Cone();
        double radius = input("Sugár: ");
        double height = input("Magasság: ");
        
        System.out.println(cone.calcVol(radius,height));
    }

    public double input(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        double in = sc.nextDouble();

        return in;
    }
    public void about(){
        System.out.println("------------");
        System.out.println("Móra Barna");
        System.out.println("Szoft_I_1_N");
        System.out.println("2023.02.13");
        System.out.println("------------");

    }
}
