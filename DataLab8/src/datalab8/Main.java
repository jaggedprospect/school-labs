package datalab8;

import java.util.Arrays;

/**
 * Data Structures Lab 8
 * 03/14/19
 *
 * @author Nate Heppard
 */

public class Main{
    
    static final int AR_SIZE=9999;
    
    static int swapCount,shiftCount;
    static long start,end;

    public static void main(String[] args){
        int ar1[]={9,8,7,6,5,4,3,2,1,0};
        int ar2[]={9,8,7,6,5,4,3,2,1,0};
        int ar3[]={9,8,7,6,5,4,3,2,1,0};
        
        System.out.println("Selection Sort:\n"+Arrays.toString(ar1)+"\n");
        selectionSort(ar1);
        
        System.out.println("Bubble Sort:\n"+Arrays.toString(ar2)+"\n");
        bubbleSort(ar2);
        
        System.out.println("Insertion Sort:\n"+Arrays.toString(ar3)+"\n");
        insertionSort(ar3);
        
        /*---------------------------*/
        
        int[] bigAr1=new int[10000],bigAr2=new int[10000],bigAr3=new int[10000];
        
        bigAr1=fillArray(bigAr1);
        bigAr2=fillArray(bigAr2);
        bigAr3=fillArray(bigAr3);
        
        selectionSortNPT(bigAr1);
        bubbleSortNPT(bigAr2);
        insertionSortNPT(bigAr3);
    }
    
    public static void selectionSort(int[] ar){
        int x=ar.length; 
        swapCount=0;
        
        // advance unsorted subarray forward using loop
        for(int i=0;i<x-1;i++){ 
            
            // find min of usorted subarray 
            int min_idx=i; 
            
            for(int j=i+1;j<x;j++) 
                if(ar[j]<ar[min_idx]) 
                    min_idx=j; 
            
            // swap min with first element (of unsorted subarray)
            int temp=ar[min_idx]; 
            ar[min_idx]=ar[i]; 
            ar[i]=temp; 
            
            if(temp==ar[min_idx])
                break;
            
            System.out.println(Arrays.toString(ar));
            swapCount++;
        } 
        
        System.out.println("Swap Count: "+swapCount+"\n");
    }
    
    public static void bubbleSort(int[] ar){
        int x=ar.length;
        swapCount=0;
        
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(ar[j]>ar[j+1]){
                    
                    // swap arr[j+1] and arr[i] 
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    
                    System.out.println(Arrays.toString(ar));
                    swapCount++;
                }
            }
        }  
        
        System.out.println("Swap Count: "+swapCount+"\n");
    }
    
    public static void insertionSort(int[] ar){
        int x=ar.length;
        swapCount=0;
        shiftCount=0;
        
        for(int i=1;i<x;++i){
            int key=ar[i];
            int j=i-1;

            // advance elements greater than key forward by one
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
                
                System.out.println(Arrays.toString(ar));
                shiftCount++;
            }
            ar[j+1]=key;
            
            System.out.println(Arrays.toString(ar));
            swapCount++;
        }
        
        System.out.println("Shift Count: "+shiftCount);
        System.out.println("Swap Count: "+swapCount+"\n");
    }
    
    /*--- NPT (No Print/Tracker) Sort Methods ---*/
    public static void selectionSortNPT(int[] ar){
        int x=ar.length; 
        
        start=System.nanoTime();
        
        for(int i=0;i<x-1;i++){ 
            int min_idx=i; 
            
            for(int j=i+1;j<x;j++) 
                if(ar[j]<ar[min_idx]) 
                    min_idx=j; 
            
            int temp=ar[min_idx]; 
            ar[min_idx]=ar[i]; 
            ar[i]=temp; 
            
            if(temp==ar[min_idx])
                break;
        } 
        
        end=System.nanoTime();
        System.out.println("Selection Sort Time: "+(end-start));
    }
    
    public static void bubbleSortNPT(int[] ar){
        int x=ar.length;
        
        start=System.nanoTime();
        
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }        
        
        end=System.nanoTime();
        System.out.println("Bubble Sort Time: "+(end-start));
    }
    
    public static void insertionSortNPT(int[] ar){
        int x=ar.length;
        
        start=System.nanoTime();
        
        for(int i=1;i<x;++i){
            int key=ar[i];
            int j=i-1;
            
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        
        end=System.nanoTime();
        System.out.println("Insertion Sort Time: "+(end-start));
    }
    
    /*--- Helper Method ---*/
    public static int[] fillArray(int[] ar){ // for size 10000 array
        for(int x=AR_SIZE;x>=0;x--){
            ar[AR_SIZE-x]=x;
        }
        return ar;
    }
}
