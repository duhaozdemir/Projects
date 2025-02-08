package com.mycompany.basitatm;

import java.util.Scanner;


public class BasitATM {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);

        //Basit ATM programı
         
        int bakiye=800;
        int miktar=0;
        int yenibakiye;
        System.out.println("1-Bakiye ogrenme");
        System.out.println("2-Para cekme");
        System.out.println("3-Para yatirma");
        System.out.println("Cikis icinse 0'a basin");
        System.out.println("Yapmak istediginiz islemi giriniz: ");
        
        int islem=scanner.nextInt();
        
        while(islem<4){
            if(islem==0){
             System.out.println("Cikis yapiliyor..");
             break;
            }   
           
            if(islem==1){
           System.out.println("Bakiyeniz: "+bakiye);
           break;
            }
            
            if(islem==2){
                System.out.println("Cekilecek miktari giriniz;");
                miktar=scanner.nextInt();
                 if (miktar > bakiye) {
                    System.out.println("Yeterli bakiyeniz yok.. " + bakiye);
                } else {
                    bakiye -= miktar;
                    System.out.println("Islem basarili. Kalan bakiye: " + bakiye);
                }

        
                break;  }              
            }
            if(islem==3){
                System.out.println("Yatirilacak miktari giriniz: ");
                miktar=scanner.nextInt();
                yenibakiye=bakiye+miktar;
                System.out.println("Yeni bakiye: "+yenibakiye);
            }
    }
}