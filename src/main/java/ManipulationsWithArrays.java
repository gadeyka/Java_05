public class ManipulationsWithArrays {

    /*5. Написать метод multiplyArrayByNumber(),
        который принимает на вход массив целых чисел и число int number.
            Метод возвращает массив тех же чисел, умноженных на number*/
    public int[] multiplyArrayByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }

        return array;
    }

    /*6. Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
            и возвращает массив типа double[] из тех же чисел*/
    public double[] toDoubleArray(int[] array) {

        double[] doubleArray = new double[array.length];

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = array[i];
        }

        return doubleArray;
    }

    /*7. Написать метод toIntArray(), который принимает на вход массив типа double[],
            и возвращает массив типа int[] из тех же чисел*/
    public int[] toIntArray(double[] array) {

        int[] intArray = new int[array.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) array[i];
        }

        return intArray;
    }

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
