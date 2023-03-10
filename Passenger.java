 /**
 * Stores information about each passenger.
 */

public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
 /**
 * Adds a passenger to a car 
 * @param Car c; a Car object
 */
    public void boardCar(Car c){
        try{
        if (c.getCapacity()<= c.max_capacity){
            c.addPassenger(this);
        }
        else{
            throw new RuntimeException();
        }       
    }
        catch(RuntimeException r) {
            System.out.println("Sorry, this car is full.");
        }
    }
/**
 * Removes a passenger from a car 
 * @param Car c; a Car object
 */
    public void getOffCar(Car c){
        try{
            c.removePassenger(this);
        }
        catch(RuntimeException r){
            System.out.println("This passenger is not on board. ");

        }
        
        }
    
    public static void main(String[] args) {
        Passenger bami = new Passenger("Bami");
        
    }
}
