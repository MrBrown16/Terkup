/*
 * File: Cone.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.02.13
 * Github:
 * Licence: GNU GPL
 */


public class Cone {

    public double calcVol(double radius, double height){
        double volume = (1./3)*Math.pow(radius, 2)*Math.PI*height; 
        return volume;
    }
}
