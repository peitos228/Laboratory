package Lab1;

import java.util.Scanner;

public class Laboratory1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wordLen = -1;
        System.out.print("Enter line: ");
        String text = scan.nextLine();
        text = text.replaceAll("\\!", " !");
        text = text.replaceAll("\\.", " .");
        text = text.replaceAll("\\?", " ?");
        text = text.replaceAll("\\,", " ,");
        text = text.replaceAll("\\:", " :");
        text = text.replaceAll("\\@", " @");
        text = text.replaceAll("\\#", " #");
        text = text.replaceAll("\\$", " $");
        text = text.replaceAll("\\№", " №");
        text = text.replaceAll("\\%", " %");
        text = text.replaceAll("\\^", " ^");
        text = text.replaceAll("\\&", " &");
        text = text.replaceAll("\\*", " *");
        text = text.replaceAll("\\;", " ;");

        do {
            System.out.print("Enter the length of the words to delete them from text: ");
            if (scan.hasNextInt()) {
                wordLen = scan.nextInt();
                if (wordLen <= 0) {
                    System.out.println("Number must be > 0. Try again.");
                }
            } else {
                scan.nextLine();  // clear input buffer
                System.out.println("You must enter a number.Try again");
            }
        } while (wordLen <= 0);
        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : strArr) {
            char first = word.charAt(0);
            if (!((word.length() == wordLen) && ((first != 'a') && (first != 'e') && (first != 'i') && (first != 'o') && (first != 'u') && (first != 'y')))) {
                sb.append(word).append(' ');
            }
        }
        System.out.print(sb.toString());
        scan.close();
    }
}