package HW2;

import java.util.Scanner;

class HW3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num;
        System.out.print("Enter word: ");
        String word = scan.nextLine();
        for(int i = 0; i < word.length(); i++){
            num = (int) word.charAt(i)+1;
            if (word.charAt(i)=='Z'){
                num = 65;
            }
            else if (word.charAt(i)=='z'){
                num =97;
            }
            else if(word.charAt(i)==' ') {
                num = 32;
            }
            sb.append(String.valueOf((char)(num)));
        }
        System.out.print("Update out: ");
        System.out.println(sb.toString());
        scan.close();
    }
}