interface Vehicle {
    void move();

    default void stop() { // Default-метод с реализацией
        System.out.println("Остановился.");
    }

    static void info() { // Static-метод с реализацией
        System.out.println("Интерфейс транспорта.");
    }
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Машина едет.");
    }
}

class Mainnn {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();  // Машина едет.
        car.stop();  // Остановился.
        Vehicle.info(); // Интерфейс транспорта.
    }
}