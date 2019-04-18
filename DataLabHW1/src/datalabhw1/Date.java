package datalabhw1;

/**
 * Data Structures HW 1
 * Part 1: Date Class
 *
 * @author Nate Heppard 900938628
 */

public class Date{
    
    /*--- CLASS FIELDS ---*/
    private int year;
    private int month;
    private int day;
    
    private int maxDays;
    
    /*--- CLASS CONSTRUCTOR ---*/
    public Date(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    
    /*--- GETTER METHODS ---*/
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    /*--- END GETTER ---*/
    
    /*--- CLASS METHODS ---*/
    public void maxDays(){
        switch(this.month){
            case 2:
                if(isLeapYear())
                    maxDays=29;
                else
                    maxDays=28;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays=30;
                break;
            default:
                maxDays=31;
                break;
        }
    }
    public void addDays(int days){
        this.day+=days;
    }
    
    public void addWeeks(int weeks){
        weeks=weeks*7;
        this.day+=weeks;
    }
    
    public int daysTo(Date other){
        if(other.day!=this.day){
            int dif;
            if(other.day>this.day)
                dif=other.day-this.day;
            else
                dif=this.day-other.day;
            return dif;
        }
        return 0;
    }
    
    public boolean isLeapYear(){
        if(this.year%4==0){
            if(this.year%100==0){
                return this.year%400==0;
            }
            else
                return true;
        }
        else
            return false;  
    }
    
    @Override
    public String toString(){
        return String.format("%04d/%02d/%02d",year,month,day);
    }
    /*--- END METHODS ---*/
}
