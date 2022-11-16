package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Taksimetre hesaplayan program
        Scanner input=new Scanner(System.in);
       double km, taksimetreKM, taksimetre, taksimetreAcilis;
       taksimetreAcilis=10;
       taksimetreKM=2.20;
        System.out.print("Mesafeyi kilometre cinsinden giriniz: ");
        km=input.nextDouble();
        taksimetre=taksimetreAcilis+(km*taksimetreKM);
        if(taksimetre<20){
            taksimetre=20;
        }
        System.out.println("Ödenecek toplam tutar: "+taksimetre);
    }
}
