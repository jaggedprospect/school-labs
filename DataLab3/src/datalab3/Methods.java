package datalab3;

import interfaces.IMethods;

/**
 * This class must implement the interface IMethods.
 * 
 * @author Nate Heppard 900-93-8628
 */

public class Methods implements IMethods{
    
    int addCounter=0;
    int addRecCounter=0;
    int sequentialSearchCounter=0;
    int searchRecCounter=0;
    int searchIterCounter=0;

    @Override
    public int subRec(int a,int b){
        if(b==0){
            return a;
        }else
            return subRec(a,b-1)-1;
    }

    @Override
    public int add(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            addCounter++;
            sum+=i;
        }
        return sum;
    }

    @Override
    public int addRec(int n){
        addRecCounter++;
        if(n==0){
            return n;
        }else
          return addRec(n-1)+n;  
    }

    @Override
    public int sequentialSearch(double[] arr,double x){
        for(int i=0;i<arr.length;i++){
            sequentialSearchCounter++;
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    @Override
    public int searchRec(double[] arr,int from,int to,double x){
        searchRecCounter++;
        if(to>=from){
            int mid=from+(to-from)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>x)
                return searchRec(arr,from,mid-1,x);
            return searchRec(arr,mid+1,to,x);
        }
        return -1;
    }

    @Override
    public int searchIter(double[] arr,int from,int to,double x){
        while(from<=to){
            searchIterCounter++;
            int mid=from+(to-from)/2; 
            if (arr[mid]==x) 
                return mid; 
            if (arr[mid]<x) 
                from=mid+1; 
            else
                to=mid-1; 
        }
        return -1;
    }
}
