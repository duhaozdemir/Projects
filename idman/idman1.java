package com.mycompany.idman;

public class idman1 {
    private int barfiks_sayisi;
    private int mekik_sayisi;
    private int pullup_sayisi;
    private int squad_sayisi;

    public idman1(int barfiks_sayisi, int mekik_sayisi, int pullup_sayisi, int squad_sayisi) {
        this.barfiks_sayisi = barfiks_sayisi;
        this.mekik_sayisi = mekik_sayisi;
        this.pullup_sayisi = pullup_sayisi;
        this.squad_sayisi = squad_sayisi;
    }

    public int getBarfiks_sayisi() {
        return barfiks_sayisi;
    }

    public void setBarfiks_sayisi(int barfiks_sayisi) {
        this.barfiks_sayisi = barfiks_sayisi;
    }

    public int getMekik_sayisi() {
        return mekik_sayisi;
    }

    public void setMekik_sayisi(int mekik_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
    }

    public int getPullup_sayisi() {
        return pullup_sayisi;
    }

    public void setPullup_sayisi(int pullup_sayisi) {
        this.pullup_sayisi = pullup_sayisi;
    }

    public int getSquad_sayisi() {
        return squad_sayisi;
    }

    public void setSquad_sayisi(int squad_sayisi) {
        this.squad_sayisi = squad_sayisi;
    }
   public void hareketyap(String hareketturu, int sayi){
       if(hareketturu.equals("Barfiks")){
           Barfiksyap(sayi);
       }else if(hareketturu.equals("Mekik")){
           Mekikyap(sayi);
       }else if(hareketturu.equals("Pullup")){
           Pullupyap(sayi);
       }else if(hareketturu.equals("Squad")){
           Squadyap(sayi);
       }else{
           System.out.println("Gecersiz Hareket");
       }
   }
       public void Barfiksyap(int sayi){
           if(barfiks_sayisi==0){
               System.out.println("Yapilacak barfiks kalmadı.");
           }if(barfiks_sayisi-sayi<0){
               System.out.println("Yapilacak barfiks miktarını geçtin,tebrikler!!");
           }else{
               barfiks_sayisi-=sayi;
               System.out.println("Kalan barfiks sayisi= "+barfiks_sayisi);
               
           }
       }
       public void Mekikyap(int sayi){
           if(mekik_sayisi==0){
               System.out.println("Yapilacak mekik kalmadı.");
           }if(mekik_sayisi-sayi<0){
               System.out.println("Yapilacak mekik miktarını geçtin,tebrikler!!");
           }else{
               mekik_sayisi-=sayi;
               System.out.println("Kalan mekik sayisi= "+mekik_sayisi);
               
           }
       }
       public void Pullupyap(int sayi){
           if(pullup_sayisi==0){
               System.out.println("Yapilacak pullup kalmadı.");
           }if(pullup_sayisi-sayi<0){
               System.out.println("Yapilacak pullup miktarını geçtin,tebrikler!!");
           }else{
               pullup_sayisi-=sayi;
               System.out.println("Kalan pullup sayisi= "+pullup_sayisi);
               
           }
       }
       public void Squadyap(int sayi){
           if(squad_sayisi==0){
               System.out.println("Yapilacak squad kalmadı.");
           }if(squad_sayisi-sayi<0){
               System.out.println("Yapilacak squad miktarını geçtin,tebrikler!!");
           }else{
               squad_sayisi-=sayi;
               System.out.println("Kalan squad sayisi= "+squad_sayisi);
               
           }
       }
       public boolean idmanbittiMi(){
           return (barfiks_sayisi==0)&&(mekik_sayisi==0)&&(pullup_sayisi==0)&&(squad_sayisi==0);
       }
   } 


