package pack;

public class BTImp<T extends Comparable <T>> {
	
	private Node<T> root;
	
	public BTImp() {
		root = null;
	}
	
	/*public void tComp(T other) {
        //System.out.println("");
    }*/
	
	public void addElement(T data) {
		root = addElement(data, root);
	}
	
	private Node<T> addElement(T data, Node<T> myRoot) {
		if(myRoot == null) {
			return new Node<>(data);
		}
		
		int comp = data.compareTo(myRoot.data);
		
		if(comp < 0) {
			myRoot.left = addElement(data, myRoot.left);
		}
		else if(comp > 0) {
			myRoot.right = addElement(data, myRoot.right);
		}
		
				
		return myRoot;
	}
	
	public T findElement(T item) {
		return findElement(item, root);
	}
	
	private T findElement(T item, Node<T> myRoot) {
		if(myRoot == null) {
			return null;
		}
		else if(item.compareTo(myRoot.data) == 0) {
			return myRoot.data;
		}
		else if(item.compareTo(myRoot.data) < 0) {
			return findElement(item, myRoot.left);
		}
		else{
			return findElement(item, myRoot.right);
		}
		
	}
	
	public int getSize() {
		return getSize(0, root);
	}
	
	private int getSize(int tSize , Node<T> myRoot) {
		if(myRoot == null) {
			return tSize;
		}
		else {
			tSize = getSize(tSize, myRoot.left);
			tSize += 1;
			tSize = getSize(tSize, myRoot.right);
		}
		
		return tSize;
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	private void postOrder(Node<T> myRoot) {
		if(myRoot == null) {
			return;
		}
		
		postOrder(myRoot.left);
		postOrder(myRoot.right);
		System.out.println(myRoot.data + "");
		
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node<T> myRoot) {
		if(myRoot == null) {
			return;
		}
		
		System.out.println(myRoot.data + "");
		preOrder(myRoot.left);
		preOrder(myRoot.right);
	}
	
	
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node<T> myRoot) {
		if(myRoot == null) {
			return;
		}
		
		inOrder(myRoot.left);
		System.out.println(myRoot.data + " ");
		inOrder(myRoot.right);
		
	}
	
	
}
