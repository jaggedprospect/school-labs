package shapes;

public class Shapes {

    public static int counter = 0;
    public int shapeNumber;

    public Shapes() {
        counter++;
        this.shapeNumber = counter;
    }

    public static int getCounter() {
        return counter;
    }

    public void setCounter(int count) {
        counter = count;
    }

    public int getShapeNumber() {
        return shapeNumber;
    }

    public String toString() {
        return "\nShape: " + getShapeNumber() + " of " + getCounter();
    }
}
