package Inheritance;

public class Text {
    String text;

    public Text() {
        text = "";
    }

    public Text(String str) {
        text = str;
    }

    void appendText(String str) {
        text = text.concat(str);
    }

    @Override
    public String toString() {
        return "text: " + text;
    }

    Text myClone() {
        return new Text(text);
    }
}