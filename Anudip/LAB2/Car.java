public class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCar() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", "Urus", (short) 2023, 40000000);
        Car car2 = new Car("BMW", "X4", (short) 2022, 3000000);

        car1.displayCar();
        car2.displayCar();
    }
}
