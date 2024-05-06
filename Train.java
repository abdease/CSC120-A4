import java.util.ArrayList;

public class Train {

    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }
    /*
     * getter for engine
     * @return engine
     */
    public Engine getEngine() {
        return engine;
    }
    /*
     * getter for car
     * @return car
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            return null;
        }
    }
    /*
     * getter for max capacity
     * @return maximum capacity 
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }
    /*
     * method for calculating seats remaining
     * @return remaining seats
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }
    /*
     * method to print passenger manifest
     * @param car
     */
    public void printManifest() {
        System.out.println("Passenger Manifest:");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println("Passengers aboard car " + (i + 1) + ":");
            car.printManifest();
        }
     }

     public static void main(String[] args) {
        Train myTrain = new Train(FuelType.INTERNAL_COMBUSTION, 100.0, 3, 20);
        Passenger passenger1 = new Passenger("Abby");
        Passenger passenger2 = new Passenger("Julia");
        Passenger passenger3 = new Passenger("Maddie");
        passenger1.boardCar(myTrain.getCar(0));
        passenger2.boardCar(myTrain.getCar(0));
        passenger3.boardCar(myTrain.getCar(1));
        myTrain.printManifest();
     }
}
