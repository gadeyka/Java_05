public class BiggerValue {

    /* 4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.*/
    public int biggerValue(int value1, int value2){

        if (value1 != value2) {
            if (value1 > value2) { //can be replaced with Math.max(value1, value2);

                return value1;
            } else {

                return value2;
            }
        }

        return -1;
    }

}
