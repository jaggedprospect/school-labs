package objects;

//NO NEED TO CHANGE THIS CLASS IN ANY WAY

public class Stars implements Comparable<Stars> {
	public int length;
	private Stars next;
	private boolean isValid = true;
	
	public Stars() {
		this.length = 4;
		this.next = null;
		isValid = true;
	}
	
	public Stars(int len) {
		if(len >= 1) {
			this.length = len;
			this.next = null;
			isValid = true;
		}else {
			isValid = false;
			notValid();
		}
	}
	
	public Stars(Stars St) {
		if(St.isValid) {
			this.length = St.length;
			this.next = null;
		}else {
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
		if(isValid)
			this.next = St;
		else notValid();
	}
	
	
	@Override
	public String toString() {
		String starString = "";
		if(isValid) {
			starString = "(" + this.length + ")";
		}else {
			starString = "[This is an invalid Stars object]";
		}
		return starString;
	}
	
	@Override
	public int compareTo(Stars n) {
		return this.length - n.length;
	} 
	
}
