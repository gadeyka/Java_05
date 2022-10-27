import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //#1. Positive testing

    @Test
    public void testStringIsNotEmptyWithSpaces_HappyPath() {
        //arrange
        String str = "   Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";

        //act
        String actualResult = new StringMethods().removeSpaces(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringIsNotEmptyWithOutSpaces_HappyPath() {
        //arrange
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";

        //act
        String actualResult = new StringMethods().removeSpaces(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing

    @Test
    public void testStringIsEmpty_Negative() {
        //arrange
        String str = "";
        String expectedResult = "Строка пустая";

        //act
        String actualResult = new StringMethods().removeSpaces(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringIsEmpty_TEMP() {
        //arrange&act&assert
        Assert.assertEquals(new StringMethods().removeSpaces(""), "Строка пустая");
    }

    //#2. Positive testing

    @Test
    public void testRemoveSpaces_HappyPath() {
        //arrange
        String str = "   Red Rover School   ";
        String expectedResult = "Red Rover School";

        //act
        String actualResult = new StringMethods().removeAllAs(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAsAndAllSpaces_HappyPath() {
        //arrange
        String str = "panda   ";
        String expectedResult = "pnd";

        //act
        String actualResult = new StringMethods().removeAllAs(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_HappyPath() {
        //arrange
        String str = "taramasalata";
        String expectedResult = "trmslt";

        //act
        String actualResult = new StringMethods().removeAllAs(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing

    @Test
    public void testStringIsEmpty_NegativeTwo() {
        //arrange
        String str = "";
        String expectedResult = "Строка пустая";

        //act
        String actualResult = new StringMethods().removeAllAs(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //#3. Positive testing

    @Test
    public void testRemoveAllSpacesAndAllZeros_HappyPath() {
        //arrange
        String str = "3504209706040000 ";
        String expectedResult = "35429764";

        //act
        String actualResult = new StringMethods().removeAllZeros(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpacesWithOutZeros_HappyPath() {
        //arrange
        String str = "0000000111";
        String expectedResult = "111";

        //act
        String actualResult = new StringMethods().removeAllZeros(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testValidStringWithOutZeros_HappyPath() {
        //arrange
        String str = "8545128";
        String expectedResult = "This is a valid string";

        //act
        String actualResult = new StringMethods().removeAllZeros(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringIsEmptyThree_Negative() {
        //arrange
        String str = "";
        String expectedResult = "Строка пустая";

        //act
        String actualResult = new StringMethods().removeAllZeros(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //#4. Positive testing

    @Test
    public void testRemoveAllSpaces_HappyPath() {
        //arrange
        String str = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        //act
        String actualResult = new StringMethods().removeAllSpaces(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative testing

    @Test
    public void testStringIsEmptyFour_Negative() {
        //arrange
        String str = "";
        String expectedResult = null;

        //act
        String actualResult = new StringMethods().removeAllSpaces(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //#5. Positive testing
    @Test
    public void testCountAs_HappyPath() {
        //arrange
        String str = "Abracadabra";
        String expectedResult = "5, 6";

        //act
        String actualResult = new StringMethods().countAs(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //#6. Positive testing
    @Test
    public void testContainsValueInTextOne_HappyPath() {
        //arrange
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current" +
                " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy" +
                " version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support" +
                " Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer" +
                " zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        Boolean expectedResult = true;

        //act
        Boolean actualResult = new StringMethods().countJava(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testContainsValueInTextTwo_HappyPath() {
        //arrange
        String str = "A99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        Boolean expectedResult = false;

        //act
        Boolean actualResult = new StringMethods().countJava(str);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
