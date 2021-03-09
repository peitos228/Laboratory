import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uuid {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите UUID: ");
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("^[1-9a-f][0-9a-f]{7}(-([1-9]\\d*|[a-f]){3}){2}-[1-9a-f]{4}-[0-9a-f]{12}$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {   
            System.out.println("true");
        } else {    
            System.out.println("false");
        }
        scan.close();
    }
}