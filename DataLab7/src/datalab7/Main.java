package datalab7;

import rooms.*;
import shapes.*;

public class Main {

    public static void main(String[] args) {
        //Creating two instances of Rectangle each using a different 
        //class constructor
        Rectangle myRectangle = new Rectangle(5, 10);
        Rectangle myRectangle1 = new Rectangle(5);
	//Creating two instances of Box each using a different class 
        //constructor
        Box myBox = new Box(5, 10, 15);
        Box myBox1 = new Box(5);

        //Creating a house and filling it with rooms
        House myHouse = new House();
        myHouse.addRoom(new Bedroom(10, 2, true));
        myHouse.addRoom(new Bedroom(15, 20, 10, 2, false));
        myHouse.addRoom(new Bedroom(10, 1, false));
        myHouse.addRoom(new Room(15, 18, 10, 2));
        myHouse.addRoom(new Room(5, 2));
        myHouse.addRoom(new Room(15, 10, 10, 3));
        myHouse.addRoom(new Bathroom(5, 8, 10, 1, true));
        myHouse.addRoom(new Bathroom(10, 2, true));
        myHouse.addRoom(new Bathroom(5, 8, 10, 1, false));

        //Printing shape specs
        System.out.println(myRectangle.toString());
        System.out.println(myRectangle1.toString());
        System.out.println(myBox.toString());
        System.out.println(myBox1.toString());

        //Printing house specs
        System.out.println(myHouse.toString());

    }
}
