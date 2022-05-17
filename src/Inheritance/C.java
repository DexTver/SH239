package Inheritance;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next(), str1 = read.next();
        Text text = new Text(str);
        Paragraph paragraph = new Paragraph(str, str1);
        System.out.println(text.toString());
        System.out.println(paragraph.toString());
        Text text_copy = text.myClone();
        Paragraph paragraph_copy = paragraph.myClone();
        text_copy.appendText("and its great");
        paragraph_copy.changeCaption("My custom caption");
    }
}