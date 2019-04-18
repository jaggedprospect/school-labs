package interfaces;

/**
 * NO NEED TO CHANGE THIS CLASS IN ANY WAY. I WILL BE USING MY OWN ORIGINAL COPY
 * OF THIS CLASS FOR GRADING YOUR SUBMISSIONS. CHANGES TO THIS CLASS WILL IMPACT
 * THE WAY YOUR SUBMITTED CODE EXECUTES ON MY MACHINE.
 */
//DO NOT EDIT
/**
 * This interface declares some additional useful methods for linked lists
 *
 *
 * @param <Stars>
 */
public interface LList2<Stars> {

    /**
     *
     * @return the size of the list
     */
    public int size();

    /**
     * This method returns the <code>head</code> of the list
     *
     * @return list's head
     */
    public Stars returnHead();

    /**
     * This method returns the <code>tail</code> of the list
     *
     * @return list's tail
     */
    public Stars returnTail();

    /**
     * Removes all elements from this list by making the head and tail point to
     * null
     */
    public void empty();

    /**
     * This method returns the element of the list at position
     * <code>index</code> If index is larger than the list's midpoint, scanning
     * begins at tail. Otherwise, scanning begins at head.
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
     * This method adds an entire linked list to the end of <code>this</code>
     * linked list
     *
     * @param sLL is the list to be added to <code>this</code> list
     */
    public void appendLinkList(LList2<Stars> sLL);

    /**
     * This method adds an entire linked list at some index position of
     * <code>this</code> list
     *
     * note: cannot insert at index 0
     *
     *
     * @param sLL is the list to be added to <code>this</code> list
     * @param index is the position in <code>this</code> list to add
     * <code>sLL</code>
     *
     * @return 0 if successful, -1 otherwise
     */
    public int insertLinkList(LList2<Stars> sLL, int index);

    /**
     * This method removes a user defined portion of the list
     *
     * @param from - the beginning index for removal(inclusive)
     * @param to - the ending index for removal(inclusive)
     *
     * @return 0 if successful, -1 otherwise
     */
    public int removePortion(int from, int to);

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
