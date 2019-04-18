package blackbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import objects.Stars;

/**
 * <b>DO NOT MODIFY THIS!</b><br>
 * This class is responsible for a readable print-out of
 * the binary tree.
 * This is copied from StackOverflow with some minor modifications:
 * https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
 * 
 * @author See the link above.
 *
 */
public abstract class TreePrinter {

	public static void printNode(Stars root) {
		int maxLevel = TreePrinter.maxLevel(root);

		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static <T extends Comparable<?>> void printNodeInternal(List<Stars> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || TreePrinter.isAllElementsNull(nodes))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		TreePrinter.printWhitespaces(firstSpaces);

		List<Stars> newNodes = new ArrayList<Stars>();
		for (Stars node : nodes) {
			if (node != null) {
				System.out.print(node);
				newNodes.add(node.getLeftChild());
				newNodes.add(node.getRightChild());
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			TreePrinter.printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				TreePrinter.printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					TreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).getLeftChild() != null)
					System.out.print("/");
				else
					TreePrinter.printWhitespaces(1);

				TreePrinter.printWhitespaces(i + i - 1);

				if (nodes.get(j).getRightChild() != null)
					System.out.print("\\");
				else
					TreePrinter.printWhitespaces(1);

				TreePrinter.printWhitespaces(endgeLines + endgeLines - i);
			}

			System.out.println("");
		}

		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	private static int maxLevel(Stars node) {
		if (node == null)
			return 0;

		return Math.max(TreePrinter.maxLevel(node.getLeftChild()), TreePrinter.maxLevel(node.getRightChild())) + 1;
	}

	private static <T> boolean isAllElementsNull(List<Stars> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}

		return true;
	}

}
