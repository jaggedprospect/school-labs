package datalab5;

/**
 * Data Structures Lab 5
 * 2/14/19
 *
 * @author Nate Heppard
 */

public class Main {

    public static void main(String[] args) {

        /**
         * =========================S1============================== 
         * 1.Create a
         * new StarsLinkedList called 'myList'. 2.Complete the 'size()' method
         * in StarsLinkedList. 3.Call 'size()' on 'myList'. You should get 0.
         * 4.Use 'displayStars' to print 'myList' 5.Complete the 'add(Stars St)'
         * method in StarsLinkedList. HINT: You must complete the 'get(int
         * index)' method first. 6.Add a new 'Stars' object of length 4 to
         * 'myList. 7.Use 'displayStars' to print 'myList'. 8.Call 'size()' on
         * 'myList'. You should get 1.
         * =========================S1==============================
         */
        
        startSection(1);
        StarsLinkedList myList=new StarsLinkedList();
    
        System.out.println("The size of my list is: " + myList.size());
        
        myList.displayStars();
        
        myList.add(new Stars(4));
        myList.displayStars();
        
        System.out.println("The size of my list is: " + myList.size());

        /* =========================S1============================== */
        
        /**
         * =========================S2============================== 
         * 1.Create a new StarsLinkedList called 'myList1'. 2.Use a for loop to add 10 new
         * Stars objects to 'myList1' sizes 1-10. 3.Use 'displayStars' to print
         * 'myList1'. 4.Complete the add(Stars St, int index) method in
         * StarsLinkedList. 5.Add a new Stars object of length 14 to index 4 of
         * 'myList1'. 6.Use 'displayStars' to print 'myList1'. 7.Add a new Stars
         * object of length 14 to index 0 of 'myList1'. 8.Use 'displayStars' to
         * print 'myList1'. 9.Add a new Stars object of length 14 to the last
         * index of 'myList1'. 10.Use 'displayStars' to print 'myList1'. 11.Add
         * a new Stars object of length 14 to index 100 of 'myList1'. 12.Use
         * 'displayStars' to print 'myList1'. 13.Try to again to add the new
         * Stars object to index 100, but this time print the return value of
         * the method. 
         * =========================S2==============================
         */
        
        startSection(2);
        StarsLinkedList myList1=new StarsLinkedList();
        
        for(int i=1;i<=10;i++)
            myList1.add(new Stars(i));
        myList1.displayStars();
        
        myList1.add(new Stars(14),4);
        myList1.displayStars();
        
        myList1.add(new Stars(14),0);
        myList1.displayStars();
        
        myList1.add(new Stars(14),myList1.size());
        myList1.displayStars();
        
        myList1.add(new Stars(14),100);
        myList1.displayStars();
        
        System.out.println("Add Stars(14) to index 100 (outside range): "+myList1.add(new Stars(14),100));
        
        /* =========================S2============================== */

        /**
         * =========================S3============================== 
         * 1.Complete
         * the remove() method in StarsLinkedList. 2.Remove the Stars object at
         * index 5 from 'myList1'. 3.Use 'displayStars' to print 'myList1'.
         * 4.Remove the Stars object at index 0 from 'myList1'. 5.Use
         * 'displayStars' to print 'myList1'. 6.Remove the Stars object at the
         * last index of 'myList1'. 7.Use 'displayStars' to print 'myList'.
         * 8.Remove the Stars object at index 100 from 'myList1'. 9.Use
         * 'displayStars' to print 'myList'. 10.Try again to remove the object
         * at index 100, but this time print the return result from the 'remove'
         * method 
         * =========================S3==============================
         */
        
        startSection(3);
        myList1.remove(5);
        myList1.displayStars();
        
        myList1.remove(0);
        myList1.displayStars();
        
        myList1.remove(myList1.size()-1);
        myList1.displayStars();
        
        myList1.remove(100);
        
        myList1.displayStars();
        
        System.out.println("Remove node at index 100 (outside range): "+myList1.remove(100));
        /* =========================S3============================== */

        /**
         * =========================S4============================== 
         * 1.Complete
         * the 'empty' method in StarsLinkedList. 2.Use the 'empty' method on
         * 'myList1'. 3.Use 'displayStars' to print 'myList1'
         * =========================S4==============================
         */
        startSection(4);
        myList1.empty();
        
        myList1.displayStars();
	/* =========================S4============================== */

    }

    //DISREGARD THE BELOW METHOD
    private static void startSection(int i) {
        System.out.print("\n:::::::::::::::::::::::");
        System.out.print(" START [" + i + "] ");
        System.out.print(":::::::::::::::::::::::\n\n");
    }

}
