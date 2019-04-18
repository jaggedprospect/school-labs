package datalabhw1;

/**
 * Data Structures HW 1
 * Part 2: Recursive Summation Class
 *
 * @author Nate Heppard 900938628
 */

public class RecursiveSummation{
    
    /**
     * Recursive method to add values start to end (inclusive)
     * 
     * @param start
     * @param end
     * @return  the recursive sum
    */
    public int sum(int start,int end){
        if(end<start)
            return 0;
        else
            return sum(start,end-1)+end;
    }
}
