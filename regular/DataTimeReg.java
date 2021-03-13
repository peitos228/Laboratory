package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTimeReg {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату и время в формате ISO 8601: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^(\\d{4})-([0]?[1-9]|[1][0-2])-([0]?[1-9]|[1-2][1-9]|[3][0,1])T([0]?[\\d]|[1][\\d])\\:([0]?[1-9]|[1-5][1-9])\\:([0]?[1-9]|[1-5][1-9])$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}