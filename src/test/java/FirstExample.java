import org.testng.annotations.Test;

public class FirstExample {
    @Test
    public void testName() {
        System.out.println("Hello, Portnov school");
    }

    @Test
    public void testShouldPrintHello() {
        System.out.println("Goodbye, World");

    }

    @Test
    public void testNumbers() {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void testNumbers2() {
        int numberOfClick = 5;
        int anotherNumber;
        anotherNumber = 6 + numberOfClick;

        System.out.println(anotherNumber);
    }

    @Test
    public void testMoreNumbers() {
        int numberOfClick = 5;
        int anotherNumber = 5;

        System.out.println(5 + 6 + anotherNumber + numberOfClick);

    }

    @Test
    public void testConcatenation() {

        String leftPartOfMessage = "Who  who who who!";
        String rightPartOfMessage = "Who let the dogs out?";

        System.out.println(rightPartOfMessage + " " + leftPartOfMessage);

    }


    public void printClickMessage(int firstNumber, int secondNumber) {

        String messagePrefix = "firstNumber value is: ";
        String messagePostfix = "secondNumber value is: ";
        System.out.println(messagePrefix + firstNumber + "\n" + messagePostfix + secondNumber);
    }

    @Test
    public void testMyMethod() {
        printClickMessage(5, 6);
    }

    @Test
    public void testMyMethod002() {
        printClickMessage(523, 6234);
    }

    @Test
    public void testLoginTest() {
        loginStep("tomsmith", "supersecretpassword");
    }

    public void loginStep(String loginValue, String passwordValue) {
        System.out.println("I typed login: " + loginValue);
        System.out.println("I typed password: " + passwordValue);
        System.out.println("I clicked login button");
    }

    @Test
    public void testArrays() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        //arrayOfInts[2] = 4;

        System.out.println(arrayOfInts[2]);
    }

    @Test
    public void testForLoop() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        for (int i = 0; i < arrayOfInts.length; i++) {
            int currentValue = arrayOfInts[i];
            System.out.println(currentValue);
        }
    }

    @Test
    public void test0015() {
        int[] array = {1, 34, 5, 653, 737, 357357, 54};

        searchForElement(array, 737);
    }

    public void searchForElement(int[] array, int valueToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                System.out.println("element value found: " + array[i]);
                System.out.println("index of the element: " + i);

            }
        }
    }
    @Test
    public void test0678() {
        int[]  array = {1, 34, 5, 653, 737, 357357, 54};
        int valueToSearch = 737;

        for (int i = 0; i < array.length; i++){
            if(array[i] == valueToSearch) {
                System.out.println("element value found: " + array[i]);
                System.out.println("index of the element: " + i);
            }
            else {
                System.out.println(" element is not found");

            }
        }
    }
}