package com.mycompany.basitgirispaneli;

import java.util.Scanner;


public class BasitGIRISPANELI {

    public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
        
    int girishakki=3;
    String sys_kullanici_adi="Duha Muhammet";
    String sys_parola="12345";
    
        System.out.println("Giris ekranina hosgeldiniz");
        
        while(girishakki>0){
            System.out.println("Kullanici adi: ");
            String kullanici_adi=scanner.nextLine();
            System.out.println("Parola: ");
            String parola=scanner.nextLine();
            if (kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Sisteme Hosgeldiniz"); break;}
                else if(kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                        System.out.println("Parolaniz yanlis,tekrar deneyin");
                        girishakki--;
                        System.out.println("kalan hakkiniz: "+girishakki);
                        
                        }
            else if(!kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                        System.out.println("Kullanici adiniz yanlis,tekrar deneyin");
                        girishakki--;
                        System.out.println("kalan hakkiniz: "+girishakki);}
            else if(!kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                        System.out.println("Kullanici adi ve parola yanlis,tekrar deneyin");
                        girishakki--;
                        System.out.println("kalan hakkiniz: "+girishakki);}
                        if(girishakki==0){
                            System.out.println("Giris hakkiniz bitti.");
                        }
                        }
            
    }
}
