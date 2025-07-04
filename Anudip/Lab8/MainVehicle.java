class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }
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

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car("Honda", "City", 2021, 180);
        Bike bike = new Bike("Yamaha", "FZ", 2022, 120);

        System.out.println("Car Details: " + car.make + ", " + car.model + ", " + car.year + ", " + car.maximumSpeed);
        System.out.println("Bike Details: " + bike.make + ", " + bike.model + ", " + bike.year + ", " + bike.maximumSpeed);

        car.drive();
        bike.drive();
    }
}
