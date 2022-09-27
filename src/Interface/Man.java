package Interface;

public class Man {
    String name;
    int age;
    boolean male;
    double weight;

    Man() {
        name = "Ivan";
        age = 18;
        weight = 60d;
    }

    public Man(String name, int age, boolean male, double weight) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ":" + age + "/" + (male ? "female" : "male") + " (" + weight + ")";
    }

    Man myClone() {
        return new Man(this.name, this.age, this.male, this.weight);
    }
}
