package shapes;

public class Box extends Rectangle {

    public static int boxCounter = 0;
    public int height;
    public int boxNumber;

    public Box(int width, int length, int height) {
        super(width, length);
        
        this.height = height;
        
        boxCounter++;
        boxNumber = boxCounter;
        
        super.setRectCounter(super.getRectCounter() - 1);
    }

    public Box(int size) {
        super(size);
        this.height = size;
        boxCounter++;
        boxNumber = boxCounter;
        super.setRectCounter(super.getRectCounter() - 1);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBoxCounter() {
        return boxCounter;
    }

    public void setBoxCounter(int count) {
        boxCounter = count;
    }

    public int volume() {
        return super.area()*height;
    }

    public int area() {
        return 2*super.area()+2*(length*height)+2*(width*height);
    }

    public String toString() {
        String toReturn = "\n";
        toReturn += "Shape: " + getShapeNumber() + " of " + getCounter();
        toReturn += "\nBox: " + boxNumber + " of " + boxCounter;
        toReturn += "\nLength: " + length + "\nWidth: " + width + "\nHeight: " + height;
        toReturn += "\nSurface Area: " + area();
        toReturn += "\nVolume: " + volume();
        return toReturn + "\n";
    }
}
