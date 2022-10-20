public class CreateArray {

    /* 1. В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
                который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел. */
    public int[] createIntArray(int number1, int number2, int number3, int number4, int number5) {

        return new int[]{number1, number2, number3, number4, number5};
    }

    /* 2. Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     и возвращает массив из этих же чисел */
    public double[] createDoubleArray(double number1, double number2, double number3, double number4, double number5) {

        return new double[]{number1, number2, number3, number4, number5};
    }

    /* 3. Написать метод createStringArray(),
             который принимает на вход 5 слов, и возвращает массив из этих слов*/
    public String[] createStringArray(String str1, String str2, String str3, String str4, String str5) {

        return new String[]{str1, str2, str3, str4, str5};
    }

    /* 4.Написать метод createArrayFromText(), который принимает на вход
        предложение из нескольких слов и возвращает массив из этих слов. */
    public String[] createArrayFromText(String str) {

        return str.split(" ");
    }

}
