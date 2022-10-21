public class ManipulationsWithArrays {

    /* 12. В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
        который принимает на вход массив целых чисел и число number.
         Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false*/
    public boolean areValuesGreaterThanNumber(int[] array, int number) {

        if ((array != null) && (array.length != 0) && (number != Integer.MAX_VALUE)) {

            if (number == Integer.MAX_VALUE + 1) {
                number = Integer.MIN_VALUE;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= number) {

                    return false;
                }
            }

            return true;
        }

        return false;
    }

}
