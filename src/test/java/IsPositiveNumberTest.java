import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    //Positive testing


    //if number > 0
    // return true
    @Test
    public void testNumbersGreaterThatZero_HappyPath() {
        //arrange
        int number = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //if number == 0
    // return true
    @Test
    public void testNumberIsZero_HappyPath() {
        //arrange
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //if number == 0
    // return true
    @Test
    public void testNumbersLessThanZero_HappyPath() {
        //arrange
        int number = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
