public class SortStringArray {

    public static String[] sort(String[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i].trim().length() == 1 && array[i - 1].trim().length() == 1) {
                    char charI = array[i].trim().charAt(0);
                    char charIMinus1 = array[i - 1].trim().charAt(0);
                    char charILC = array[i].trim().toLowerCase().charAt(0);
                    char charIMinus1LC = array[i - 1].trim().toLowerCase().charAt(0);
                    if (charILC == charIMinus1LC && charI < charIMinus1
                            || charILC < charIMinus1LC) {
                        String temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        isSorted = false;
                    }
                } else {
                    isSorted = true;
                }
            }
        }
        return array;
    }
}
