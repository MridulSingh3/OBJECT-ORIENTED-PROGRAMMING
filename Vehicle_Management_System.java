import java.util.*;
class Vehicle{
    private String brand;
    private int speed;
    
    public Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void displayDetails(){
        System.out.println("Brand:"+this.brand+"\n"+"Speed:"+this.speed);
    }
    public void start(){
        System.out.println("Vehicle is Starting!");
    }
}

class Car extends Vehicle{
    private int numberOfDoors;
    
    public Car(String brand, int speed, int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors=numberOfDoors;
    }
    
    @Override
    public void start(){
        System.out.println("Car is Starting!");
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("\n"+"Number of Doors:"+this.numberOfDoors);
    }
}

class Bike extends Vehicle{
    private boolean hasGear;
    
    public Bike(String brand, int speed, boolean hasGear){
        super(brand,speed);
        this.hasGear=hasGear;
    }
    
    @Override
    public void start(){
        System.out.println("Bike is Starting!");
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("\n"+"Has Gear:"+this.hasGear);
    }
}
public class Main{
	public static void main(String[] args) {
	    Vehicle[]vehicles={
	        new Car("Toyota",500000,4),
	        new Bike("Splender",400000,true)
	    };
	    
	    for(Vehicle v:vehicles){
	        v.start();
	        v.displayDetails();
	    }
	}
}
