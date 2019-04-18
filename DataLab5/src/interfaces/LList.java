package interfaces;

/**
 * LList.java
 * Interface Class
 *
 * @author heppa
 */
/**
 * NO NEED TO CHANGE THIS CLASS IN ANY WAY. I WILL BE USING MY OWN ORIGINAL COPY
 * OF THIS CLASS FOR GRADING YOUR SUBMISSIONS. CHANGES TO THIS CLASS WILL IMPACT
 * THE WAY YOUR SUBMITTED CODE EXECUTES ON MY MACHINE.
 */
//Create a package called ‘interfaces’ in your ‘src’ folder and save
//this file there.
/**
 * This interface declares the important methods for the creation of a custom
 * linked list.
 *
 *
 * @param <Stars>
 */
public interface LList<Stars> {

    /**
     * This method returns the element of the list at position
     * <code>index</code>
     *
     * @param index index of the element to be returned
     * @return the element at <code>index</code> if <code>index</code> is valid,
     * otherwise return <code>null</code>
     */
    public Stars get(int index);

    /**
     * This method adds the object <code>St</code> to the end this list
     *
     * @param St The object to be added to the list
     */
    public void add(Stars St);

    /**
     * This method adds the object <code>St</code> to position
     * <code>index</code> and shifts the objects after one position to the right
     *
     * @param St The object to be added
     * @param index The position at which to add <code>St</code>
     * @return If successful, return 0. Otherwise, return -1.
     */
    public int add(Stars St, int index);

    /**
     * This method removes an object from position <code>index</code> and shifts
     * elements following the removed object one position to the left
     *
     * @param index The position of the object to be removed
     *
     * @return Return 0 if successful, and -1 otherwise.
     */
    public int remove(int index);

    /**
     * Removes all elements from this list by making the head point to null
     */
    public void empty();

    /**
     *
     * @return the size of the list
     */
    public int size();

    /**
     * Allows for a StarsLinkedList to be printed
     */
    public default void displayStars() {
        System.out.println();
        System.out.println(">Start List>");
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i).toString());
        }
        System.out.println("<End List<");
        System.out.println();

    }
}

