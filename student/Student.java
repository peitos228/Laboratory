package student;

import java.util.Arrays;

public class Student {
    final int NUMBER_OF_MARKS = 5;
    String name;
    String group;
    boolean clever = true;

    int[] marks = new int[NUMBER_OF_MARKS];

    public Student(String name, String group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
        for (int mark : marks) {
            if (mark < 9) {
                clever = false;
            }
        }
    }

    public void outInfo() {
        System.out.println("Имя студента: " + name + ", группа студента: " + group + ", оценки студента: "
                + Arrays.toString(marks));
    }

    public void goodStudent(){
        if (clever)
            System.out.println("Имя студента: " + name + ", группа студента: " + group + ", оценки студента: "
                    + Arrays.toString(marks));
    }
}
