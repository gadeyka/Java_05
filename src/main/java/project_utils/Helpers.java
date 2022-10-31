package project_utils;

import java.util.Arrays;

public class Helpers {

    public int maxNumber(int[] array) {
        int number = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                number = array[i];
            }
        }

        return number;
    }

    public static boolean isStringNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {

            return true;
        }

        return false;
    }

    public static int[] bubbleSortArray(int[] array) { // 45, 32, 7

        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        //_________________________String Concatenation vs .concat() vs StringBuilder vs StringBuffer___________________________
        String line = "_________________________________________________________";
        String ll = "|\t";
        String lr = "\t|";
//
        String str1 = "QA";
        int num1 = 4;
        String str2 = "Every";
        int num2 = 1;

        long start = 0;
        long end = 0;
//
        String resultPlus = "";
        start = System.nanoTime();
        resultPlus = str1 + num1 + str2 + num2;
        end = System.nanoTime();

        System.out.println(line);
        System.out.println(ll + "result\t\t" + lr + ll + "Concatenation" + lr + ll + "Time" + "\t" + lr);
        System.out.println(line);
        System.out.println(ll + "resultPlus\t" + lr + ll + resultPlus + "\t" + lr + ll + (end - start) + lr);
        System.out.println(line);

        String resultConcat = "";
        start = 0;
        start = System.nanoTime();

        resultConcat = resultConcat
                .concat(str1)
                .concat(String.valueOf(num1))
                .concat(str2)
                .concat(String.valueOf(num2));

        end = System.nanoTime();
//
        System.out.println(ll + "resultConcat" + lr + ll + resultConcat + "\t" + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);



        StringBuilder resultSB = new StringBuilder();

        start = System.nanoTime();

        resultSB
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultSB" + "\t" + lr + ll + resultSB + "\t" + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);



        StringBuffer resultSBuf = new StringBuffer();
        start = System.nanoTime();

        resultSBuf
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultSBuf" + "\t" + lr + ll + resultSBuf + "\t" + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);

        System.out.println(resultPlus.equals(resultConcat));
        System.out.println(resultPlus.equals(resultSB.toString()));

    }


}
