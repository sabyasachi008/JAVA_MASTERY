/*Queue is a linear data structure. Which follow First in first out (FIFO)
 * 
 * We are not importing Exception, Integer, System, character because they are present in the lang pakage in java
 * and the elements of the lang package in java are not required to be imported.*/

package lecture_36;

public class Queue {
	
	//Data Members of Class
	private int arr[];														
	private int size;								//Just like top of stack
	private int front;								//to view of To perform Dequeue	
													//To keep track of the first element and remove from the first element
	
	
	//This is done when the local variable and the data member have same variable name
	//Here this is unnecessary
	public Queue() {								//Default constructor -> size -> 5
		this.arr = new int[5];
		this.size = 0;
		this.front = 0;
		
	}
	
	public Queue(int cap) {							//paramterised constructor with size specified
		this.arr = new int[cap];
		this.size = 0;
		this.front = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;							//If total number element is equal to zero
	}
	
	public boolean isFull() { 
		return size == arr.length;					//since we are taking size from 0
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int item) throws Exception{				//To add element
		if(isFull() == true) {
			throw new Exception("Size is full");
		}
		int idx = (front+size)%arr.length;
		arr[idx] = item ;
		size++;
	}
	
	public int Dequeue() throws Exception {							//To remove element from the queue
		
		if(isEmpty() == true) {
			throw new Exception("The queue is empty");
		}
		int val = arr[front];
		front = (front+1)%arr.length;				//this is done to create a circular Queue
		size--;
		return val;
		
	}
	
	public int GetFront() throws Exception {
		
		if(isEmpty() == true) {
			throw new Exception("Queue is empty");
		}
		int val = arr[front];
		return val;
		
	}
	
	public void Display() {
		
		for(int i = 0; i<size; i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
