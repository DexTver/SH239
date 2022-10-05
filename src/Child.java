public class Child {
    private int age;
    private String name;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String study() {
        return "None";
    }

    @Override
    public String toString() {
        return "(" + age + "," + name + ")";
    }
}
