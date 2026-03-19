import java.util.Arrays;

public class ShapeManager {

    public static double sum(Shape[] v) {
        double total = 0;

        for (Shape s : v) {
            total += s.area();
        }

        return total;
    }

    public static void print(Shape[] v) {
        for (Shape s : v) {
            System.out.println(s);
        }
    }

    public static void sort(Shape[] v) {
        Arrays.sort(v);
    }

    public static void main(String[] args) {

        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = sum(v);

        System.out.println("Sum: " + res);
        System.out.println();

        System.out.println("Before sorting:");
        print(v);
        System.out.println();

        sort(v);

        System.out.println("After sorting:");
        print(v);
    }
}
