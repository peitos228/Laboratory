import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hex {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите цвет в формате HEX: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scan.close();
    }
}