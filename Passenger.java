public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

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
