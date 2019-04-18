package rooms;

import shapes.Box;
import shapes.Shapes;

public class Room {

    Box dimensions;
    int floor;

    public Room(Box dimensions, int floor) {
        this.dimensions = dimensions;
        
        setFloor(floor);
        dimensions.setCounter(Shapes.getCounter() - 1);
        dimensions.setBoxCounter(Box.getCounter() - 1);
    }

    public Room(int length, int width, int height, int floor) {
        dimensions = new Box(length, width, height);
        setFloor(floor);
        dimensions.setCounter(Shapes.getCounter() - 1);
        dimensions.setBoxCounter(Box.getCounter() - 2);
    }

    public Room(int side, int floor) {
        dimensions = new Box(side);
        setFloor(floor);
        dimensions.setCounter(Shapes.getCounter() - 1);
        dimensions.setBoxCounter(Box.getCounter() - 2);
    }

    public void setFloor(int floor) {
        if (floor <= 1) {
            this.floor = 1;
        }
        if (floor >= 3) {
            this.floor = 3;
        }
        if (floor == 2) {
            this.floor = 2;
        }
    }

    public int getFloor() {
        return floor;
    }

    public Box getDimensions() {
        return dimensions;
    }

}
