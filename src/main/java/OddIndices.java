public class OddIndices {

    /*Написать алгоритм OddIndices, который принимает массив целых чисел,
      и возвращает массив значений нечетных индексов*/
    public int[] oddIndices(int[] array) { //-45, 590, 234, 985, 12, 68 >>> 590, 985, 68

        int length = 0; //3

        for (int i = 1; i < array.length; i += 2) {
            length++;
        }

        int[] arrayWithOddInd = new int[length];

        if (array.length > 1) {
            for (int i = 0, oddIndex = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    arrayWithOddInd[oddIndex] = array[i];
                    oddIndex++;
                }
            }
        } else {

            return new int[0];
        }

        return arrayWithOddInd;
    }
}
