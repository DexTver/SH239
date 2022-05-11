package OOP;

public class Rect {
    double width, height;

    double getArea(){
        return this.height * this.width;
    }

    double getPerimeter(){
        return 2 * (this.height + this.width);
    }

    void modify(double width, double height){
        this.height = height;
        this.width = width;
    }

    void scale(double d){
        this.height *= d;
        this.width *= d;
    }

    @Override
    public String toString() {
        return "Rect{" + "width=" + width + ",height=" + height + '}';
    }

    Rect getAFourth(){
        Rect myRect =  new Rect();
        myRect.modify(this.width / 2, this.height / 2);
        return myRect;
    }

    Rect devide(double w,double h){
        Rect myRect =  new Rect();
        myRect.modify(this.width * w, this.height * h);
        return myRect;
    }
}