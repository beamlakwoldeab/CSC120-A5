import java.util.ArrayList;

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

    public Engine getEngine(){
        return this.engine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        return (this.passengerCapacity);
    }

    public int seatsRemaining(){
        int i = 0;
        for (Car c : cars){ 
            i += c.seatsRemaining();      
    } 
    return i;
    }
    
    public void printManifest(){
        for (Car c : cars){
            c.printManifest();

        }
    }

    public static void main(String[] args) {
    
}
}
