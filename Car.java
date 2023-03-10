/**
 * Stores information about Car objects.
 */
import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    final int max_capacity;
    private int seats_remaining;

    public Car(int max_capacity){
        this.max_capacity = max_capacity;
        this.passengers = new ArrayList<Passenger>(max_capacity);
        this.seats_remaining = max_capacity - passengers.size();
        
    }
    /**
 * Returns the capacity of the car.
 * @return max_capacity
 */
    public int getCapacity(){
        return max_capacity;
    }
/**
 * Returns the number of seats remaining on a car
 * @return seats_remaining
 */
    public int seatsRemaining(){
        return seats_remaining;
    }
/**
 * Adds a passenger to the car.
 * @param p, passenger
 */
    public void addPassenger(Passenger p){
        try {
            if (seats_remaining > 0){
            passengers.add(p);
        }
        else if (seats_remaining <= 0)
            throw new RuntimeException();

    } 
        catch (RuntimeException r ){
            System.out.println("Sorry, we are out of capacity.");
        }}
/**
 * removes a passenger from the car.
 * @param p, passenger
 */
    public void removePassenger(Passenger p){
        try {
            if (passengers.contains(p)){
            passengers.remove(p);
        }
        else {
            throw new RuntimeException();
        }   
    }
        catch (RuntimeException r){
        System.out.println("That passenger is not was not in the car so we cannot remove them.");
    }
/**
 * Prints all the passengers in a car
 */
        }
    public void printManifest(){
        if (passengers.size() > 0) {
            for (int i = 0; i < passengers.size(); i++){
                System.out.println(passengers.get(i));
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
        
    }

    public static void main(String[] args) {
        Car c = new Car(40);
    
    }


    
}