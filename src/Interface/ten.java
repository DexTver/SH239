package Interface;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] s1 = read.nextLine().split(" ");
        String[] s2 = read.nextLine().split(" ");
        Student student1 = new Student(s1[0], Integer.parseInt(s1[1]), !(s1[2].equals("male")), Double.parseDouble(s1[3]), Integer.parseInt(s1[4]));
        Student student2 = new Student(s2[0], Integer.parseInt(s2[1]), !(s2[2].equals("male")), Double.parseDouble(s2[3]), Integer.parseInt(s2[4]));
        Student student3 = new Student();
        Student student4 = student2.myClone();
        student4.incYearOfStudy();
        student4.incYearOfStudy();
        student4.setAge(18);
    }
}
