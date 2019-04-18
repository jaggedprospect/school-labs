package objects;

import java.util.LinkedList;
import java.util.Queue;

import interfaces.IStarsTree;

/**
 * This class should implement the interface IStarsTree.
 *
 * This class creates a binary (search) tree with nodes of type Stars. A
 * StarsTree follows these properties: - It has a root Stars that is
 * parent/ancestor of all nodes. - For each Stars st, the following conditions
 * should always hold: - st.length > st.leftChild.length - st.length <=
 * st.rightChild.length
 */

public class StarsTree implements IStarsTree<Stars>{

    private Stars root;
    private int n;

    public StarsTree(){
        this.root=null;
        this.n=0;
    }

    @Override
    public Stars getRoot(){
        return this.root;
    }

    @Override
    public int getNumberOfNodes(){
        return this.n;
    }

    @Override
    public void insert(Stars st){
        this.root=this.insertRec(this.root,st);
        this.n++;
    }

    private Stars insertRec(Stars currentStars,Stars st){
        // If this node does not exist
        if(currentStars==null){
            return new Stars(st);
        }

        // If the new Stars is shorter than the current Stars,
        if(st.length<currentStars.length){
            // add st to the left of currentStars
            currentStars.setLeftChild(insertRec(currentStars.getLeftChild(),st));
        }else if(st.length>=currentStars.length){
            // else, add st to the right of currentStars
            currentStars.setRightChild(insertRec(currentStars.getRightChild(),st));
        }

        return currentStars;
    }

    @Override
    public void traverseInorder(){
        this.inorderRec(this.root);
    }

    private void inorderRec(Stars st){
        // ends recursive calls
        if(st==null)
            return;
        
        inorderRec(st.getLeftChild());
        System.out.print(st+" ");
        inorderRec(st.getRightChild());
    }

    @Override
    public void traversePreorder(){
        this.preorderRec(this.root);
    }

    private void preorderRec(Stars st){
        // ends recursive call
        if(st==null)
            return;
        
        System.out.print(st+" ");
        preorderRec(st.getLeftChild());
        preorderRec(st.getRightChild());
    }

    @Override
    public void traversePostorder(){
        this.postorderRec(this.root);
    }

    private void postorderRec(Stars st){
        // ends recursive calls
        if(st==null)
            return;
        
        postorderRec(st.getLeftChild());
        postorderRec(st.getRightChild());
        System.out.print(st+" ");
    }

    @Override
    public Stars find(Stars st,int len){
        if(st!=null){
            if(st.length==len)
                return st;
            else if(st.length>len)
                return find(st.getLeftChild(),len);
            else
                return find(st.getRightChild(),len);
        }      
        
        return null;
    }

    @Override
    public void traverseLevelOrder(){
        Queue<Stars> q=new LinkedList<>();
        Stars st=this.root;
        
        q.add(st);
        
        while(!q.isEmpty()){
            st=q.poll();
            System.out.print(st+" ");
            
            if(st.getLeftChild()!=null)
                q.add(st.getLeftChild());
            
            if(st.getRightChild()!=null)
                q.add(st.getRightChild());
        }
    }
}
