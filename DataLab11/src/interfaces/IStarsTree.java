/*
* DO NOT MODIFY THIS!
*/

package interfaces;

import objects.Stars;

public interface IStarsTree<T>{	
	
	/**
	 * Returns the root node of the tree.
	 * @return
	 */
	public Stars getRoot();
	
	/**
	 * Returns the number of nodes in this tree.
	 * @return
	 */
	public int getNumberOfNodes();
	
	/**
	 * Inserts <code>st</code> to the tree by preserving the following two
	 * conditions:
	 * <ul>
	 * <li><code>st.length > st.leftChild.lengt</code></li>
	 * <li><code>st.length <= st.rightChild.length</code></li>
	 * </ul>
	 * 
	 * @param st
	 */
	public void insert(Stars st);

	
	/**
	 * <b>inorder:</b> node.left, node, node.right
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "inorder"
	 * fashion, meaning that for each node n, it visits the left sub-tree first,
	 * then the node n, and finally the right sub-tree.
	 */
	public void traverseInorder();
	
	/**
	 * <b>preorder:</b> node, node.left, node.right
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "preorder"
	 * fashion, meaning that for each node n, it visits n first, then the left
	 * sub-tree and finally the right sub-tree.</br>
	 * 
	 * <b>Note:</b> Pre-order means processing the roots prior to the leaves.
	 */
	public void traversePreorder();
	
	/**
	 * <b>postorder:</b> node.left, node.right, node
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "postorder"
	 * fashion, meaning that for each node n, it visits left sub-tree first, then
	 * the right sub-tree and finally the node n itself.</br>
	 * 
	 * <b>Note:</b> Post-order means processing the roots after the leaves.
	 */
	public void traversePostorder();
	
	/**
	 * This method traverses (and prints out) the nodes of the tree in "levelorder"
	 * fashion, meaning that it prints out all the nodes in level i, before it goes
	 * to the level i+1. </br>
	 * </br>
	 * <b>Hint:</b> Follow the steps of the pseudo code below:
	 * <pre>
	 *  queue.add(root)
	 *  while (queue is not empty):
	 *  	last = q.dequeue()
	 *  	print(last)
	 *  	if(last has left):
	 *  		q.add(left of last)
	 *  	if(last has right):
	 *  		q.add(right of last)
	 * </pre>
	 * </br>
	 */
	public void traverseLevelOrder();
	
	/**
	 * This method searches (Depth-first) through the tree, starting from the root
	 * looking for a Stars with the length equals to <code>len</code>.</br>
	 * This search follows the inorder pattern.
	 * 
	 * @param st the root of each sub-tree from which it starts the depth-first search.
	 * @param len the length of the Stars it searches for.
	 * @return the Stars whose length is equal to <code>len</code>, and <code>null</code>
	 * if such Stars does not exist in the tree.
	 */
	public Stars find(Stars st, int len);
	

}
