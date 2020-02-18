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
       
//        Car fiat = new Car();
//        fiat.model = "Fiat Punto";

//      Car fiat = new Car("Fiat Punto", "2010". "Black", 6, 20, 45);

        Car fiat = new Car("Fiat Punto", 2010, 180, "Black", 45, 220000);
                
//        fiat.setModel("Fiat Punto");
//        fiat.setBuildYear(2010);
//        fiat.setColor("black");
//        fiat.setConsumption(6);
//        fiat.setMaxSpeed(180);
//        fiat.setCurrentFuel(20);
//        fiat.setConsumption(45);
               
        fiat.showData();
        
//        System.out.println("");
        
        Car Audi = new Car("Audi a8", 2019, 220, "blue", 100, 20, 18);
        
        
//        ford.model = "Mustang GT";
//        ford.setModel("Mustang GT");
//        ford.setBuildYear(2016);
//        ford.setColor("Black with red stripes");
//        ford.setConsumption(20);
//        ford.setMaxSpeed(280);
//        ford.setCurrentFuel(50);
//        ford.setMaxFuel(100);
//        
        Audi.showData();
              
        
        
               
    }
    
    
    
}
