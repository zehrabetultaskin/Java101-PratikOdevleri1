package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //Not ortalaması hesaplayan program
        int matematik, kimya, biyoloji, turkce, tarih, cografya, ortalama;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuzu giriniz: ");
        matematik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.print("Coğrafya notunuzu giriniz: ");
        cografya=input.nextInt();

        ortalama=(matematik+kimya+biyoloji+turkce+tarih+cografya)/6;
        System.out.println("Ortalamanız: "+ ortalama);

        String durum=ortalama>60 ? "Geçti" : "Kaldı" ;
        System.out.println(durum);
    }
}
