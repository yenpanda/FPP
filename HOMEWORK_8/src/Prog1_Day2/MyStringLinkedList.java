
public class MyStringLinkedList {
	Node header;
	//Node tail;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
	}

// Implement the code

	public void addLast(String item) {
		if(header == null)
			header = new Node(null, item, null);
		else {
			Node tmp = header;
			while(tmp.next != null )
			{
				tmp = tmp.next;
			}
			Node m = new Node(tmp, item, null);
			tmp.next = m;
		
		}
	}


	// implement the code
	public void postAddNode(Node n, String value){
		Node newPostNode;
		if(n==null)
			newPostNode = new Node(null,value,null);
		else if (n.next == null){
			addLast(value);
		}
		else{
			Node tmp = n.next;
			newPostNode = new Node(n,value, n.next);
			n.next = newPostNode;
			//n.next.previous = newPostNode;
			newPostNode.next = tmp;
		}
					
	}
// implement the code

       public int Size(){
    	   int count = 1;
    	   if(header == null)
    		   return 0;
    	   if(header!=null){
    		   Node tmp = header;
    		   while(tmp.next != null){
    			   tmp = tmp.next;
    			   count++;
    		   }
    	   }
    	   return count;
       }

// implement code isEmpty()
    public boolean isEmpty(){
    	if(header !=null)
    		return true;
    	return false;
}  

// implement getFirst()
    public Node getFirst(){
    	if(header == null)
    		return null;
    	else {
    		return header;
    	}
    }
    
// implement getLast()
    public Node getLast(){
    	if(header == null)
    		return null;
    	else {
    		Node tmp = header;
        	while(tmp!=null){
        		tmp = tmp.next;
        	}	
        	return tmp;
    	}	
    }
    
// implement removeFirst()
    public void removeFirst(){
    	if(header == null || header.next == null)
    		return;
    	else {
    	    header = header.next;
    	}
    }
    
// implement removeLast()
    public void removeLast(){
    	if(header == null)
    		return;
    	else {
    		Node tmp = header;
			while (tmp != null)
				tmp = tmp.next;
			tmp.previous.next = null;
    	}
    }
    
// implement printMin()
    public void printMin(){
    	if(header == null)
    		return;
    	else{
    		Node tmp = header;
    		String min = header.value;
    		while(tmp != null){
    			if(min.compareTo(tmp.value) > 0)
    				min = tmp.value;
    			tmp = tmp.next;  				
    		}	
        	System.out.println("Min: " + min);
    	}
    }
 // implement printMax()
    public void printMax(){
    	if(header == null)
    		return;
    	else{
    		Node tmp = header;
    		String max = header.value;
    		while(tmp != null){
    			if(max.compareTo(tmp.value) < 0){
    				max = tmp.value;
    				tmp = tmp.next; 
    			}
    			tmp = tmp.next;  				
    		}
        	System.out.println("Max: " + max);	
    	}
    }
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
	
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}
		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.addFront("Coffee");	
		System.out.println(mySL);
		mySL.addFront("AAA");	
		System.out.println(mySL);
		mySL.postAddNode(mySL.header, "BBB");
		System.out.println(mySL);
		System.out.println(mySL.Size());
		mySL.preAddNode(mySL.header.next, "KDDD");
		System.out.println(mySL);
		System.out.println(mySL.getFirst());
		System.out.println(mySL.getLast());
		mySL.removeFirst();
		System.out.println(mySL);
		mySL.removeLast();
		System.out.println(mySL);
		mySL.printMax();
		mySL.printMin();
//		mySL.postAddNode(mySL.header, "1111");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.addFront("Blueberry Muffin");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.addFront("Apple Pie");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.addLast("Orange Juice");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.addLast("Peach Sauce");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Apple Pie"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Peach Sauce"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Carrot Cake"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteList();
//		System.out.println(mySL);
//		mySL.printReverse();
	}

}
