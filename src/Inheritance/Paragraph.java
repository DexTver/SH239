package Inheritance;

public class Paragraph extends Text {
    String caption;

    public Paragraph() {
        caption = "MyCaption";
    }

    public Paragraph(String str) {
        caption = str;
    }

    public Paragraph(String text, String caption) {
        this.text = text;
        this.caption = caption;
    }

    void changeCaption(String str) {
        caption = str;
    }

    @Override
    public String toString() {
        return "caption: " + caption + "\ntext: " + text;
    }

    Paragraph myClone(){
        return new Paragraph(text, caption);
    }
}