package datalab11;

/*
* DO NOT MODIFY THIS!
*/

import blackbox.TreePrinter;
import objects.Stars;
import objects.StarsTree;

public class Main {

	public static void main(String[] args) {
		
		/*-========================= S-1 ========================== *
		 * Constructor and insert:									*
		 * - Creates an instance of a StarsTree, call it 'myTree'.	*
		 * - Adds 8 Stars with the following lengths:				*
		 * 		{10, 14, 4, 3, 17, 27, 9, 11}						*
		 * - Uses 'printNode' to display the entire tree.			*												*
		 * 															*
		 * (!) You should see exactly this:							*
		 *        10        										*       
      	 *		  / \       										*
     	 *	     /   \      										*
    	 *		/     \     										*
   		 *	   /       \    										*
   		 *	   4       14       									*
  		 *	  / \     / \   										*
 		 *	 /   \   /   \  										*
 		 *	3   9   11   17   										*
         *     				\ 										*
         *     				27 										*
		 * ========================= S-1 ========================== */startSection(1);
		StarsTree myTree = new StarsTree();
		myTree.insert(new Stars(10));
		myTree.insert(new Stars(14));
		myTree.insert(new Stars(4));
		myTree.insert(new Stars(3));
		myTree.insert(new Stars(17));
		myTree.insert(new Stars(27));
		myTree.insert(new Stars(9));
		myTree.insert(new Stars(11));
		TreePrinter.printNode(myTree.getRoot());
		
		
		/*-========================= S-2 ========================== */startSection(2);
		System.out.println("Traverse [inorder]");
		myTree.traverseInorder();
		System.out.println();
		
		System.out.println("Traverse [preorder]");
		myTree.traversePreorder();
		System.out.println();
		
		System.out.println("Traverse [postorder]");
		myTree.traversePostorder();
		System.out.println();
	
		
		/*-========================= S-3 ========================== *
		 * Search (Depth-first):									*
		 * - Implements the method 'find'.							*
		 * - Tries to find Stars of length 10, 9, 20, and 14.		*
		 * 															*
		 * (!) You should see exactly these outputs, respectively:	*
		 * 		Looking for 10 ...									*				
		 * 		Found: 10											*
		 * 															*
		 * 		Looking for 9 ...									*
		 * 		Found: 9											*
		 * 															*
		 * 		Looking for 20 ...									*
		 * 		Found: null											*
		 * 															*
		 * 		Looking for 14 ...									*
		 * 		Found: 14											*
		 * ========================= S-3 ========================== */startSection(3);
		System.out.println("Looking for 10 ...");
		Stars foundStars = myTree.find(myTree.getRoot(), 10);
		System.out.println("Found: " + foundStars);
		
		System.out.println("Looking for 9 ...");
		foundStars = myTree.find(myTree.getRoot(), 9);
		System.out.println("Found: " + foundStars);
		
		System.out.println("Looking for 20 ...");
		foundStars = myTree.find(myTree.getRoot(), 20);
		System.out.println("Found: " + foundStars);
		
		System.out.println("Looking for 14 ...");
		foundStars = myTree.find(myTree.getRoot(), 14);
		System.out.println("Found: " + foundStars);
		
		
		/* ========================= S-4 ========================== */startSection(4);
		System.out.println("Traverse [levelorder]");
		myTree.traverseLevelOrder();
		System.out.println();
	}
	
	
	
	/** IGNORE THIS METHOD **/
	private static void startSection(int i) {
		System.out.print("\n:::::::::::::::::::::::");
		System.out.print(" START [" + i + "] ");
		System.out.print(":::::::::::::::::::::::\n\n");
	}
}
