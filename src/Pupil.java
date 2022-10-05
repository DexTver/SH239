public class Pupil extends Child implements Comparable<Pupil> {
    private int klass;

    public Pupil(int age, String name, int klass) {
        super(age, name);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String study() {
        return "School";
    }

    @Override
    public String toString() {
        return "(" + getAge() + "," + getName() + "," + klass + ")";
    }

    @Override
    public int compareTo(Pupil o) {
        if (this.klass < o.getKlass()) {
            return -1;
        } else if (this.klass > o.getKlass()) {
            return 1;
        } else {
            return getName().compareTo(o.getName());
        }
    }
}
