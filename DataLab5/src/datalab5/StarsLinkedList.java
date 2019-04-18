package datalab5;

import interfaces.LList;

/**
 * StarsLinkedList.java
 * Linked List Class
 *
 * @author Nate Heppard
 */

public class StarsLinkedList implements LList<Stars>{

    private Stars head;
    private int n;

    public StarsLinkedList(){
        this.head=null;
        this.n=0;
    }

    @Override
    public Stars get(int index){
        if(index>=this.n || index<0)
            return null;
        
        Stars current=this.head;
        
        for(int i=0;i<index;i++)
            current=current.getNext();
        
        return current;
    }

    @Override
    public void add(Stars St){
        if(this.n==0)
            this.head=new Stars(St); 
        else{
            Stars lastStar=this.get(this.n-1);
            lastStar.setNext(new Stars(St));
        }
        
        this.n++;
    }

    @Override
    public int add(Stars St,int index){
        Stars temp=new Stars(St);
        Stars current=this.head;
        
        if(index>this.size() || index<0)
            return -1; // add failure
        else if(index==0){ // could be its own push() method
                temp.setNext(current);
                this.head=temp;
                this.n++;
                return 0;
        }else{
            for(int i=1;i<index;i++){
                if(current.getNext()==null){
                    current.setNext(temp);
                    temp.setNext(null);
                    this.n++;
                    return 0;
                }
                current=current.getNext();
            }      
            temp.setNext(current.getNext());
            current.setNext(temp);
            this.n++;
            return 0;
        }
    }

    @Override
    public int remove(int index){
        Stars current=head;
        
        if(index<0 || index>this.size()){
            return -1; // indicates remove error
        }else if(index==0){
            this.head=current.getNext();
            current.setNext(null);
        }else{
            if(head!=null){
                for(int i=0;i<index-1;i++)
                    current=current.getNext();
                current.setNext(current.getNext().getNext());
            }
        }
        
        this.n--;
        return 0;
    }

    @Override
    public void empty(){
        this.head=null;
        this.n=0;
    }

    @Override
    public int size(){
        return n;
    }
}
