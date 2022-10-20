import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

   /*
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
    */


    /*
    1. Positive testing
    if (array.length > 1)
     */
    @Test
    public void testArrayLengthGreaterThanOne_HappyPath() {
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    2. Negative testing
    if (array.length = 1)
    return new int[0];
     */
    @Test
    public void testArrayLengthEqualOne_NegativeTest() {
        //arrange
        int[] array = {-45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    3. Negative testing
    if (array.length = 0)
    return new int[0];
     */
    @Test
    public void testArrayLengthEqualEmpty_NegativeTest() {
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
