package HW2;

import java.util.*;

class HW4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] array = new int[10];
        System.out.println("Enter 10 numberRs:");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                num = scan.nextInt();
                array[i] = num;
                if (num > 9 || num < 0)
                    System.out.println("Invalid input. Number must be in range from 0 to 9.Try again");
            } while (num > 9 || num < 0);
        }
        for (int i = 0; i < 10; i++) {
            sb.append((char) (array[i] + 65));
        }
        System.out.print("Output string: ");
        System.out.println(sb.toString());
        scan.close();
    }
}