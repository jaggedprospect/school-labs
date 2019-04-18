package shapes;

public class Rectangle extends Shapes {

    public static int rectCounter = 0;
    public int width;
    public int length;
    public int rectNumber;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        
        rectCounter++;
        rectNumber = rectCounter;
    }

    public Rectangle(int side) {
        this.width = side;
        this.length = side;
        
        rectCounter++;
        rectNumber = rectCounter;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRectCounter() {
        return rectCounter;
    }

    public void setRectCounter(int count) {
        rectCounter = count;
    }

    public int area() {
        return width * length;
    }

    public String toString() {
        String toReturn = "";
        toReturn += super.toString();
        toReturn += "\nRectangle: " + rectNumber + " of " + getRectCounter();
        toReturn += "\nLength: " + length + "\nWidth: " + width;
        toReturn += "\nArea: " + area() + "\n";
        return toReturn;
    }
}
