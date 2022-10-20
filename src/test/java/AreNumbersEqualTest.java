import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
        /*Test Data:
                    89, 89
                    Expected result: 0
                    -89, 89
                    Expected result: -1
                    89, -89
                    Expected result: 1 */

    //Positive testing

    // if (number1 == number2) return 0
    @Test
    public void testNumberOneEqualNumberTwo() {
        //arrange
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // if (number1 < number2) return -1
    @Test
    public void testNumberOneLessNumberTwo() {
        //arrange
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // if (number1 > number2) return 1
    @Test
    public void testNumberOneGreaterNumberTwo() {
        //arrange
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumberEqual(number1, number2);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
