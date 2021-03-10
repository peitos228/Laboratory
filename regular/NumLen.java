import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumLen {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Число в 16-ричной системе: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^([^0])[a-fA-F0-9]+$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {   
            System.out.println("true");
        } else {    
            System.out.println("false");
        }
        scan.close();
    }
}