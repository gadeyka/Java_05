import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //Positive testing

    //(array != null) && (array.length != 0) && (number != Integer.MAX_VALUE)
    // return true
    @Test
    public void testValidArrayAndNumber_HappyPath() {
        //arrange
        int[] array = {6, 7, 8, 9, 10};
        int number = 5;
        boolean expectedResult = true;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //(array[i] <= number)
    @Test
    public void testValidArrayContainsValidNumber_HappyPath() {
        //arrange
        int[] array = {6, 7, 8, 9, 10, 3};
        int number = 3;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //(array[i] <= number)
    @Test
    public void testValidArrayLessThanNumber_HappyPath() {
        //arrange
        int[] array = {6, 7, 8, 9, 10, 3};
        int number = 11;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMaxValuePlusOne_HappyPath() {
        //arrange
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MAX_VALUE + 1;
        boolean expectedResult = true;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative test

    //(array = null) && (array.length = 0) && (number = Integer.MAX_VALUE)
    @Test
    public void testArrayIsNullNumberIsValid_Negative() {
        //arrange
        int[] array = null;
        int number = 11;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsEmptyNumberIsValid_Negative() {
        //arrange
        int[] array = {};
        int number = 11;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMaxValue_Negative() {
        //arrange
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MAX_VALUE;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrayIsValidNumberIsMinValueMinusOne_Negative() {
        //arrange
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MIN_VALUE - 1;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
