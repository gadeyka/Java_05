import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //Positive testing

    // (1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
    @Test
    public void testFiveNumbersToIntArray_HappyPath() {
        //arrange
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new CreateArray().createIntArray(number1, number2, number3, number4, number5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // (1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    @Test
    public void testFiveNumbersToDoubleArray_HappyPath() {
        //arrange
        double number1 = 1.1;
        double number2 = 2.5;
        double number3 = 3.7;
        double number4 = 4.0;
        double number5 = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double[] actualResult = new CreateArray().createDoubleArray(number1, number2, number3, number4, number5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // ("It”, "was”, "an”, "apple”, "pie”) -> {"It”, "was”, "an”, "apple”, "pie”}
    @Test
    public void testFiveWordToStringArray_HappyPath() {
        //arrange
        String str1 = "It";
        String str2 = "was";
        String str3 = "an";
        String str4 = "apple";
        String str5 = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createStringArray(str1, str2, str3, str4, str5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // ("It”, "was”, "an”, "apple”, "pie”) -> {"It”, "was”, "an”, "apple”, "pie”}
    @Test
    public void testTextToStringArray_HappyPath() {
        //arrange
        String str = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createArrayFromText(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
