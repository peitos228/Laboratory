import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class hexValidator{
    public static void main(String[] args){
        String HEX_PATTERN = "^#([A-Fa-f0-9]{6})$";
        Scanner scan = new Scanner(System.in);
        Pattern pattern;
        Matcher matcher;
        String hex = scan.nextLine();//#FFFFFF";  
        pattern = Pattern.compile(HEX_PATTERN);
        matcher = pattern.matcher(hex); 
        System.out.println(matcher.matches());
        scan.close();
    }
}
//DONT USE`