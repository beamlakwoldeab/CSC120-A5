/**
 * Stores information about the engine of a train
 */
public class Engine {
    FuelType f;
    private double fuel_level;
    private final double max_fuel_level = 100;


    public Engine(FuelType f, double fuel_level) {
        this.f = f;
        this.fuel_level = fuel_level;
    }
/**
 * Refuels the engine (returns engine to maximum fuel level)
 */
    public void refuel() {
        fuel_level = max_fuel_level;
        System.out.println(fuel_level);
    }
/**
 * Decreases the fuel level of the engine by one each time method is called.
 */
    public void go() {
        try { if (fuel_level > 0){
            fuel_level -= 1.0;
        }
        else if (fuel_level <= 0){
            throw new RuntimeException();
        }
        }
        catch (RuntimeException r){
            System.out.println("It seems like we are out of fuel");
            
        }    
    }
/**
 * Returns the fuel level of the engine.
 * @return fuel_level
 */
    public double getFuelLevel(){
        return fuel_level;
    }
/**
 * Returns the maximum fuel level of the engine
 * @return max_fuel_level
 */
    public double getMaxFuelLevel(){
        return max_fuel_level;
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 1.0);

       

    }

}