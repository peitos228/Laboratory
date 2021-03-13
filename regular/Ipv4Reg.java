package regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv4Reg {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите IPv4: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^(([0-9]?|[1-9]?[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]?|[1-9]?[0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {   
            System.out.println("true");
        } else {    
            System.out.println("false");
        }
        scan.close();
    }
}