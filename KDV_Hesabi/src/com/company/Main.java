package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //Girilen fiyata göre KDV tutarını ve KDV'li tutarı hesaplayan program.
        double fiyat, kdv, kdvFiyat;
        Scanner input= new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        fiyat=input.nextDouble();
        if(fiyat>0 && fiyat<1000){
            kdv=((fiyat*18)/100);
            kdvFiyat=kdv+fiyat;
            System.out.println("%18 KDV ile yeni tutar: "+kdvFiyat);
            System.out.println("KDV tutarı: "+kdv);
        }
        else if(fiyat>1000){
            kdv=((fiyat*8)/100);
            kdvFiyat=kdv+fiyat;
            System.out.println("%8 KDV ile yeni tutar: "+kdvFiyat);
            System.out.println("KDV tutarı: "+kdv);
        }
        else {
            System.out.println("Yanlış bir değer girdiniz...");
        }
        }
    }
