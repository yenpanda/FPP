/* RESULT:
 * Top element before delete: 1
 * Top element after delete: 3
 * Check empty: false
 * Size of queue4
 */
import java.util.Arrays;

public class ArrayQueueImpl {
	
private int[] arr = new int[2];
private int front = -1;
private int rear = 0;
public int peek() { 
	if(front == -1)
		return -1;
	else
		return arr[front];
}
 
//implement enqueue
public void enqueue(int obj){
	if(rear+1 == arr.length)
		resize();
	if(front == -1){
		front++;
		arr[front]= obj;
	}
	else {
		rear++;
		arr[rear] = obj;
	}
}

//implement dequeue
public int dequeue() { 
	if(isEmpty())
		return -1;
	int f =arr[front];
	if(rear==0){
		front--;
		return f;
	}
	System.arraycopy(arr, 1, arr, 0, rear-1);
	rear--;
	return f;
	
}
//implement isEmpty
public boolean isEmpty(){ 
	return (front==-1);
		 
}

//implement size
public int size(){ 
	return rear+1;
} 

//implement resize
private void resize(){
	arr = Arrays.copyOf(arr, arr.length*2);
}

public static void main(String []args){
	ArrayQueueImpl que = new ArrayQueueImpl();
	que.enqueue(1);
	que.enqueue(3);
	que.enqueue(5);
	que.enqueue(7);
	que.enqueue(9);
	System.out.println("Top element before delete: "+que.peek());
	que.dequeue();
	System.out.println("Top element after delete: "+que.peek());
	System.out.println("Check empty: "+que.isEmpty());
	System.out.println("Size of queue"+ que.size());
}
}