package com.mycompany.hafiza_oyunu;

import java.util.Scanner;


public class Hafiza_oyunu {

    private static Kartlar[][] kartlar1= new Kartlar[4][4];
    
    public static void main(String[] args) {
              
kartlar1[0][0] = new Kartlar("E");
kartlar1[0][1] = new Kartlar("A");
kartlar1[0][2] = new Kartlar("F");
kartlar1[0][3] = new Kartlar("B");

kartlar1[1][0] = new Kartlar("G");
kartlar1[1][1] = new Kartlar("H");
kartlar1[1][2] = new Kartlar("A");
kartlar1[1][3] = new Kartlar("C");

kartlar1[2][0] = new Kartlar("D");
kartlar1[2][1] = new Kartlar("B");
kartlar1[2][2] = new Kartlar("H");
kartlar1[2][3] = new Kartlar("F");

kartlar1[3][0] = new Kartlar("E");
kartlar1[3][1] = new Kartlar("G");
kartlar1[3][2] = new Kartlar("C");
kartlar1[3][3] = new Kartlar("D");

Oyuntahtasi();
while(oyunbittimi()==false){
    Oyuntahtasi();
    tahmnitet();
    
}
    }
   public static void Oyuntahtasi(){
       
       for(int i=0; i<4; i++){
          System.out.println("_____________________");
           for(int j=0; j<4; j++){
               if(kartlar1[i][j].isTahmin()){
               System.out.print(" |"+kartlar1[i][j].getDeger()+"| ");
               
           }
               else{
                   System.out.print(" | | ");
               }
       }
           System.out.println();
   }
    System.out.println("_____________________");   
}
   public static boolean oyunbittimi(){
       for(int i=0; i<4; i++){
           for(int j=0; j<4; j++){
               if(kartlar1[i][j].isTahmin()==false){
                   return false;
               }
               }
           }
    
       return true;
   }
   public static void tahmnitet(){
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("Birinci tahmininizi(i ve j birlikte) giriniz.");
       
       int i1=scanner.nextInt();
       int j1=scanner.nextInt();
       
       kartlar1[i1][j1].setTahmin(true);
       Oyuntahtasi();
       
       System.out.println("Ikinci tahmininizi(i ve j birlikte) giriniz.");
       
       int i2=scanner.nextInt();
       int j2=scanner.nextInt();
       
       if(kartlar1[i1][j1].getDeger()==kartlar1[i2][j2].getDeger()){
           
           System.out.println("Dogru tahmin ettiniz,tebrikler!");
           kartlar1[i2][j2].setTahmin(true);
       }
       else{
           kartlar1[i1][j1].setTahmin(false);
           System.out.println("Yanlis tahmin ettiniz,tekrar deneyin.");
       }
       
   }
}