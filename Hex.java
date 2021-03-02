//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hex {
    public static void main(String[] args) {    
        //Scanner scan = new Scanner(System.in);
        String text = "#FFFFFF";//scan.nextLine();
        Pattern pattern = Pattern.compile("^#([A-Fa-f0-9]{6})$");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}