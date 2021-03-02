package HW2;

import java.util.Scanner;

class HW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input word: ");
        String words = scan.nextLine();
        float sum=0;
        for (int i = 0; i < words.length(); i++) {
            sum+=(int) words.charAt(i);
        }
        System.out.println(sum/words.length());
        scan.close();
    }
}