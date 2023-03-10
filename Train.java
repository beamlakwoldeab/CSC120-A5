import java.util.ArrayList;
/**
 * Represents a Train which contains many cars.
 */
public class Train {
    private ArrayList<Car> cars;
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;
    private final Engine engine;

    public Train(Engine engine,  FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = engine;
        this.fuelCapacity = engine.getFuelLevel();
        this.fuelType = engine.f;
        this.nCars = cars.size();
        for (Car c : cars){ 
            int i = 0;
            i += c.getCapacity();
            this.passengerCapacity = i;
        }
        
    }
    
/**
 * Returns the engine of the train.
 * @return engine
 */
    public Engine getEngine(){
        return this.engine;
    }
/**
 * Returns a single car of the train.
 * @param int i, which represents the ith car
 * @return car i
 */
    public Car getCar(int i){
        return cars.get(i);
    }
/**
 * Returns the maximum passenger capacity of the entire train.
 * @return the passenger capacity of the train.
 */
    public int getMaxCapacity(){
        return (this.passengerCapacity);
    }
/**
 * Returns the seats remaining on the entire train.
 * @return int i which is the number of seats remaining across all cars.
 */
    public int seatsRemaining(){
        int i = 0;
        for (Car c : cars){ 
            i += c.seatsRemaining();      
    } 
    return i;
    }
 /**
 * Prints out the names of all the people on the train
 */   
    public void printManifest(){
        for (Car c : cars){
            c.printManifest();

        }
    }

    public static void main(String[] args) {
    
}
}
