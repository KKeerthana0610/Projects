package assignment5;
class Vehicle {
    protected String make;
    protected String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving");
    }

    // Getters and setters for attributes (optional)
    // ...
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota", "Camry", 2023, 180);
        Bike bike = new Bike("Honda", "CBR500R", 2023, 150);

        // Printing attributes
        System.out.println("Car: " + car.make + " " + car.model + " " + car.year + " " + car.maximumSpeed);
        System.out.println("Bike: " + bike.make + " " + bike.model + " " + bike.year + " " + bike.maximumSpeed);

        // Calling drive method
        car.drive();
        bike.drive();
    }


	}


