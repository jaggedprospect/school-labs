package objects;

import interfaces.ILinkStarQueue;

public class LinkStarQueue implements ILinkStarQueue<Stars>{

    int n;
    /**
     * oldest entry (to be served first)
     */
    private Stars head;
    /**
     * newest entry (to be served last)
     */
    private Stars tail;

    public LinkStarQueue(){
        this.n=0;
        this.head=null;
        this.tail=null;
    }

    @Override
    public void enqueue(Stars st){
        Stars old=tail;
        tail=new Stars();
        tail=st;
        tail.setNext(null);
        
        if(isEmpty())
            head=tail;
        else
            old.setNext(tail);
        
        n++;
    }

    @Override
    public void enqueueAll(ILinkStarQueue<Stars> sq){
        if(isEmpty()){
            head=sq.peek();
            tail=sq.last();
        }else{
            int max=sq.size();
            Stars[] nextStars=new Stars[4];
            Stars st=sq.peek();
            
            for(int i=0;i<max;i++){
                nextStars[i]=st;
                st=st.getNext();
            }
            
            for(Stars star : nextStars){
                enqueue(star);
            }
        }
    }

    @Override
    public Stars dequeue(){
        Stars st=null;
        
        if(isEmpty())
            System.out.println("Queue is empty.");
        else{
            st=head;
            head=head.getNext();
            n--;
        }
        
        if(isEmpty())
            tail=null;
        
        return st;
    }

    @Override
    public Stars peek(){
        if(isEmpty())
            System.out.println("Queue is empty.");
        
        return head;
    }

    @Override
    public Stars last(){
        if(isEmpty())
            System.out.println("Queue is empty.");
        
        return tail;
    }

    @Override
    public void empty(){
        if(!isEmpty()){
            head.setNext(null);
            tail.setNext(null);
            this.n=0;
        }else
            System.out.println("Queue is already empty.");
    }

    @Override
    public int size(){
        return n;
    }

    @Override
    public void displayQueue(){
        int i=0;
        String first="";
        String last="";

        System.out.print("\tn:"+this.size()+"\t");
        if(this.size()==0){
            first="(  ";
            last=")";
        }else{
            first=this.head.toString();
            last=this.tail.toString();
        }

        System.out.print("H -->");
        if(this.size()==1){
            System.out.print(this.peek());
        }else{
            System.out.print(first);
            for(;i<this.size()-2;i++){
                System.out.print("(*)");
            }
            System.out.print(last);
        }
        System.out.print("<-- T");
        System.out.println();
    }
    
    /*--- Check if Queue is Empty ---*/
    public boolean isEmpty(){
        return head==null;
    }
    
    public LinkStarQueue copy(LinkStarQueue q){
        LinkStarQueue copied=q;
        
        return copied;
    }
}
