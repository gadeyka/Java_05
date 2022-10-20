import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    /*
    Positive testing - Happy path
         anyNumber % 2 == 0
          return "Even";
             else
                return "Odd";
    */

    //even = 0
    @Test
    public void testEven0Number_HappyPath() {
        //arrange
        int anyNumber = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(anyNumber);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //even = 222222
    @Test
    public void testEvenNumbers_HappyPath() {
        //arrange
        int anyNumber = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(anyNumber);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //odd = -345
    @Test
    public void testOddNumber_HappyPath() {
        //arrange
        int anyNumber = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(anyNumber);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
