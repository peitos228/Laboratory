package student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUMBER_OF_MARKS = 5;
        String name, group;
        int[] marks = new int[NUMBER_OF_MARKS];
        int studentsNum = -1;

        do {
            System.out.print("Введите количество студентов: ");
            if (scan.hasNextInt()) {
                studentsNum = scan.nextInt();
                if (studentsNum <= 0) {
                    System.out.println("Number must be > 0. Try again.");
                }
            } else {
                scan.nextLine(); // clear input buffer
                System.out.println("You must enter a number.Try again");
            }
        } while (studentsNum <= 0);
        Student[] students = new Student[studentsNum];
        for (int i = 0; i < studentsNum; i++) {
            System.out.println("Введите данные " + (i+1) + "студента:");
            scan.nextLine(); // clear input buffer
            name = scan.nextLine();
            group = scan.nextLine();

            for (int j = 0; j < NUMBER_OF_MARKS; j++) {
                do {
                    if (scan.hasNextInt()) {
                        marks[j] = scan.nextInt();
                        if (marks[j] <= 0) {
                            System.out.println("Оценка должна быть в пределах от 0 до 10. Попробуйте снова.");
                        }
                    } else {
                        scan.nextLine(); // clear input buffer
                        System.out.println("Ошибка! Вы ввели не число. Попробуйте снова.");
                    }
                } while (marks[j] <= 0);
            }
            students[i] = new Student(name, group, marks);
        }
        for (Student student : students) {  //вывод всех студентов
            student.outInfo();
        }
        for (Student student : students) {  //вывод умных студентов 
            student.goodStudent();
        }
        scan.close();
    }
}
