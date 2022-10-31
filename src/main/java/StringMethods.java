import project_utils.Helpers;

public class StringMethods {

    //1.
    /* Написать метод removeSpaces(), который принимает на вход строку.
        Если строка не пустая (проверить методом класса String),
        то примените метод по удалению пробелов в начале и в конце строки.
        Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
        Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
        Если пробелов не было, вернуть сообщение “Пробелов не было”.
        Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”. */
    public String removeSpaces(String str) {
        if (!str.isEmpty()) {
            String strWithOutSpace = str.trim();

            if (!str.equals(strWithOutSpace)) {

                return "Лишние пробелы удалены";
            }

            return "Пробелов не было";
        }

        return "Строка пустая";
    }

    //2
    /*Написать алгоритм removeAllAs().
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
         Если строка валидная, то метод удаляет все буквы "a" из строки, если таковые имеются.
          Метод возвращает обработанную строку.*/

    public String removeAllAs(String str) {
        if (!str.isEmpty()) {

            return str.replace("a", "").trim();
        }

        return "Строка пустая";
    }

    //3
    /*Написать алгоритм removeAllZeros().
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
         Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
          Метод возвращает обработанную строку, в которой нет нулей.
           Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.*/

    public String removeAllZeros(String str) {
        if (!str.isEmpty()) {

            String strWithOutZeros = str.replace("0", "");

            if (str.equals(strWithOutZeros)) {

                return "This is a valid string";
            }

            return strWithOutZeros.replace(" ", "");
        }

        return "Строка пустая";
    }

    //4
    /*Написать алгоритм removeAllSpaces.
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
        Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
        Метод возвращает обработанную строку.*/
    public String removeAllSpaces(String str) {

        if (Helpers.isStringNullOrEmpty(str)) {
            return null;
        }

        return str.replace(" ", "");
    }

    //5
    /*Напишите метод countAs(), который принимает на вход строку и считает,
     сколько букв а или А содержится в строке. Метод возвращает количество букв a/A,
     и количество букв/знаков в слове без букв a/A.
     Итоговый результат должен строится с помощью метода из видео 2.*/
    public String countAs(String str) {

        int strWithoutA = str.toLowerCase().replace("a", "").length();
        int strWithA = str.toLowerCase().length() - strWithoutA;

        return strWithA + ", " + strWithoutA;
    }

    //6
    /*Напишите метод countJava(), который принимает на вход текст и проверяет,
        содержится ли в тексте хотя бы одно слово Java.*/
    public boolean countJava(String str) {
        return str.toLowerCase().contains("java");
    }

    //7
    /*Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     в которой это слово “обернуто” в кавычки*/
    public String insertQuotes(String str) {

        str = str.replace("«", "\"");
        str = str.replace("»", "\"");

        return '"' + str + '"';
    }

    //8
    /*Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,
      и оборачивает в кавычки вторую строку (результат строится с помощью метода concat())
        Test Data:
            “Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
            “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
            Задание со звездочкой:
            “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
            "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""      */
    public String insertQuotes(String str1, String str2) {

        return str1.concat(": ").concat(insertQuotes(str2));
        //return str1 + ": " + insertQuotes(str2); simple method
    }

    //9
    /*Напишите метод, кторый принимает на вход название города и исправляет написание:
        Test Data:
        “ташкент” → “Ташкент”
        “ЧикаГО” → “Чикаго”*/
    public String capitalizeFirstLetter(String str) {

        return str.toUpperCase().substring(0, 1).concat(str.toLowerCase().substring(1));
    }

    //10
    /*Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
     что находится между первой и последней буквой-параметром:
        Test Data:
        “Abracadabra”, “b” → “bracadab”
        “Whippersnapper”, “p” → “ppersnapp”*/
    public String return10(String str, String ch) {

        return str.substring(str.indexOf(ch), str.lastIndexOf(ch) + 1);
    }

    //11
    /*Напишите метод, который принимает на вход слово, и возвращает true,
     если слово начинается и заканчивается на одинаковую букву, и false иначе
        Test Data:
            “Abracadabra” → true
            “Whippersnapper” → false*/
    public boolean compareFirstAndLastCharacter(String str) {
        if (str != null && !str.trim().isEmpty() && !str.trim().contains(" ") && str.length() > 1) {
            str = str.trim().toLowerCase();
            return str.substring(0, 1).equals(str.substring(str.length() - 1));
        }

        return false;
    }

    //17
    /*Напишите метод, который принимает строку и index, и возвращает численное значение буквы,
        которая находится на позиции index (использовать только один метод класса String*/
    public int returnNumericalValueOfString(String str, int num) {
        if (str == null || str.isEmpty()) {

            return -1;
        }

        if (num < 0 || num > 127) {

            return -1;
        }

        if (num > str.length() - 1) {

            return -1;
        }

        return (int) str.charAt(num);
    }

}
