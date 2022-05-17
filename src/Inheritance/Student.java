package Inheritance;

public class Student extends Man {
    int yearOfStudy;

    public Student() {
        yearOfStudy = 1;
    }

    public Student(String name, int age, boolean male, double weight, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.weight = weight;
        this.yearOfStudy = yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void incYearOfStudy() {
        yearOfStudy++;
    }

    @Override
    public String toString() {
        return name + ':' + age + '/' + (male ? "female" : "male") + " (" + weight + ") " + yearOfStudy;
    }

    Student myClone() {
        return new Student(name, age, male, weight, yearOfStudy);
    }
}