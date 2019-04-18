package datalab10;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import interfaces.ILinkStarQueue;
import objects.Stars;
import objects.LinkStarQueue;

public class Main{

    public static void main(String[] args){

        int max=10;
        Stars tmp=null;

        /*-========================= S-1 ========================== *
         * Constructor and size:																								  *
         * - Create an instance of a LinkStarQueue, call it 'myQ1'.										  *
         * - Print out its size with an appropriate message.													  *
         * 																																		  *
         * (!) You should see exactly this:																				  *
         * 		> Size of an empty LinkStarQueue: 0																	  *
         * ========================= S-1 ==========================  */
        startSection(1);
        LinkStarQueue myQ1=new LinkStarQueue();
        System.out.println("Size of an empty LinkStarQueue: "+myQ1.size());

        /*-========================= S-2 ========================== *
         * Peek:																															  *
         * - If you have 'peek()' implemented, then you should be										  *
         * 		 able to display your queue using the method												      *
         *		 'displayQueue()' which is already implemented for you.									  *
         * 																																		  *
         *  (!) You should see exactly this:																			      *
         * 		> n:0	H -->(  )<-- T																								  *
         * ========================= S-2 ========================== 	*/
        startSection(2);
        myQ1.displayQueue();
        
	/*-========================= S-3 ========================== *
         * Enqueue:																													  *
         * - Do you have enqueue() implemented? Great.				            						   	  *
         * - In a for loop, enqueue the following elements to myQ1.									  *
         * 																																		  *
         *     (1),(2),(3), ... , (10)																								  *
         *     																																	  *	
         * - Display myQ1 once AT EACH ITERATION.															  *
         * - Display the to-be-added Stars at each iteration.												  *
         * 																																		  *
         *  (!) myQ1 at the very end, for example, should look	 like this:								  *
         *   + (10)																														  *
         * 		> n:1	H -->(10)(*)(*)(*)(*)(*)(*)(*)(*)(10)<-- T												  *
         * 																																   		  *
         * 	NOTE: The elements in the middle are intentionally	 hidden.								  *
         * ========================= S-3 ==========================  */
        startSection(3);
        for(int i=1;i<=max;i++){
            myQ1.enqueue(new Stars(i));
            myQ1.displayQueue();
        }

	/*-========================= S-4 ========================== *
         * Peek:																															  *
         * - We have been using 'peek' method in our 'displpayQueue'                               *
         * 			however, we did not test it here.																		  *
         * - Display myQ1, call peek and print out what it returns,										  *
         * 			and then display the queue again.																	  *
         * 															                                                                              *
         *  (!) You should output this sequence:																		  *
         * 		> n:10	H -->(1)(*)(*)(*)(*)(*)(*)(*)(*)(10)<-- T 													  *
         *		> Peek returned:	(10)																							  *
         *		> n:10	H -->(1)(*)(*)(*)(*)(*)(*)(*)(*)(10)<-- T 													  *
         * 																																		  *
         * NOTE: Notice how (1) is only returned and not removed!									  *
         * 	NOTE: Which Stars is returned. First or last?														  *
         * ========================= S-4 ==========================  */
        startSection(4);
        myQ1.displayQueue();
        System.out.println("Peek returned: "+myQ1.peek());
        myQ1.displayQueue();

	/*-========================= S-5 ========================== *
         * Dequeue:																													  *
         * - Do you have dequeue() already implemented? Great.										  *
         * - In a for loop, dequeue all of the Stars from myQ1.												  *
         * - Display myQ1 at each iteration.																		      *
         * - Display the to-be-removed Stars at each iteration.											  *
         * 																																		  *
         *  (!) myQ1 at the very end, for example, should look	 exactly like this:			      *
         *  -(10)																															  *
         * 		> n:0		H -->(  )<-- T																							  *
         *																																	      *
         * 	NOTE: Pay attention to the order in which the elements	are being removed.     *
         * 																																		   *
         * - What will happen if you go over the limit?															   *
         * 		Repeat the above, this time change the number of iterations from 10 to 12. *
         * 																																		   *
         *  (!) Your last two lines  should																					   *
         *  - null																															   *
         *     	> n:0		H -->(  )<-- T																							   *
         * ========================= S-5 ========================== */
        startSection(5);
        for(int i=1;i<=max;i++){
            myQ1.dequeue();
            myQ1.displayQueue();
        }
        
        System.out.println("** RESET **");
        
        for(int i=1;i<=max;i++)
            myQ1.enqueue(new Stars(i));
        
        for(int i=1;i<=max+1;i++){
            myQ1.dequeue();
            myQ1.displayQueue();
        }

	/*-========================= S-6 ========================== *
         * EnqueueAll:																												  *
         * - Implement enqueueAll method first.																      *
         * - Now we need two queues: myQ1 and myQ2. Use the									      *
         * following Stars to initialize them:																		          *
         *      myQ1: (1),(2),(3),(4)																							  *
         *      myQ2: (5),(6),(7),(8)																							  *
         *      																																  *
         * - Display both myQ1 and myQ2, with proper naming on the	output:		    	  *
         *  (!) You should see this:																							  *
         * 		> myQ1 before:																										  *
         *		>	n:4		H -->(1)(*)(*)(4)<-- T																			  *
         *		> myQ2 before:																										  *
         *		>	n:4		H -->( 5)(*)(*)( 8)<-- T																			  *
         * 																																		  *
         * - Now, add all elements of myQ2 to myQ1, using the	method enqueueAll.		  *
         * - Display both myQ1 and myQ2 again.																	  *
         *  (!) You should see this:																							  *
         * 		> myQ1 after:																										  *
         *     	>	n:8		H -->(1)(*)(*)(*)(*)(*)(*)( 8)<-- T														  *
         *		> myQ2 after:																										  *
         *		> 	n:4		H -->( 5)(*)(*)( 8)<-- T																			  *
         *																																		  *
         *	NOTE: Make sure myQ2 is not empty after this.													  *
         *	NOTE: Are the orders preserved as they should?													  *
         * ========================= S-6 ========================== */
        startSection(6);
        for(int i=1;i<5;i++)
            myQ1.enqueue(new Stars(i));
        
        System.out.println("myQ1 before:");
        myQ1.displayQueue();
        
        LinkStarQueue myQ2=new LinkStarQueue();
        
        for(int i=5;i<9;i++)
            myQ2.enqueue(new Stars(i));
        
        System.out.println("myQ2 before:");
        myQ2.displayQueue();
        
        myQ1.enqueueAll(myQ2);
        System.out.println("myQ1 after:");
        myQ1.displayQueue();
        System.out.println("myQ2 after:");
        myQ2.displayQueue();
        
	/*-========================= S-7 ========================== *
         * Empty:																															  *
         * - Implement 'empty' method first.																			  *
         * - Display, myQ1 first, empty it and then display it again.										  *
         *  (!) You should see this:																							  *
         * 		> myQ1 before:																										  * 
         *		>	n:8		H -->(10)(*)(*)(*)(*)(*)(*)( 4)<-- T														  *
         *		>myQ1 after: 																										  *
         *		>	n:0		H -->(  )<-- T																							  *
         * ========================= S-7 ==========================  */
        startSection(7);
        System.out.println("Queue before:");
        myQ1.displayQueue();
        myQ1.empty();
        System.out.println("Queue after:");
        myQ1.displayQueue();
        
	/*-========================= S-8 ========================== *
         * EXTRA CREDIT																											  *
         * 																																	      *
         * Here, we want to compare performance of different Queues							      *
         * in appending new elements.																				      *
         * 																																		  *
         * Follow these steps:																									  *
         * 1. Construct a queue using 'LinkedList', with a reference to 'java.util.Queue'.	  *
         * 2. Construct another queue using 'PriorityQueue', with the same reference     *
         * 			(to 'java.util.Queue').																							  *
         * 3. Construct yet another queue, this time using LinkStarQueue,					      *
         * 			with a reference to ILinkStarQueue.																  *
         *  																																	  *
         * - Add 100,000 instances of Stars to each of them and										  *
         * record the time needed for such tasks, separately.												  *
         *  																																	  *
         * - With an appropriate message, print out the elapsed time								  *
         * corresponding to each of those queues.																  *
         * 																																		  *
         * (?) WHICH IS FASTEST?  SECOND?  THIRD? WHY?											  *  
         * 	ANSWER:																													  *
         * ========================= S-8 ==========================  */
        startSection(8);
        System.out.println("Maybe later...");
		/* -------------------------------------- */

        /*-========================= === ========================== *
         *  CONGRATULATIONS! You now know everything about queues!					   *
         * ========================= === ==========================  */
    }

    /**
     * IGNORE THIS METHOD *
     */
    private static void startSection(int i){
        System.out.print("\n:::::::::::::::::::::::");
        System.out.print(" START ["+i+"] ");
        System.out.print(":::::::::::::::::::::::\n\n");
    }

}
