import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    //10. Positive testing
    // return count
    @Test
    public void testCountEvenNumbersInArray() {
        //arrange
        int[] array = {11, 5, 67, 83, 8, 40};
        int expectedResult = 2;

        // act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //11. Positive testing
    // return count
    @Test
    public void testCountOddNumbersInArray() {
        //arrange
        int[] array = {45, 11, 5, 67, 83, 8, 40};
        int expectedResult = 5;

        // act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
