package Inheritance;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] str1 = read.nextLine().split(" ");
        String[] str2 = read.nextLine().split(" ");
        Student student1 = new Student(str1[0], Integer.parseInt(str1[1]), str1[2].equals("female"), Double.parseDouble(str1[3]), Integer.parseInt(str1[4]));
        Student student2 = new Student(str2[0], Integer.parseInt(str2[1]), str2[2].equals("female"), Double.parseDouble(str2[3]), Integer.parseInt(str2[4]));
        Student student3 = new Student();
        Student student4 = student2.myClone();
        student4.incYearOfStudy();
        student4.incYearOfStudy();
        student4.age = 18;
    }
}