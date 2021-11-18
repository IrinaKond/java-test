public class SportCar extends Car{

    boolean isRoofOpen = false;

    public SportCar(String make, String model, String color, String vin, int maxVelocity) {
        super(make, model, color, vin, maxVelocity);
    }

    public void openRoof(){
        isRoofOpen = true;
        System.out.println("Roof is open.");
    }

    public void closeRoof(){
        isRoofOpen = false;
        System.out.println("Roof is closed.");
    }

    public void printSpecs(){
        System.out.println("Make: " + this.make + ". Model: " + this.model + ". Color:" + this.color + ". Vin: " + this.vin + ". MaxVelocity: " + this.maxVelocity + ". CurrentVelocity: " + this.currentVelocity +". Is roof Open:" + this.isRoofOpen);
    }
}
