package datalab3;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * 
 * Class: Data Structures 2720 
 * Term: Spring 2019
 * Due Date: Wednesday February 6, 2019 @ 11:59pm
 * 
 * Subject: Recursion
 * 
 * @author Adam Nichols
 *
 */

public class Main {
    
    private static final String STACK="Stack Error Occured: ";
    
    public static void main(String[] args){
        Methods m=new Methods();
        long start,end;
        double timeResult; // not SUPER accurate, but accurate enough to see difference
        int method1,method2,method3,method4,method5,method6;   
        
       try{ // Method 1
            method1=m.subRec(10,3);
            System.out.println("10-3="+method1+", Result: "+(method1==10-3)+"\n");
        }catch(Exception e){}

        
        try{ // Experiment 1
            System.out.println("100000-4="+m.subRec(100000,4));
            System.out.println("4-100000="+m.subRec(4,100000));
            // 4-100000 doesn't work, overflows stack on recursive calls
        }catch(StackOverflowError s){
            System.out.println(STACK+s);
        }
        
        
        try{ // Method 2
            method2=m.add(5);
            System.out.println("add(5)="+method2+", Result: "+(method2==15));
        }catch(Exception e){}
        
        
        try{ // Method 3
            method3=m.addRec(5);
            System.out.println("addRec(5)="+method3+", Result: "+(method3==15));
        }catch(Exception e){}
        
        
        try{ // Experiment 2
            start=System.nanoTime();
            m.add(10000);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms
            
            System.out.println("\nadd(10000) Time Taken: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");
            
            start=System.nanoTime();
            m.addRec(10000);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms
            
            System.out.println("addRec(10000) Time Taken: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");
            
            System.out.println("add count: "+m.addCounter);
            System.out.println("addRec count: "+m.addRecCounter);
            
            start=System.nanoTime();
            m.add(500000);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms
            
            System.out.println("\nadd(50000) Time Taken: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");
            
            start=System.nanoTime();
            m.addRec(10000);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms
            
            System.out.println("addRec(50000) Time Taken: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");
            
            System.out.println("add count: "+m.addCounter);
            System.out.println("addRec count: "+m.addRecCounter);
            
            // recursion is faster as n increases
            // number of iterations increases exponentially as n increases
            // addRec() count increases as n increases, but at a lower rate
            
        }catch(Exception e){}
        
        
        double[] arr={1,2,3,4,5,6,7,8,9,10};
        
        try{ // Method 4
            method4=m.sequentialSearch(arr,4);
            System.out.println("\n"+Arrays.toString(arr)+"\nIndex of 4: "+method4);
            method4=m.sequentialSearch(arr,11);
            System.out.println("Index of 11: "+method4);
        }catch(Exception e){}
        
        
        try{ // Method 5
            method5=m.searchRec(arr,0,arr.length-1,4);
            System.out.println("\n"+Arrays.toString(arr)+"\nIndex of 4: "+method5);
            method5=m.searchRec(arr,0,arr.length-1,11);
            System.out.println("Index of 11: "+method5);
        }catch(Exception e){}
        
        
        try{ // Method 6
            method6=m.searchIter(arr,0,arr.length-1,4);
            System.out.println("\n"+Arrays.toString(arr)+"\nIndex of 4: "+method6);
            method6=m.searchIter(arr,0,arr.length-1,11);
            System.out.println("Index of 11: "+method6);
        }catch(Exception e){}
        
        
        double[] bigArr=new double[100000];
        for(int i=0;i<100000;i++){
            bigArr[i]=i;
        }
        
        try{ // Experiment 3
            start=System.nanoTime();
            method6=m.sequentialSearch(bigArr,99999);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms

            System.out.println("\nindex of 99999: "+method6+"\nsequential search time: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");

            start=System.nanoTime();
            method6=m.searchRec(bigArr,0,bigArr.length-1,99999);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms

            System.out.println("\nindex of 99999: "+method6+"\nrecursive search time: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");

            start=System.nanoTime();
            method6=m.searchIter(bigArr,0,bigArr.length-1,99999);
            end=System.nanoTime();
            timeResult=(double)(end-start)/1_000_000.0; // convert to ms

            System.out.println("\nindex of 99999: "+method6+"\niterative search time: "+
                    new DecimalFormat("0.0000").format(timeResult)+" milliseconds");
            
            System.out.println("\nsequential search count: "+m.sequentialSearchCounter);
            System.out.println("recursive search count: "+m.searchRecCounter);
            System.out.println("iterative search count: "+m.searchIterCounter);
        }catch(Exception e){}
    }
}
