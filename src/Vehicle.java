abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void move();

    public String displayInfo(){
        return  "Транспорт: " + brand +"\nModel: " + model +"\nYear: " + year;
    }
}

class Car extends Vehicle{
    private String fuelType;

    public Car(String brand, String model, int year, String fuelType){
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("bom-bom");
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nFuel type: " + fuelType;

    }
}

class Bicycle extends Vehicle{
    private int gearCount;

    public Bicycle(String brand, String model, int year, int gearCount){
        super(brand, model, year);
        this.gearCount = gearCount;
    }

    public void move(){
        System.out.println("Tss-tss");
    }

    public String displayInfo(){
        return super.displayInfo() + "\n"+ gearCount;
    }
}
class Garage{
    public static void main(String[] args) {
        Car car = new Car("AUDI", "A6", 2002, "Gas");
        car.move();
        System.out.println(car.displayInfo());

        Bicycle bicycle = new Bicycle("SKY", "BS", 2024, 12);
        System.out.println(bicycle.displayInfo());

    }
}

