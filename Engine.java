// storing information about its fuel type, level, etc.
public class Engine {
    FuelType f;
    private double fuel_level;
    private final double max_fuel_level = 100;


    public Engine(FuelType f, double fuel_level) {
        this.f = f;
        this.fuel_level = fuel_level;
    }

    public void refuel() {
        fuel_level = max_fuel_level;
        System.out.println(fuel_level);
    }

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
    public double getFuelLevel(){
        return fuel_level;
    }

    public double getMaxFuelLevel(){
        return max_fuel_level;
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 1.0);

       

    }

}