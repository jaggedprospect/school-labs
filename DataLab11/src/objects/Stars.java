/*
* DO NOT MODIFY THIS!
*/

package objects;

/**
 * Stars is a line with a certain length. This class creates nodes with three
 * pieces of information: the length of the Stars, the address to its left
 * child, and the address to its right child. Therefore, it can be used as the
 * tree nodes.
 */
public class Stars implements Comparable<Stars> {

	/** Length of the Stars object */
	public int length;

	/** A link to the right child */
	private Stars right;

	/** A link to the left child */
	private Stars left;

	/**
	 * The default constructor. Using this constructor, an instance of Stars will be
	 * created with the default length of 2. Both child nodes will be set to
	 * null.
	 */
	public Stars() {
		this.length = 2;
		this.right = null;
		this.left = null;
	}

	/**
	 * The constructor. Using this constructor, an instance of Stars will be created
	 * with the length of len. Both child nodes will be set to
	 * null.
	 * 
	 * @param len length of the line.
	 */
	public Stars(int len) {
		this.length = len;
		this.right = null;
		this.left = null;
	}

	/**
	 * Copy constructor. This should be used to avoid unwanted effects previous object
	 * linkage
	 * 
	 * @param st the Stars object being copied.
	 */
	public Stars(Stars st) {
		this.length = st.length;
		this.right = null;
		this.left = null;
	}

	/**
	 * Getter for the class field right
	 * 
	 * @return the right child Stars object of this node, returns null if no right child
	 * 	exists
	 */
	public Stars getRightChild() {
		return (this.right);
	}

	/**
	 * Getter for the class field left
	 * 
	 * @return the left child Stars object of this node, returns null if no left child
	 * 	exists
	 */
	public Stars getLeftChild() {
		return (this.left);
	}

	/**
	 * Setter for the class field right
	 * 
	 * @param st the Stars object that will be connected to this Stars object as its
	 * 	right child
	 */
	public void setRightChild(Stars st) {
		this.right = st;
	}

	/**
	 * Setter for the class field left
	 * 
	 * @param st the Stars object that will be connected to this Stars object as its
	 * 	left child
	 */
	public void setLeftChild(Stars st) {
		this.left = st;
	}

	/**
	 * This method overrides 'toString' for Stars objects. 
	 */
	@Override
	public String toString() {
		String len = "";
		len = this.length + "";
		return len;
	}

	/**
	 * This method allows for the comparison of Stars objects.
	 * 
	 * Example:
	 * if(line1.compareTo(line2) > 0) {
	 *   line1 is longer than line2.}
	 */
	@Override
	public int compareTo(Stars line) {
		return this.length - line.length;
	}

}
