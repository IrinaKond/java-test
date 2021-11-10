import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InterviewQuestions {
    //1. Loop that goes over values from 1 to 10
    //2.  By using % operator, evaluate if number is even or odd
    //3. Using If statement print out  only even numbers
    @Test
    public void testName() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    @Test
    public void testName001() {
        solution();
    }

    public void solution() {
        //TODO: your code here
    }

    @Test
    public void testName002() {
    }

    public void solutionHelloWorld() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println("Hello, World");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1, 2, 3, 4};
        swapSolution(array, 1,2);
        System.out.println(Arrays.toString(array));
    }

    private void swapSolution(int[] array, int leftElement, int rightElement) {
        int temp = array[leftElement];
        array[leftElement] = array[rightElement];
        array[rightElement] = temp;
    }

    @Test
    public void testTwoDimArray() {
        String[][] garage = {
                            {"first car", "second car", "third car"},
                             {"first car002", "Volvo", "third car002"}
        };
        String carToFind = "Toyota";

        Assert.assertTrue(solutionForGarage(garage, carToFind));

        System.out.println(Arrays.deepToString(garage));
    }


    @Test
    public void testTwoDimArray002() {
        String[][] garage = {
                {"first car", "second car", "third car"},
                {"first car002", "Volvo", "third car002"}
        };
        String carToFind = "Toyota";

        boolean result = solutionForGarage(garage, carToFind);

        Assert.assertFalse(result);

        System.out.println(Arrays.deepToString(garage));
    }



    private boolean solutionForGarage(String[][] garage, String carToFind) {

        boolean result = false;
        for (String[] eachFloor : garage) {
            for (String eachCar : eachFloor) {
                System.out.println(eachCar);
                if (eachCar.equalsIgnoreCase(carToFind)) {
                    System.out.println("THAT'S" + carToFind.toUpperCase());
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    @Test
    public void testCountLetters002() {
        String input = "hello World";
        char letterToFind = 'h';

        int amountOfFoundLetters = solutionForLetter(input, letterToFind);
        System.out.println(amountOfFoundLetters);

        int expectedNumber=1;
        Assert.assertEquals(expectedNumber, amountOfFoundLetters);

    }

    private int solutionForLetter(String input, char letterToFind) {
        int result = 0;
        for ( char eachChar : input.toCharArray()){
            if (eachChar==letterToFind) result ++;
        }
        return result;
    }
}



