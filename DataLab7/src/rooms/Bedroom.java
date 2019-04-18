package rooms;

import shapes.Box;

public class Bedroom extends Room {

    boolean isMaster;

    public Bedroom(Box dimensions, int floor, boolean isMaster) {
        super(dimensions, floor);
        
        this.isMaster = isMaster;
    }

    public Bedroom(int length, int width, int height, int floor, boolean isMaster) {
        super(length, width, height, floor);
        
        this.isMaster = isMaster;
    }

    public Bedroom(int side, int floor, boolean isMaster) {
        super(side, floor);
        
        this.isMaster = isMaster;
    }

    public boolean isThisAMaster() {
        return isMaster;
    }
}
