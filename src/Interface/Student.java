package Interface;

public class Student extends Man {
    int yearOfStudy;

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void incYearOfStudy() {
        yearOfStudy++;
    }

    public Student() {
        super();
        yearOfStudy = 1;
    }

    public Student(String name, int age, boolean male, double weight, int yearOfStudy) {
        super(name, age, male, weight);
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return name + ":" + age + "/" + (male ? "female" : "male") + " (" + weight + ") " + yearOfStudy;
    }

    Student myClone() {
        return new Student(this.name, this.age, this.male, this.weight, this.yearOfStudy);
    }
}
