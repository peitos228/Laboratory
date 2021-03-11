package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheckReg {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку для проверки на совпадение: ");
        String text = scan.nextLine();
        Pattern patt = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher match = patt.matcher(text);
        if (match.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}