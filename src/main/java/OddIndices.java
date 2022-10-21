public class OddIndices {

    /*Написать алгоритм OddIndices, который принимает массив целых чисел,
      и возвращает массив значений нечетных индексов*/
    public int[] oddIndices(int[] array) {

        int length = 0;

        for (int i = 1; i < array.length; i += 2) {
            length++;
        }

        int[] arrayWithOddInd = new int[length];

        if (array.length > 1) {
            for (int i = 0, oddNumbers = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    arrayWithOddInd[oddNumbers] = array[i];
                    oddNumbers++;
                }
            }
        } else {

            return new int[0];
        }

        return arrayWithOddInd;
    }
}
