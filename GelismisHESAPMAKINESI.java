package com.mycompany.gelismishesapmakinesi;

import java.util.Scanner;



public class GelismisHESAPMAKINESI {
    
    public static int toplama(int a,int b){
        
        int toplam=a+b;
        
        return toplam;
        
    }
    public static int cikarma(int a,int b){
        
        return (a-b);
    }
    public static int carpim(int a,int b){
        
        int carpim=a*b;
        return carpim;
    }
    public static double bolum(int a,int b){
       
        return ((double)a/b);
    }
     public static int toplama(int a,int b,int c){
        
        int toplam=a+b+c;
        
        return toplam;
}
        public static int carpim(int a,int b,int c){
        
        int carpim=a*b*c;
        return carpim;
    }


    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        String islemler= "1.Toplama işlemi/n"
                        +"2.Çıkarma işlemi/n"
                        +"3.Çarpma işlemi/n"
                        +"4.Bölme işlemi/n"
                        +"Çıkış için q";
       while(true){
           System.out.println("Islem seciniz: ");
           String islem=scanner.nextLine();
           if(islem.equals("q")){
               System.out.println("Programdan cikiliyor..");
               break;
            }
           else if(islem.equals("1")){
               System.out.println("Kac sayi toplayacaksiniz?");
              int kacsayi = scanner.nextInt();
               scanner.nextLine(); // TEMİZLEME: nextInt'ten sonra kalan \n temizleniyor.
           if(kacsayi==2){
                  System.out.println("a:");
                  int a = scanner.nextInt();
                  System.out.println("b:");
                  int b = scanner.nextInt();
                  scanner.nextLine();
                  System.out.println("Toplam: "+toplama(a, b));
              }
           else if(kacsayi==3){
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Toplam: "+toplama(a, b, c));
           }
           else{
                  System.out.println("Gecersiz islem...");
                  break; }
}
        if(islem.equals("2")){
            System.out.println("sayilari giriniz");
            System.out.println("a: ");
            int a=scanner.nextInt();
            System.out.println("b: ");
            int b=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sonuc: "+cikarma(a, b));
        }
        else if (islem.equals("3")){
            System.out.println("Kac sayiyi carpacaksiniz? "); 
            int kacsayi=scanner.nextInt();
            if(kacsayi==2){
            System.out.println("sayilari giriniz");
            System.out.println("a: ");
            int a = scanner.nextInt();
            System.out.println("b:");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sonuc: "+carpim(a, b));
            break;
        }
            if(kacsayi==3){
            System.out.println("sayilari giriniz");
            System.out.println("a: ");
            int a=scanner.nextInt();
            System.out.println("b: ");
            int b=scanner.nextInt();
            System.out.println("c");
            int c=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Sonuc: "+carpim(a, b, c)); 
            break;
            }
            else{
                System.out.println("Gecersiz islem...");
            }
        }
       if(islem.equals("4")){
            System.out.println("a:");
                  int a = scanner.nextInt();
                  System.out.println("b:");
                  int b = scanner.nextInt();
                  scanner.nextLine();
                  if(b==0){
                      System.out.println("Bir sayi 0'a bolunemez!!!! ");
                  }
                  System.out.println("Bolum: "+bolum(a, b));
                  
       }
        }
}
}

