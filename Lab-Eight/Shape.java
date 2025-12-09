class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle:");
        System.out.println("   *   ");
        System.out.println("  * *  ");
        System.out.println(" *   * ");
        System.out.println("*******");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square:");
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
    }
}

public class ShapeTask2 {
    public static void main(String[] args) {
        System.out.println("==Task2==");
        Shape s;

        s = new Shape();
        s.draw();
        System.out.println();

        s = new Triangle();
        s.draw();
        System.out.println();

        s = new Square();
        s.draw();
    }
}
