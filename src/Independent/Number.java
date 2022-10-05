package Independent;

public class Number {
    private int value;

    public Number() {
        value = 1;
    }

    public Number(int value) {
        if (value < 1) this.value = 1;
        else this.value = value;
    }

    public int next() {
        this.value++;
        return this.value;
    }

    public int next(int x) {
        if (value + x < 1) {
            value = 1;
        } else {
            value += x;
        }
        return value;
    }

    public int prev() {
        if (value < 2) {
            value = 1;
        } else {
            value--;
        }
        return value;
    }

    public int prev(int x) {
        if (value - x < 1) {
            value = 1;
        } else {
            value -= x;
        }
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = Math.max(value, 1);
    }

    @Override
    public String toString() {
        return "[ Number = " + value + " ]";
    }
}
