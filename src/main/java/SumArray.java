public class SumArray {

    /*Написать алгоритм SumArray, который возвращает сумму всех чисел массива*/
    public int sumArray (int[] array) {

        int sumArrayNumbers = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sumArrayNumbers += array[i];
            }
        }  else {

            return -1;
        }

        return sumArrayNumbers;
    }
}
