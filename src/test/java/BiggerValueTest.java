import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

        /* Test Data:
            3333, 9999
            Expected Result = 9999  */

    /* 1. Positive testing
      if (value1 < value2)
        return value1 */
    @Test
    public void testValueOneLowerValueTwo_HappyPath() {
        //arrange
        int value1 = 3333;
        int value2 = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(value1, value2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* if (value1 > value2)
        return value1 */
    @Test
    public void testValueOneGreaterValueTwo_HappyPath() {
        //arrange
        int value1 = 5833;
        int value2 = 2399;
        int expectedResult = 5833;

        //act
        int actualResult = new BiggerValue().biggerValue(value1, value2);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    /* Negative testing
        if (value1 > value2)
        return value1 */
    @Test
    public void testValueOneEqualValueTwo_NegativeTest() {
        //arrange
        int value1 = 2399;
        int value2 = 2399;
        int expectedResult = -1;

        //act
        int actualResult = new BiggerValue().biggerValue(value1, value2);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }


}
