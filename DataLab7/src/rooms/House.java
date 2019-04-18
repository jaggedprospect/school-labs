package rooms;

import java.util.LinkedList;

public class House {

    LinkedList<Room> Home = new LinkedList<Room>();
    int roomCount;
    int bedroomCount = 0;
    int masterCount = 0;
    int bathCount = 0;
    int halfBathCount = 0;
    int totalSquareFeet = 0;
    int firstFloorFootage = 0;
    int secondFloorFootage = 0;
    int thirdFloorFootage = 0;

    public House() {}

    public void addRoom(Room room) {
        Home.add(room);
    }
    
    //This method will be called any time toString is invoked and will update all necessary 
    //aspects of the house
    public void updateHouse() {
        for (int i=0;i<Home.size();i++) {
            if (Home.get(i) instanceof Bedroom) {
                bedroomCount++;
                if(((Bedroom) Home.get(i)).isMaster)
                    masterCount++;
            }
            if (Home.get(i) instanceof Bathroom) {
                if (((Bathroom) Home.get(i)).isFullBath())
                    bathCount++;
                else
                    halfBathCount++;
            }

            roomCount++;
            totalSquareFeet += Home.get(i).getDimensions().getWidth() * Home.get(i).getDimensions().getLength();

            if (Home.get(i).getFloor() == 1)
                firstFloorFootage += Home.get(i).getDimensions().getWidth() * Home.get(i).getDimensions().getLength();
            if (Home.get(i).getFloor() == 2)
                secondFloorFootage += Home.get(i).getDimensions().getWidth() * Home.get(i).getDimensions().getLength();
            if (Home.get(i).getFloor() == 3)
                thirdFloorFootage += Home.get(i).getDimensions().getWidth() * Home.get(i).getDimensions().getLength();
        }
    }

    public String toString() {
        updateHouse();
        String toReturn = "\n";
        toReturn += "Total Rooms: " + roomCount;
        toReturn += "\nBedrooms: " + bedroomCount;
        toReturn += "\nMaster Bedrooms: " + masterCount;
        toReturn += "\nFull Baths: " + bathCount;
        toReturn += "\nHalf Baths: " + halfBathCount;
        toReturn += "\nTotal Square Footage: " + totalSquareFeet;
        toReturn += "\nFirst Floor Square Footage: " + firstFloorFootage;
        toReturn += "\nSecond Floor Square Footage: " + secondFloorFootage;
        toReturn += "\nThird Floor Square Footage: " + thirdFloorFootage;
        return toReturn + "\n";
    }
}
