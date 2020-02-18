package main.factory;

/**
 *
 * @author Nenad
 */
 public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private double mileage;
    private int passangers;
    private int seats;
     
      
      public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel= 0;
        this.currentFuel = 0;
        this.consumption = 0;      
        this.mileage = 0;
        this.passangers = 1;
    }
    
    
    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor,int customMaxFuel, int customMileage) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxSpeed = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.mileage = customMileage;
    }
    
      
    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor,int customMaxFuel, int customCurrentFuel, int customConsumption) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxSpeed = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
    }
    
    public String getModel() {
        return this.model ;
    }
    
    public void setModel(String customModel) {        
        this.model = customModel;
    }
    
    
           
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor (String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel() {
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption() {
        return this.consumption;
    }
    
    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public String getVehicleType() {
        return this.vehicleType;
    }
    
     public double getMileage() {
        return this.mileage;
    }
    
    public void setMileage(int customMileage) {
        this.mileage = customMileage;
    }
    
    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina Proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Maksimalna Brzina: " + this.getMaxSpeed());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel ()); 
        System.out.println("Predjena kilometraza je: " + this.getMileage ());
        System.out.println("");       
    }
    
    public void travel(int distance) {
        
if (this.getCurrentFuel() > (distance * this.getConsumption()) / 100 ) {
            this.mileage = this.getMileage() + distance;
        this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption()) / 100;
        } else {
            System.out.println("Nema dovoljno goriva za put od: " + distance);
        }
     }
          
             public void fuelUp (int refill) {
             
              int  emptySpace = this.getMaxFuel() - this.getCurrentFuel();
              
              if (refill <= emptySpace) { 
                   this.currentFuel = this.getCurrentFuel() + refill;
                   System.out.println("Uspesno ste sipali " + refill + "Novo stanje je :" + this.getCurrentFuel () );
              } else {
                  
                  this.currentFuel = this.getMaxFuel();
                  
                  System.out.println("Rezervoar je pun. Sipali ste: " + (emptySpace) );
              }
                 
          }
   
           public void getIn () {
              
           }
             
           public void getIn(int numberOfPeople) {
               
           }
             
           public void getOut () {
               
           }

           public void getOut (int numberOfPeople) {
               
               
           }
 }
