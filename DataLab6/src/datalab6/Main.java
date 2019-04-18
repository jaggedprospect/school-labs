package datalab6;

/**
 * DO NOT CHANGE THIS CLASS
 *
 * ONLY CHANGE THE 'StarsLinkedList2' CLASS
 *
 * How to use this class: Go section by section, removing un-commenting code
 * that resides between
 *
 * //TODO start
 *
 * and
 *
 * //TODO finish
 *
 * By removing /*(remove) and (remove)
 */
/*
 * Make sure the necessary methods have been built out first in 'StarsLinkedList2'
 * 
 * Happy coding!
 * 
 * @author adamnichols
 *
 */
public class Main {

    public static void main(String[] args) {

        startSection(1);
        /**
         * Section 1
         *
         * Methods required: returnHead(), returnTail(), size(), empty(), add(),
         * get()
         */
//TODO start 1

        ///*(remove)
        //create new linked list
        StarsLinkedList2 myList = new StarsLinkedList2();
        
        //fill it with Stars objects
        for (int i = 1; i <= 8; i++) {
            myList.add(new Stars(i));
        }

        //print the head, tail, and size of the linked list
        System.out.println("myList head: " + myList.returnHead());
        System.out.println("myList tail: " + myList.returnTail());
        System.out.println("myList size: " + myList.size());

        //print the linked list
        myList.displayStars();

        //get and print the object at index 0, 3, and 7
        System.out.println("myList[0]: " + myList.get(0));
        System.out.println("myList[3]: " + myList.get(3));
        System.out.println("myList[7]: " + myList.get(7));

        //empty the linked list
        myList.empty();

        //print the linked list
        myList.displayStars();
        //(remove)  */
                //TODO finish 1
                 startSection(2);
        /**
         * Section 2
         *
         * Methods required: appendLinkList()
         */
//TODO start 2

        ///*(remove)

         //create two linked lists
         StarsLinkedList2 myList2 = new StarsLinkedList2();
         StarsLinkedList2 myList3 = new StarsLinkedList2();
		
         //fill myList2 with Stars objects
         for(int i = 1; i < 5; i++)
         myList2.add(new Stars(i));
		
         //print myList2
         System.out.print("myList2");
         myList2.displayStars();
		
         //fill myList3 with Stars objects
         for(int i = 5; i < 9; i++)
         myList3.add(new Stars(i));
		
         //print myList3
         System.out.print("myList3");
         myList3.displayStars();
		
         //append myList3 onto myList2
         myList2.appendLinkList(myList3);
		
         //print myList2
         System.out.print("myList2");
         myList2.displayStars();
		
         //print myList3
         System.out.print("myList3");
         myList3.displayStars();
		
         //empty myList2
         myList2.empty();
		
         //append myList3 onto myList2
         myList2.appendLinkList(myList3);
		
         //print myList2
         System.out.print("myList2");
         myList2.displayStars();
		
         //print myList3
         System.out.print("myList3");
         myList3.displayStars();
		
        //(remove)*/
//TODO finish 2
        startSection(3);
        /**
         * Section 3
         *
         * Methods required: insertLinkList()
         */
//TODO start 3

        ///*(remove)
	 
         //create two linked lists
         StarsLinkedList2 myList4 = new StarsLinkedList2();
         StarsLinkedList2 myList5 = new StarsLinkedList2();
		
         //add Stars objects to myList4
         for(int i = 1; i < 4; i++)
         myList4.add(new Stars(i));
         for(int i = 7; i < 10; i++)
         myList4.add(new Stars(i));
		
         //print myList4
         System.out.print("myList4");
         myList4.displayStars();
		
         //add Stars objects to myList5
         for(int i = 4; i < 7; i++)
         myList5.add(new Stars(i));
		
         //print myList5
         System.out.print("myList5");
         myList5.displayStars();
		
         //attempt to insert myList5 into myList4[-17], myList4[12], and myList4[3]
         System.out.println("Inserting myList five at myList[-17] returns: " + myList4.insertLinkList(myList5, -17));
         System.out.println("Inserting myList five at myList[12] returns: " + myList4.insertLinkList(myList5, 12));
         System.out.println("Inserting myList five at myList[3] returns: " + myList4.insertLinkList(myList5, 3));
	
         //print myList4
         System.out.print("\nmyList4");
         myList4.displayStars();
		
         //print myList5
         System.out.print("myList5");
         myList5.displayStars();
		
        //(remove)*/
//TODO finish 3	
        startSection(4);
        /**
         * Section 4
         *
         * Methods required: removePortion()
         */
//TODO start 4

        ///*(remove)
	 
         //create a new linked list
         StarsLinkedList2 myList6 = new StarsLinkedList2();
		
         //add Stars objects to the list
         for(int i = 1; i < 4; i++)
         myList6.add(new Stars(i));
         for(int i = 1; i < 4; i++)
         myList6.add(new Stars(8));
         for(int i = 4; i < 7; i++)
         myList6.add(new Stars(i));
		
         //print myList6
         myList6.displayStars();
		
         //try to remove portions [-3,6], [3,15], and [3,5]
         System.out.println("Removing portion [-3,6] from myList6 returns: " + myList6.removePortion(-3,6));
         System.out.println("Removing portion [3,15] from myList6 returns: " + myList6.removePortion(3,15));
         System.out.println("Removing portion [3,5] from myList6 returns: " + myList6.removePortion(3,5));
		
         //print myList6
         myList6.displayStars();
		
        //(remove)*/
//TODO finish 4
        startSection(5);
        /**
         * Section 5: BONUS
         *
         * possible additional 20% on this lab
         *
         * Methods required: removePortion()
         */
//TODO start 5

        /*(remove)
		
         //create a new linked list
         StarsLinkedList2 myList7 = new StarsLinkedList2();
		
         //add Stars objects to myList7
         for(int i = 1; i < 7; i++)
         myList7.add(new Stars(i));
		
         //print myList7
         myList7.displayStars();
		
         //remove portion [0,2] from myList7
         System.out.println("Removing portion [0,2] from myList7 returns: " + myList7.removePortion(0,2));
		
         //print myList7
         myList7.displayStars();
		
         //remove portion [1,2] from myList7
         System.out.println("Removing portion [1,2] from myList7 returns: " + myList7.removePortion(1,2));
		
         //print myList7
         myList7.displayStars();
		
        //(remove)*/
//TODO finish 5
    }

    private static void startSection(int i) {
        System.out.print("\n:::::::::::::::::::::::");
        System.out.print(" START [" + i + "] ");
        System.out.print(":::::::::::::::::::::::\n\n");
    }
}
