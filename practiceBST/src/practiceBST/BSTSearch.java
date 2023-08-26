package practiceBST;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

public class BSTSearch {
	private Node root, trav;

	public BSTSearch() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	

	private void preorder(Node trav) {
		// TODO Auto-generated method stub
		if(trav==null)
			return;
	System.out.print(trav.getData()+",");
	preorder(trav.getLeft());
	preorder(trav.getRight());
	}

	public boolean insert(int data) {

		Node nn = new Node(data);

		if (nn == null) {
			return false;
		}

		if (root == null) {
			root = nn;
			return true;
		}

		trav = root;
		while (true) {
			if (data == trav.getData()) {
				return false;
			}
			if (data < trav.getData()) {
				if (trav.getLeft() != null) {
					trav = trav.getLeft();
				}
				trav.setLeft(nn);
				break;

			} else {
				if (trav.getRight() != null) {
					trav = trav.getRight();
				}
				trav.setRight(nn);
				break;
			}
		}
		return true;
	}



	public void preorder() {
		// TODO Auto-generated method stub
		preorder(root);
		
	}

}
