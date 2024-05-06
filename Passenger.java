public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    /**
     * getter for name
     * @return the name
     */
    public String getName() {
        return name;
    }
    /*
     * add passenger to specific cars
     */
    public void boardCar(Car c) {
        boolean boarded = c.addPassenger(this);
        if (boarded) {
            System.out.println(name + " boarded the car.");
        } else {
            System.out.println("Sorry, there are no more seats available.");
        }
    }
    /*
     * method for passengers to get off cars
     */
    public void getOffCar(Car c) {
        boolean gotOff = c.removePassenger(this);
        if (gotOff) {
            System.out.println(name + " got off the car.");
        } else {
            System.out.println(name + " was not onboard.");
        }
    }
}
