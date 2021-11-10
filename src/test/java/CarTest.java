import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {

    @Test
    public void test1() {
        Car myCar = new Car("Honda", "Fit", "Red", "12345a", 100);
        myCar.Start(10);
        myCar.Accelerate(20);
        myCar.IsDriving();
        myCar.Stop();
        myCar.PrintSpecs();
    }
}