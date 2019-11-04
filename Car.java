/*
Implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.
*/

import java.text.DecimalFormat;

public class Car{

private String make = "";
private String model = "";
private double fuelEfficiency = 0;
private double fuelCapacity = 0;
private double currentGas = 0;
String format = "###.##";
DecimalFormat Format = new DecimalFormat(format);



public void status(){
  System.out.println("Make: " + make);
  System.out.println("Model: " + model);
  System.out.println("Fuel efficiency: " + fuelEfficiency + " miles/gallon");
  System.out.println("Fuel capacity: " + fuelCapacity + " gallons");
  System.out.println("Current gas: " + currentGas + " gallons");
  System.out.println("");
}

public void setStatus(String MA, String MO, double FE, double FC){
  make = MA;
  model = MO;
  fuelEfficiency = FE;
  fuelCapacity = FC;
  currentGas = FC;
}

public void Drive(double miles){
    double usedGas = miles/fuelEfficiency;
    while(usedGas > currentGas){
      miles = miles -.1;
      usedGas = (miles)/fuelEfficiency;
    }
    System.out.println("drove "+ Format.format(miles) + " miles.");
    currentGas = currentGas - usedGas;
    System.out.println("Gas used: " + Format.format(usedGas) + " gallons");
    System.out.println("Gas left: " + Format.format(currentGas) + " gallons");
}

public void refuel(double fuel){
  if(fuel > fuelCapacity || currentGas + fuel > fuelCapacity){
    currentGas = fuelCapacity;
    System.out.println("filled up to full");
    System.out.println("");
  }else{
    currentGas = currentGas + fuel;
    System.out.println("filled up " + fuel + " gallons");
    System.out.println("CurrentGas: " + Format.format(currentGas) + " gallons");
    System.out.println("");
  }

}

}
