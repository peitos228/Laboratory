package HW2;

import java.util.Scanner;

class HW2{
    public static void main(String[] args) {
        float first, second, third,sum,intSum, diffSum;
        System.out.println("Enter three fractional numbers: ");
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        first = scan.nextFloat();
        second = scan.nextFloat();
        third = scan.nextFloat();
        sum = first + second + third;
        intSum = (int) first + (int) second + (int) third;
        diffSum = sum - intSum;
        sb.append("\n").append(sum).append("\n").append(intSum).append("\n").append(diffSum);
        System.out.println(sb.toString());
        scan.close();
    }
}