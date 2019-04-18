package rooms;

import shapes.Box;

public class Bathroom extends Room {

    public boolean isFull;

    public Bathroom(Box dimensions, int floor, boolean isFull) {
        super(dimensions, floor);
        
        this.isFull = isFull;
    }

    public Bathroom(int length, int width, int height, int floor, boolean isFull) {
        super(length, width, height, floor);
        
        this.isFull = isFull;
    }

    public Bathroom(int side, int floor, boolean isFull) {
        super(side, floor);
        
        this.isFull = isFull;
    }

    public boolean isFullBath() {
        return isFull;
    }

}
