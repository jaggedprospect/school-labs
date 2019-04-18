package datahw2;

/**
 * Data Structures HW 2
 * Student Repository Class
 *
 * @author Nate Heppard
 */

import java.util.*;

public class StudentRepositoryList{
    
    /*--- Class Constants ---*/
    private final String NAME_REGEX="(([a-z]*[A-Z]*)+\\s*){1,2}";
    private final String ID_REGEX="\\d{1,4}-[A-Z]{2,6}";
    
    /*--- Class Fields ---*/
    private LinkedList<Student> studentList;
    
    /*--- Constructor ---*/
    public StudentRepositoryList(){
        studentList=new LinkedList<>();
    }
    
    /*--- Required Methods ---*/
    public Student enterStudentInformation(){
        Scanner in=new Scanner(System.in);
        String name,id;
        
        try{
            System.out.print("Enter Student Name:\n>> ");
            name=in.nextLine().replaceAll("\\s+"," ").trim();

            while(!name.matches(NAME_REGEX)){
                System.out.print("INVALID NAME.\n>> ");
                name=in.nextLine().replaceAll("\\s+"," ");
            }

            System.out.print("Enter Student ID:\n>> ");
            id=containsSpace(in.nextLine());

            while(!id.matches(ID_REGEX)){
                System.out.print("INVALID ID.\n>> ");
                id=containsSpace(in.nextLine());
            }

            System.out.println("STUDENT: "+name+","+id);
            
            return new Student(name,id);
            
        }catch(Exception e){
            System.out.println("Error Entering Student Information.");
        }
        
        return null;
    }
    
    public Queue<String> getStudentInformation(){
        Scanner in=new Scanner(System.in);
        String input;
        
        // isntantiate Queue interface via inner class
        Queue<String> q=new ArrayDeque<>(); 
        
        System.out.println("Enter Student IDs to Search: "
                + "(type 'q' to quit)");
        
        for(;;){
            System.out.print(">> ");
            input=in.nextLine().replaceAll("\\s+","");
            
            if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))
                break;
            
            if(!input.matches(ID_REGEX))
                System.out.println("INVALID ID.");
            else{
                q.add(input);
                System.out.println(input+" Added.");
            }
        }
        
        // prints the queue (uncomment to show)
        //System.out.println("\nTHE QUEUE:\n"+q+"\n");
        
        return q;
    }
    
    public void printStudentInformation(Queue<String> student_ids){
        for(String str : student_ids){
            Student foundStudent=null;
            
            for(Student student : studentList ){
                if(student.getID().equals(str)){
                    foundStudent=student;
                }
            }
        
            System.out.println(foundStudent);
        }
    }
    
    /*--- Other Class Methods ---*/
    public void addStudentToRepository(Student student){
        studentList.add(student);
    }
    
    public void printStudentRepository(){
        System.out.println(studentList.toString());
    }
    
    /*--- Helper Methods ---*/
    public String containsSpace(String input){
        if(input.contains(" ")){
            input=input.replaceAll("\\s+","");
            if(input.matches(ID_REGEX))
                System.out.println("Space(s) removed: "+input);
        }
        
        return input;
    }
    
    public void sortList(){
        // sort LinkedList using custom comparator
        Collections.sort(studentList,compareByID);
    }
    
    /*--- Comparator for Sorting ---*/
    public Comparator<Student> compareByID=(Student s1,Student s2)->{
        String[] split_one=s1.splitIDAtDash();
        String[] split_two=s2.splitIDAtDash();
        
        int x=split_one[0].compareTo(split_two[0]);
        
        if(x==0)
            x=split_one[1].compareTo(split_two[1]);
        
        return x;
    };
    
}
