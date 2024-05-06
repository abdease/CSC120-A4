import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>(maxCapacity);
    }
    /*
     * getter for car capacity
     * @return max capacity of car
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /*
     * number of seats remaining 
     * @param maxCapacity
     * @param passengers.size
     * @return seats remaining
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }
    /*
     * adding passenger method
     * @param maxCapacity
     * @param passenger
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }
    /*
     * remove passenger method
     * @param passenger
     */
    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        } else {
            System.out.println("Passenger is not onboard.");
            return false;
        }
    }
    /*
     * method to print passenger manifest
     * @param passenger
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers aboard:");
            for (Passenger passenger : passengers) {
                System.out.println(passenger.getName());
            }
        }
    }
}