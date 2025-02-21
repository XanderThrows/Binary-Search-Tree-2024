package pack;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BTImp<Integer> tree = new BTImp<>();
		BTImp<String> tree = new BTImp<>();
		
		//Add element
		tree.addElement("F");
        tree.addElement("G");
        tree.addElement("A");
        tree.addElement("D");
        tree.addElement("E");
        tree.addElement("C");
        tree.addElement("B");
        //tree.addElement("F");
		
		/*tree.addElement(90);
        tree.addElement(10);
        tree.addElement(250);
        tree.addElement(70);
        tree.addElement(240);
        tree.addElement(50);
        tree.addElement(300);*/
        
        //Functions use
        System.out.println("In-Order Traversal: ");
        tree.inOrder();
        System.out.println("");
        
        System.out.println("Post-Order Traversal: ");
        tree.postOrder();
        System.out.println("");
        
        System.out.println("Pre-Order Traversal: ");
        tree.preOrder();
        System.out.println("");
        
        System.out.println("Find Element: ");
        System.out.println("Finding F: ");
        System.out.println(tree.findElement("F"));
        System.out.println("Finding S: ");
        System.out.println(tree.findElement("S"));
        System.out.println("");
        
        System.out.println("Tree Size: ");
        System.out.println(tree.getSize());
        System.out.println("");
	}

}

