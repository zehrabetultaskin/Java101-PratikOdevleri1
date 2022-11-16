package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// Dik üçgende hipotenüs bulan program.
        Scanner input=new Scanner(System.in);
    double a,b,c,hipotenus=0;

        System.out.print("İlk kenar uzunluğunu giriniz: ");
        a=input.nextInt();

        System.out.print("İkinci kenar uzunluğu giriniz: ");
        b=input.nextInt();

        c=(b*b)+(a*a);
        hipotenus= (double) Math.sqrt(c);
        System.out.println("Üçgenin hippotenüsü: "+hipotenus);
    }
}
