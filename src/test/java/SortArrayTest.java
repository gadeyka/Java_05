import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    /* 1. Positive testing
    Test Data:
    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}*/


    //Valid array
    @Test
    public void testValidArray_HappyPath() {
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Valid array
    @Test
    public void testValidArrayAllValuesAreEqual_HappyPath() {
        //arrange
        int[] array = {5, 5, 5};
        int[] expectedResult = {5, 5, 5};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing

    //null array
    @Test
    public void testNullArrayNegative() {
        //arrange
        int[] array = null;
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //null array
    @Test
    public void testEmptyArrayNegative() {
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new SortArray().sortArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
