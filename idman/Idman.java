package com.mycompany.idman;

import java.util.Scanner;

public class Idman {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Idman programına hosgeldiniz..");
        
        String idmanlar="Hareket Listesi\n"
                        +"Barfiks\n"
                        +"Mekik\n"
                        +"Pullup\n"
                        +"Squad";
                        ;
        
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun.");
        
        System.out.println("Barfiks sayisi: ");
        int barfiks=scanner.nextInt();
        System.out.println("Mekik sayisi: ");
        int mekik=scanner.nextInt();
        System.out.println("Pullup sayisi");
        int pullup=scanner.nextInt();
        System.out.println("Squad sayisi: ");
        int squad=scanner.nextInt();

        scanner.nextLine();
        
        idman1 idman2=new idman1(barfiks,mekik,squad,pullup);
        
        System.out.println("Idman basliyor..");
        while(idman2.idmanbittiMi()==false){
            System.out.println("Hareket turu seciniz,buyuk kucuk harfe dikkat ediniz.(Barfiks,Mekik,Pullup,Squad");
            String tur=scanner.nextLine();
            System.out.println("Tekrar(sayi) giriniz");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman2.hareketyap(tur, sayi);
            
        }
    }
}
