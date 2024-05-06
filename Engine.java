public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }
    /*
     * getter for fuel type
     * @return fuel type
     */
    public FuelType getFuelType() {
        return fuelType;
    }
    /*
     * getter for the current fuel level
     * @return the current fuel level
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    /*
     * getter for the max fuel level
     * @return the maximum fuel level
     */
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }
    /*
     * method to refuel current fuel level to max fuel level
     * @param currentFuelLevel
     * @param maxFuelLevel
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }
    /*
     * go method for engine
     * @param currentFuelLevel
     */
    public boolean go() {
        if (currentFuelLevel > 0) {
            System.out.println("You have " + currentFuelLevel + " fuel remaining.");
            currentFuelLevel--;
            return true;
        } else {
            return false;
        }
    }

}

