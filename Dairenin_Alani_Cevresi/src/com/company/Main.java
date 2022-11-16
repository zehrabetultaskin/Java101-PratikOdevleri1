package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Dairenin alanını ve çevresini hesaplayan program
        Scanner input=new Scanner(System.in);
        double pi,r,a, alan, dilimAlan, cevre;
        pi=3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a=input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        dilimAlan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin diliminin alanı: "+dilimAlan);
    }
}
