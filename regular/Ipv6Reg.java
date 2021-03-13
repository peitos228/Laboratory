package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv6Reg {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите IPv6: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^[0-9a-f]{4}(:[0-9a-f]{4}){7}$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {   
            System.out.println("true");
        } else {    
            System.out.println("false");
        }
        scan.close();
    }
}