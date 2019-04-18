package datahw2;

/**
 * Data Structures HW 2
 * Main Class
 * 04/04/19
 *
 * @author Nate Heppard
 */

import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StudentRepositoryList list=new StudentRepositoryList();
        String input;
        
        // title
        System.out.println("=====================\n"
                + "= Student Registrar =\n=====================");
        
        // enter students until break
        for(;;){
            System.out.print("Create New Student? (y/n)\n>> ");
            input=in.nextLine().toLowerCase().replaceAll("\\s+","");
            
            if(input.equals("y") || input.equals("yes"))
                list.addStudentToRepository(list.enterStudentInformation());
            else if(input.equals("n") || input.equals("no"))
                break;
            else
                System.out.println("INVALID INPUT.");
            
            System.out.println();
        }
        
        System.out.println();
        
        // sort the linked list
        list.sortList();
        
        // get info for specified IDs and print
        list.printStudentInformation(list.getStudentInformation());
        
        System.out.println();
        
        // prints linked list (uncomment to show correct sort)
        //list.printStudentRepository();
    }    
}
