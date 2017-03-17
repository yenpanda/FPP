/* RESULT:
size(): 2
BBB
AAA
size(): 1
AAA

 */
interface Stack1{ 
	public void push(String ob);
	public Node pop();
	public Node peek();
	public boolean isEmpty();
	public int size();
}
class Node{
	String data;
	Node next;
	Node pre;
	public Node(Node next, String data, Node pre) {
		this.data = data;
		this.next = next;
		this.pre = pre;
	}
	public Node(String data){
		this.data = data;
		this.next = null;
		this.pre = null;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", pre=" + pre + "]";
	}
	
}
class LinkedListStack implements Stack1{

	private Node top; // stack top
	public LinkedListStack() // constructor
	{ 
		top = null; // no items in the stack
	}
	@Override
	public void push(String item) // add an item on top of stack
	{
		Node newNode = new Node(null, item, null);
		if(top == null){ 	
			top = newNode;
		}
		else{
			top.next = newNode;
			newNode.pre = top;
			top = newNode;
		}

	}
	@Override
	public Node pop() // remove an item from top of stack
	{
		if( isEmpty() ) 
			return null;
		Node tmp = top;
		if(top.pre == null)
			return top = null;
		top.pre.next = null;
		top = top.pre;
		return tmp;
	}
	@Override
	public Node peek() // get top item of stack
	{
		if( isEmpty() ) 
			return null;
		return top;
	}
	
	@Override
	public boolean isEmpty() // true if stack is empty
	{ 
		return (top == null); 
	}
	
	@Override
	public int size() // returns number of items in the stack
	{ 
		int count = 1;
		if(top== null)
			return 0;
		else {
			Node tmp = top;
			while(tmp.pre!=null){
				count++;
				tmp = tmp.pre;
			}
		}
		return count; 
	}
	
	public static void main(String[] args) {
		LinkedListStack stk = new LinkedListStack(); 
		stk.push("AAA"); 
		stk.push("BBB"); 
		System.out.println("size(): "+ stk.size());
		System.out.println(stk.top.data);
		System.out.println(stk.top.pre.data);
		stk.pop();
		System.out.println("size(): "+ stk.size());
		stk.peek();
		System.out.println(stk.top.data);
}

}
