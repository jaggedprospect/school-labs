package datalab6;

/**
 * NO NEED TO CHANGE THIS CLASS IN ANY WAY. I WILL BE USING MY OWN ORIGINAL COPY
 * OF THIS CLASS FOR GRADING YOUR SUBMISSIONS. CHANGES TO THIS CLASS WILL IMPACT
 * THE WAY YOUR SUBMITTED CODE EXECUTES ON MY MACHINE.
 */
//DO NOT EDIT
public class Stars implements Comparable<Stars> {

    public int length;
    private Stars next;
    private Stars previous;
    private boolean isValid = true;

    //default constructor
    public Stars() {
        this.length = 4;
        this.next = null;
        this.previous = null;
        isValid = true;
    }

    //constructor allowing for length to be set by user
    public Stars(int len) {
        if (len >= 1) {
            this.length = len;
            this.next = null;
            this.previous = null;
            isValid = true;
        } else {
            isValid = false;
            notValid();
        }
    }

    //copy constructor helps in cases where a single Stars object may already be attached to a list 
    public Stars(Stars St) {
        if (St.isValid) {
            this.length = St.length;
            this.next = null;
            this.previous = null;
        } else {
            this.isValid = false;
            notValid();
        }
    }

    protected void notValid() {
        System.out.println("[This is an invalid Stars object]");
    }

    public Stars getNext() {
        return this.next;
    }

    public void setNext(Stars St) {
        if (isValid) {
            this.next = St;
        } else {
            notValid();
        }
    }

    //sets next to null
    public void setNext() {
        if (isValid) {
            this.next = null;
        } else {
            notValid();
        }
    }

    public Stars getPrevious() {
        return this.previous;
    }

    public void setPrevious(Stars St) {
        if (isValid) {
            this.previous = St;
        } else {
            notValid();
        }
    }

    //sets previous to null
    public void setPrevious() {
        if (isValid) {
            this.previous = null;
        } else {
            notValid();
        }
    }

    @Override
    public String toString() {
        String starString = "";
        if (isValid) {
            if (this.length % 2 == 0) {
                starString = "[";
                for (int i = this.length; i > 0; i -= 2) {
                    starString += "*";
                }
                starString += this.length;
                for (int i = this.length; i > 0; i -= 2) {
                    starString += "*";
                }
                starString += "]";
            }
            if (this.length % 2 == 1) {
                starString = "[";
                for (int i = this.length; i > 0; i -= 2) {
                    starString += "*";
                }
                starString += this.length;
                for (int i = this.length - 1; i > 0; i -= 2) {
                    starString += "*";
                }
                starString += "]";
            }
        } else {
            starString = "[This is an invalid Stars object]";
        }
        return starString;
    }

    @Override
    public int compareTo(Stars n) {
        return this.length - n.length;
    }

}
