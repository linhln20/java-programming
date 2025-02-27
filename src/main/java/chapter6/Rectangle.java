package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; //option 1
        setWidth(width); // or option 2
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter(){
        return (length+width)*2;
    }

    public double calculateArea() {
        return length*width;
    }


}
