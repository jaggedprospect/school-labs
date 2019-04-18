package interfaces;

/**
 * 
 * This interface provides a template for the methods to be created and tested
 * It must be implemented ('implements IMethods') in the Methods class
 * 
 * **DO NOT CHANGE THIS INTERFACE**
 * 
 * 
 * @author Adam Nichols
 *
 */

public interface IMethods {
	/**
	 * 
	 * Method subRec:
	 * Subtracts b from a
	 * At each recursion b is decremented by 1
	 * Do this until b = 0
	 * 
	 * @param a is the left operand
	 * @param b is the right operand
	 * @return the result of the operation
	 * 
	 */
	
	int subRec(int a, int b);
	
	/**
	 * 
	 * Method add:
	 * Adds from digits from 1 to n {1+2+3+4+5+...+n}
	 * This is achieved iteratively
	 * 
	 * @param n is the upper bound of the sequence
	 * @return the sum 
	 * 
	 */
	
	int add(int n);
	
	/**
	 * 
	 * Method addRec:
	 * Adds from digits from 1 to n {1+2+3+4+5+...+n}
	 * This is achieved recursively
	 * 
	 * @param n is the upper bound of the sequence
	 * @return the sum
	 */
	
	int addRec(int n);
	
	/**
	 * 
	 * Method sequentialSearch:
	 * Searches a sorted array sequentially for an element 'x'
	 * 
	 * @param arr is the array to be searched
	 * @param x is the element to be searched for
	 * @return the index of 'x', or '-1' if 'x' is not present in 'arr'
	 * 
	 */
	
	int sequentialSearch(double[] arr, double x);
	
	/**
	 * 
	 * Method searchRec:
	 * Searches a sorted array by dividing the array in two, checking if the desired value is
	 * 	above, below, or equal to the middle value.
	 * If element at middle is equal, then index of middle is returned
	 * Else, the appropriate half of the array is passed back to the method
	 * 
	 * @param  arr is the array to be searched
	 * @param from is the beginning index of the section of the array to be searched
	 * @param to is the ending index of the section of the array to be searched
	 * @param x is the element to be searched for
	 * @return the index of 'x' or '-1' if 'x' is not present in 'arr'
	 * 
	 */
	
	int searchRec(double[] arr, int from , int to, double x);
	
	 /** 
	 * Method searchIter:
	 * Searches a sorted array by dividing the array in two, checking if the desired value is
	 * 	above, below, or equal to the middle value.
	 * If element at middle is equal, then index of middle is returned
	 * Else, 'to' or 'from' is adjusted accordingly, 'middle' is recalculated, and the 
	 * 	while loop executes again
	 * 
	 * @param  arr is the array to be searched
	 * @param from is the beginning index of the section of the array to be searched
	 * @param to is the ending index of the section of the array to be searched
	 * @param x is the element to be searched for
	 * @return the index of 'x' or '-1' if 'x' is not present in 'arr'
	 * 
	 */
	
	int searchIter(double[] arr, int from, int to, double x);
		
}
