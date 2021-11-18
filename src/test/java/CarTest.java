import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void carTest() {
        Car car = new Car("Honda", "Fit", "Red", "12345a", 100);
        car.start(10);
        car.accelerate(20);
        car.isDriving();
        car.stop();
        car.printSpecs();
    }

    @Test
    public void sportCarTest() {
        SportCar sportCar = new SportCar("Honda", "Fit", "Red", "12345a", 100);
        sportCar.start(10);
        sportCar.accelerate(20);
        sportCar.isDriving();
        sportCar.stop();
        sportCar.openRoof();
        sportCar.printSpecs();
    }

    @Test
    public void currentVelocityCannotBeMoreThanMaxVelocityTest() {
        int maxVelocity = 100;
        Car car = new Car("Honda", "Fit", "Red", "12345a", maxVelocity);

        car.start(0);
        car.accelerate(maxVelocity+1);
        Assert.assertTrue(car.getCurrentVelocity() <= maxVelocity);
    }

    @Test
    public void currentVelocityCannotBeLessThan0Test() {
        Car car = new Car("Honda", "Fit", "Red", "12345a", 100);

        car.start(0);
        car.accelerate(-1);
        Assert.assertTrue(car.getCurrentVelocity() >= 0);
    }
}