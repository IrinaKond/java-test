public class Car {
    String make;
    String model;
    String color;
    String vin;
    int maxVelocity;
    int currentVelocity;

    public Car(String make, String model, String color, String vin, int maxVelocity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.maxVelocity = maxVelocity;
        this.currentVelocity = 0;
        printSpecs();
    }

    public void start(int initialVelocity){
        currentVelocity = initialVelocity;
    }

    public int accelerate(int velocity){
        int newVelocity = currentVelocity + velocity;
        if (newVelocity > maxVelocity)
            currentVelocity = maxVelocity;
        else if (newVelocity <0)
            currentVelocity = 0;
        else
            currentVelocity = newVelocity;

        System.out.println("New Velocity: " + currentVelocity);
        return currentVelocity;
    }

    public boolean isDriving () {
        return currentVelocity > 0;
    }

    public void stop() {
        currentVelocity = 0;
        System.out.println("Car stopped");

    }

    public int getCurrentVelocity(){
        return currentVelocity;
}

    public void printSpecs(){
        System.out.println("Make: " + this.make + ". Model: " + this.model + ". Color:" + this.color + ". Vin: " + this.vin + ". MaxVelocity: " + this.maxVelocity + ". CurrentVelocity: " + this.currentVelocity);
    }
}

