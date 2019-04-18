package datalab6;

import interfaces.LList2;

public class StarsLinkedList2 implements LList2<Stars>{
    
    private Stars head;
    private Stars tail;
    private int n;

    public StarsLinkedList2() {
        this.head = null;
        this.tail = null;
        this.n = 0;
    }

    @Override
    public int size() {
        return this.n;
    }

    @Override
    public Stars returnHead() {
        return this.head;
    }

    @Override
    public Stars returnTail() {
        return this.tail;
    }

    @Override
    public void empty() {
        this.head = null;
        this.tail = null;
        this.n = 0;
    }

    @Override
    public Stars get(int index) {
        if(index>=this.n || index<0)
            return null;
        
        Stars current;

        if (this.n / 2 > index) {
            current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } else {
            current = this.tail;
            for (int i = this.n-1; i > index; i--) {
                current = current.getPrevious();
            }
        }
        return current;
    }

    @Override
    public void add(Stars St) { // note: lastStar == lastElement
        if(this.n==0){
            this.head=new Stars(St);
            this.tail=this.head;
        }else{
            Stars lastStar=this.get(this.n-1);
            lastStar.setNext(new Stars(St));
            lastStar.getNext().setPrevious(lastStar);
            this.tail=lastStar.getNext();
        }
        this.n++;
    }

    @Override
    public void appendLinkList(LList2<Stars> sLL) {
        if(this.size()<1){
            this.head=sLL.returnHead();
            this.tail=sLL.returnTail();
        }else{
            this.tail.setNext(sLL.returnHead());
            sLL.returnHead().setPrevious(this.tail);
            this.tail=sLL.returnTail();
        }
        this.n+=sLL.size();
    }

    @Override
    public int insertLinkList(LList2<Stars> sLL, int index) {
        if(this.size()<0)
            return -1;
        if(index>this.size() || index<0)
            return -1;
        else{
            Stars current=this.get(index-1);
            sLL.returnTail().setNext(current.getNext());
            current.getNext().setPrevious(sLL.returnTail());
            current.setNext(sLL.returnHead());
            sLL.returnHead().setPrevious(current);
        }
        this.n+=sLL.size();
        return 0;
    }

    @Override
    public int removePortion(int from, int to) {
        if(this.size()==0)
            return -1;
        if(from<0 || from>=this.size() || to<0 || to>this.size())
            return -1;
        else{
            Stars start=this.get(from);
            Stars end=this.get(to);
            start.getPrevious().setNext(end.getNext());
            end.getNext().setPrevious(start.getPrevious());
        }
        this.n-=to-from;
        return 0;
    }

}
