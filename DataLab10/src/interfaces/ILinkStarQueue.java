package interfaces;

public interface ILinkStarQueue<Stars> {

		/**
		 * Adds the given <code>Stars</code> to the end of the queue as
		 * a new tail. (Order: FIFO)
		 * 
		 * @param st
		 */
		public void enqueue(Stars st);
		
		/**
		 * Adds all the elements of the given queue <code>sq</code> to
		 * the end of the queue.
		 * @param sq the queue that should be added to the end of this
		 * queue. (Order: FIFO)
		 */
		public void enqueueAll(ILinkStarQueue<Stars> sq);
		
		/**
		 * Retrieves and removes the first <code>Stars</code> (pointed to
		 * by the head) of this queue. (Order: FIFO)
		 * @return the
		 */
		public Stars dequeue();
		
		/**
		 * Retrieves, but does not remove, the first <code>Stars</code> of
		 * this queue (pointed to by head), or returns null if this queue is empty.
		 * @return the first element.
		 */
		public Stars peek();
		
		/**
		 * Retrieves, but does not remove, the last <code>Stars</code> of this queue.
		 * @return the last element.
		 */
		public Stars last();
		
		/**
		 * Makes the queue empty, by pointing both the head and tail to null.
		 */
		public void empty();
		
		/**
		 * 
		 * @return the number of elements in the queue.
		 */
		public int size();
		
		/**
		 * Displays the content of the queue using its first and last elements.
		 */
		public void displayQueue();

}
