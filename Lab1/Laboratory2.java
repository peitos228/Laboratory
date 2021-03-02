package Lab1;

import java.util.Scanner;

public class Laboratory2 {

    public static void main(String[] args) {

        int numStrings = -1;
        String answer, notAnswer;
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Input number of strings: ");
            if(scan.hasNextInt()) {
                numStrings = scan.nextInt();
                if(numStrings <= 0) {
                    System.out.println("Number must be > 0. Try again.");
                }
            }else {
                scan.nextLine();//clear input buffer
                System.out.println("You must enter a number.Try again");
            }
        }while(numStrings <= 0);
        System.out.println("Input strings:");
        scan.nextLine();
        answer = scan.nextLine();
        for (int i = 1; i < numStrings; i++) {
            notAnswer = scan.nextLine();
            if (answer.length() > notAnswer.length()) {
                answer = notAnswer;
            }
        }
        sb.append("The shortest string is: ").append(answer).append("\nThis length: ").append(answer.length());
        System.out.print(sb.toString());
        scan.close();
    }
}