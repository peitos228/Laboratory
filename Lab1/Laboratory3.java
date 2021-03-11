package lab1;

import java.util.Scanner;

public class Laboratory3 {

    public static void main(String[] args) {
        // В каждом слове текста k-ю букву заменить заданным символом.

        int letterNum = -1, maxLength;
        char symbol;

        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);  // для ввода в консоль

        System.out.print("Enter the text: ");
        String text = scan.nextLine();

        String[] strArr = text.split(" ");  // разбиваем текст на массив слов
        maxLength = strArr[0].length();  // заранее объявляем самым большим словом первый элемент массива
        for (String word : strArr) {
            if (word.length() > maxLength) {
                maxLength = word.length();  // узнаём макс длину слова чтобы сделать проверку на символ для замены
            } 
        }

        do {                                                                                                               //проверка чтобы
            System.out.print("Enter the number of the letter to replace: ");                                            //номер символа
            if (scan.hasNextInt()) {                                                                                     //в слове был
                letterNum = scan.nextInt();                                                                                     //меньше, чем
                if (letterNum > maxLength) {                                                                                      //максимальная
                    System.out.println("Number of the letter is bigger than THE BIGGEST word. Try again.");             //длина слова
                } else if (letterNum <= 0) {
                    System.out.println("Number of the letter must be greater than 0. Try again."); 
                }
            } else {
                scan.nextLine();  // clear input buffer
                System.out.println("You must enter a number.Try again");
            }
        } while (letterNum > maxLength || letterNum <= 0);
        System.out.print("Enter the symbol to replace " + letterNum + "-th letter: ");
        symbol = scan.next().charAt(0);  // ввод символа типа char

        System.out.println("Original: " + text);  // вывод первичного текста
        sb.append("Reworked: ");
        for (String word : strArr) {  // классный перебор всех элементов массива(в си такого нет, очень классная штука)
            if (word.length() >= letterNum) {
                if (Character.isLetter(word.charAt(letterNum - 1))) {  // check is a Letter
                    word = word.substring(0, letterNum - 1) + symbol + word.substring(letterNum);  // строка до нужного символа + новый символ + остаток строки(если есть)
                }
            }
            sb.append(word).append(" ");  // объединение слов в одну строку
        }
        System.out.println(sb.toString());
        scan.close();
    }
}