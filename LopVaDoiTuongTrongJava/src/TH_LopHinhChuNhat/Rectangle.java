package TH_LopHinhChuNhat;

public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
