import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;

                    isSorted = false;
                    System.out.println(Arrays.toString(array));
                    System.out.println(isSorted);
                }
                System.out.println(i);
            }

            System.out.println(" ! " + isSorted);
        }

        System.out.println("Final result: " + Arrays.toString(array));
        return array;
    }
}
