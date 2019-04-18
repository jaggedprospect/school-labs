package datalabhw1;

import java.util.*;

/**
 * Data Structures HW 1
 *
 * @author Nate Heppard 900938628
 */

public class Main{
    
    public static void main(String[] args){
        /*--- PART 1 DEMO: DATE CLASS ---*/
        Date date1=new Date(2019,2,18);
        Date date2=new Date(2019,2,28);
        System.out.println("The current date is: "+date1.toString());
        System.out.println("Days until 2019/02/28: "+date1.daysTo(date2));
        System.out.println("Is 2019 a leap year? : "+date1.isLeapYear());
        date1.addDays(2);
        System.out.println("Move forward 2 days: "+date1.toString());
        System.out.println();
        
        /*--- PART 2 DEMO: RECURSIVE SUMMATION ---*/
        RecursiveSummation rs=new RecursiveSummation();
        Scanner in=new Scanner(System.in);
        int start,end;
        System.out.print("Start: ");
        start=in.nextInt();
        System.out.print("End: ");
        end=in.nextInt();
        System.out.println(start+"+...+"+end+"="+rs.sum(start,end));
    }
}
