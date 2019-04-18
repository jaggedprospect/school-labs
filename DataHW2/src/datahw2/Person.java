package datahw2;

/**
 * Data Structures HW 2
 * Person Class
 *
 * @author Nate Heppard 900938628
 */

public class Person{
    
    /*--- CLASS FIELDS ---*/
    private String name;
    private String id;
    
    
    public Person(String name,String id){        
        this.name=name;
        this.id=id;
    }
    
    /*--- GETTER/SETTER METHODS ---*/
    public String getName(){
        return name;
    }
    
    public String getID(){
        return id;
    }
    /*--- END GETTER/SETTER ---*/
    
    /*--- CLASS METHODS ---*/
    @Override
    public String toString(){
        return name+", #"+id;
    }
}

class Student extends Person{
    
    /*--- CLASS FIELDS ---*/
    private int credits;
    private int gradePoints;
    
    /*--- CLASS CONSTRUCTOR ---*/
    public Student(String name,String studentID){
        super(name,studentID);
    }
    
    /*--- GETTER/SETTER METHODS ---*/
    public void setCredits(int credits){
        this.credits=credits;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public void setGradePoints(int gradePoints){
        this.gradePoints=gradePoints;
    }
    
    public int getGradePoints(){
        return gradePoints;
    }
    /*--- END GETTER/SETTER ---*/
    
    /*--- CLASS METHODS ---*/
    public boolean equals(Student other){
        return (this.getID().equals(other.getID()));
    }
    
    public double cpa(){
        return gradePoints/credits;
    }
    
    //## Method to split Student IDs at hyphen for Comparator ##//
    public String[] splitIDAtDash(){
        return getID().split("-");
    }
    
    @Override
    public String toString(){
        return super.toString()+", "+credits+" CR, "+gradePoints+" GP";
    }
    /*--- END METHODS ---*/
}

