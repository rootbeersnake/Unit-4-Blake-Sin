public class carTester{
  public static void main(String[] args){
    Car myCar1 = new Car();
    Car myCar2 = new Car();
    Car myCar3 = new Car();


    myCar1.setStatus("Toyota", "Highlander", 21, 19.2);
    myCar1.status();
    myCar1.Drive(6);
    myCar1.refuel(12);

    myCar2.setStatus("Ford", "Fiesta", 27, 12.4);
    myCar2.status();
    myCar2.Drive(1000);
    myCar2.refuel(12.3);

    myCar3.setStatus("BMW", "M3", 17, 15.9);
    myCar3.status();
    myCar3.Drive(6);
    myCar3.refuel(100);
  }
}
