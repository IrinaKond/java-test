import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void testName() {
        String testParamOne="Alex";
        String testParamTwo="Barab";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();

        studentOne.graduate();
        boolean isNameCorrect = studentOne.name.contentEquals("ALex");

       //Assert.assertTrue(isNameCorrect);

       Assert.assertEquals(studentOne.name, "Alex");

    }

        @Test
        public void testName032() {
            String testParamOne="StudentName001";
            String testParamTwo="StudentLastName001";

            Student studentOne = new Student(testParamOne, testParamTwo);

            studentOne.printName();

            studentOne.graduate();
            //boolean isNameCorrect = studentOne.name.contentEquals("Alex");

            // Assert.assertTrue(isNameCorrect);
            String expectedName = "StudentName001";

            Assert.assertEquals(studentOne.name, expectedName);

        }


}
