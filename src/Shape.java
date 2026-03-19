public abstract class Shape implements Comparable<Shape> {

    public abstract double area();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }
}
