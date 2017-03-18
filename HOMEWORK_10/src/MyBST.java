/* RESULT: 
1,2,3,9,12,15,16,19,22,25,56,100,
VLR: 15,12,9,1,3,2,56,16,19,22,25,100,
LRV: 1,2,3,9,12,15,16,19,22,25,56,100,
Check contains 2: true
Get Root: 15
Numbers of leaf node: 3
Get Size: 12
Is Empty Check: false
Min: 1
Max: 100
 */
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int size = 0;
	private int min;
	private int max;

	public MyBST() {
		root = null;
	}
	
	public void preOrder(){ 
		preOrder(root);
	}
	private void preOrder(BinaryNode t){
		if(t == null)
			return;
		System.out.print(t.element+",");
		preOrder(t.left);
		preOrder(t.right);			 
	}
	
	public void postOrder(){ 
		postOrder(root);
	}
	private void postOrder(BinaryNode t){ //implement 
		if(t==null)
			return;
		postOrder(t.left);
		System.out.print(t.element + ",");
		postOrder(t.right);
	}
	
	public void inOrder(){ 
		inOrder(root);
	}
	private void inOrder(BinaryNode t){ //implement 
		if(t==null)
			return;
		inOrder(t.left);
		inOrder(t.right);
		System.out.print(t.element + ",");
	}

	public boolean contains(Integer key){
		BinaryNode t = root;
		while(t != null){
			if(t.element == key)
				return true;
			else if(t.element > key){
				t = t.left;
			} 
			else {
				t = t.right;
			}
		}	
		return false;
	}
	
	public Integer getRoot(){//implement
		BinaryNode t = root;
		if(t != null)
			return t.element;
		else
			return -1;
	}
	
	public Integer leafNodes(){
		return leafNodes(root);
	}
	static int sum = 0;
	private int leafNodes(BinaryNode t){// Implement
		
		if(t!= null){
			if(t.left == null && t.right == null)
				sum++;
			else{
				leafNodes(t.left);
				leafNodes(t.right);
			}
		}	
		return sum;
	}
	public int size(BinaryNode t){
		if(t == null)
			return size;
		else{
			size++;
			size(t.left);
			size(t.right);
		}
		return size;
	}
	public int size(){//implement
		 return size(root);
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public Integer findMin(){
		min = root.element;
		return findMin(root);
	}
	
	private Integer findMin(BinaryNode t){
		if(t != null){
			if(min > t.element )
				min = t.element;
			findMin(t.left);
			findMin(t.right);
		}
		return min;
	}
	public Integer findMax(){
		max = root.element;
		return findMax(root);
	}
	private Integer findMax(BinaryNode t){
		if(t !=null){
			if(max < t.element)
				max = t.element;
			findMax(t.left);
			findMax(t.right);
		}		
		return max;
	}
	
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
		 
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		//mybst.insert(12);
		mybst.printTree();
		System.out.println();
		System.out.print("VLR: ");
		mybst.preOrder();
		System.out.println();
		System.out.print("LRV: ");
		mybst.postOrder();
		System.out.println();
		System.out.println("Check contains 2: " + mybst.contains(2));
		System.out.println("Get Root: " + mybst.getRoot());
		System.out.format("Numbers of leaf node: %d",mybst.leafNodes());
		System.out.println();
		System.out.println("Get Size: " + mybst.size());
		System.out.println("Is Empty Check: " + mybst.isEmpty());
		System.out.println("Min: "+ mybst.findMin());
		System.out.println("Max: "+ mybst.findMax());
		
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		
//		for (int j = 0; j < a.length; j++ ) {
//			ts.add(a[j]);
//			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
//			Iterator<Integer> it = ts.iterator();		
//			Integer nextItem = null;
//			while(it.hasNext()) {
//				nextItem = it.next();
//				System.out.print(nextItem + " ");
//			} 
//			System.out.println();
//		}
//		
//		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//		map.put(8, "Hello");
//		map.put(10, "World!");
//		map.put(11, "Welcome");
//		map.remove(8);
//		String str = map.get(11)+", "+ map.get(10);
//		System.out.println(str);
			
	}
}
