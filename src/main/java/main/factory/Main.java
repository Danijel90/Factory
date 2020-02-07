/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Pocetak");
        
        
        String massage = "Ovo je poruka";
        
        Car fiat = new Car ();
        fiat.model = "Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 189;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model: " + fiat.model);
        System.out.println("Godiste: " + fiat.buildYear);        
        System.out.println("Boja: " + fiat.color);  
        System.out.println("Potrosnja: " + fiat.consumption);
        System.out.println("Maksimalna brzina: " + fiat.maxSpeed);
        System.out.println("Trenutno stanje: " + fiat.currentFuel);
        System.out.println("Zapremina rezervoara: " + fiat.model);
        System.out.println("Zapremina rezervoara: " + fiat.model);
       
    }
    
}
