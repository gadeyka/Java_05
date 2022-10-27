package project_utils;

public class Helpers {

    public int maxNumber(int[] array){
        int number = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number){
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

}
