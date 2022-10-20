import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    /*
        Test Data:
        {0, 1, 2, 3, 4, 5} → 15
        {-7, -3} → -10
     */


    /*
    1. Positive testing
    if (array.length > 0)
    return sum of array numbers
     */
    @Test
    public void testAllNumbersInArrayArePositive_HappyPath() {
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAllNumbersInArrayAreNegative_HappyPath() {
        //arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAllNumbersInArrayArePositiveAndNegative_HappyPath() {
        //arrange
        int[] array = {-7, -3, 5};
        int expectedResult = -5;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    2. Negative testing
    if (array.length == 0)
    return -1
     */
    @Test
    public void testArrayIsZero_NegativeTest() {
        //arrange
        int[] array = {};
        int expectedResult = -1;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
