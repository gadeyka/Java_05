import project_utils.Helpers;

import java.util.Arrays;

public class OddEvenValuesInArray {

    /* 10. Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
      и возвращает количество четных чисел в этом массиве*/
    public int countEvenValuesInArray(int[] array) {

        int counter = 0;

        if ((array != null) && (array.length != 0)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counter++;
                }
            }

            return counter;
        }

        return -1;
    }

    /* 11. Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
            и возвращает количество нечетных чисел в этом массиве*/
    public int countOddValuesInArray(int[] array) {

        if ((array != null) && (array.length != 0)) {

            return array.length - countEvenValuesInArray(array);
        }

        return -1;
    }

}
