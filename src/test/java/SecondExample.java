import org.testng.annotations.Test;

public class SecondExample {

    @Test
    public void testName() {
        int variableOne = 1;
        int variableTwo = 67;
        //System.out.println(variableOne+" "+variableTwo);
        printTwoNumbers(variableOne, variableTwo);
    }

    public void printTwoNumbers(int firstParameter, int secondParameter) {
        System.out.println(firstParameter + " " + secondParameter);
    }

    @Test
    public void test001() {

        float floatValue = (float) 4.5;
        float floatValue2 = 4.6f;
        int floatValue3 = (int) 4.5;
        System.out.println(floatValue3);

        //printTwoNumbers(floatValue, floatValue2);
    }

    @Test
    public void testMLOgic() {
        int amountOfLinks = 5;
        int amountOfClicks = 5;


    }

    @Test
    public void testMoreLogical() {
        int amountOfLinks = 5;
        int amountOfClicks;

        System.out.println ("Keep clicking on links");
    }



    @Test
    public void testBooleans() {

        int amountOfLinks = 5;
        int amountOfClicks = 4;

        boolean elementOneIsVisible = true;

        boolean ifThereAreStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;

        boolean isThereStillSomeTime = isThereStillSomeTimeToClick(currentTime, timeSinceTestStarted);

        if (elementOneIsVisible && ifThereAreStillLinksToClick && isThereStillSomeTime) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }
        }





    public boolean isThereStillSomeTimeToClick(int currentTime, int timeSinceTestStarted) {
        boolean result=false;
        result=(currentTime-timeSinceTestStarted)>1000;

        return result;

    }

    @Test
    public void testArrays() {
        int[] arrayOfNumbers={1,2,3,4,5};
        String firstCar="Volvo";
        String secondCar="Toyota";
        String thirdCar="Tesla";
        String[] garage={firstCar, secondCar, thirdCar};
        for(int i=0; i<garage.length;i++) {
       System.out.println("Car" + "[" + i + "]=" + garage[i]);
        }
        for(String eachCar: garage) {
            System.out.println(("Car:" + eachCar));
        }
        }

    @Test
    public void testWhile() {
        int i=0;
        while(i<10) {
            System.out.println("WHILE IS STILL ON");
            i++;
        }
    }



}


