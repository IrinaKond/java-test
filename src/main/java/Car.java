public class Car {
    private String make;
    private String model;
    private String color;
    private String vin;
    private int maxVelocity;
    private int currentVelocity;

    public Car(String make, String model, String color, String vin, int maxVelocity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.maxVelocity = maxVelocity;
        this.currentVelocity = 0;
        PrintSpecs();
    }

    public void Start(int initialVelocity){
        currentVelocity = initialVelocity;
    }

    public int Accelerate(int velocity){
        currentVelocity = currentVelocity + velocity;
        System.out.println("Velocity: " + currentVelocity);
        return currentVelocity;
    }

    public boolean IsDriving () {
        return currentVelocity > 0;
    }

    public void Stop() {
        currentVelocity = 0;
        System.out.println("Car stopped");

    }

    public void PrintSpecs(){
        System.out.println("Make: " + this.make + ". Model: " + this.model + ". Color:" + this.color + ". Vin: " + this.vin + ". MaxVelocity: " + this.maxVelocity + ". CurrentVelocity: " + this.currentVelocity);
    }
}

