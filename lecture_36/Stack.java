/*Stack is a linear data structure, That follow last in first out.
 * Only last element will be visible to the client. -> The top value the Peek value
 * 
 * Capacity -> How much element we can keep in the stack
 * Size -> Total number of element we kept in the stack
 * */

package lecture_36;

public class Stack {
	private int[] arr; // private so that it can only be accessible within the class
	private int top;

	// Stack s = new Stack() -> default size(5)
	public Stack() { // Default constructor when user doesn't specifies the array capacity
						// by Default we are specifying array of size 5
		arr = new int[5];
		top = -1; // if no element present

	}

	// Stack s = new Stack(30) -> capacity - 30;
	public Stack(int cap) {
		arr = new int[cap]; // When the user specifies the size of the array
		top = -1; // if no element present
	}

	public boolean isEmpty() {
//		if(top == -1) {					//stack is empty
//			return true;
//		}
//		return false;					//stack is filled

		return top == -1; // if top == -1 return true; else return false;
	}

	public boolean isFull() {
		return top == arr.length - 1;

	}

	public void push(int item) throws Exception {					//When stack is full still we are adding element								
		if(isFull() == true) {										//So that it doesn't give index out of bound
			throw new Exception("Stack is already full");
		}

		top++;
		arr[top] = item;
	}
	
	public int pop() throws Exception {							//Pop ->  delete the top element	
													
		if(isEmpty() == true) {
			throw new Exception("Stack is empty");
		}
		
		int val = arr[top];
		top--;	
		return val;
	}
	
	public int peek() throws Exception {						//Peek -> view the top element
		if(isFull() == true) {
			throw new Exception("Stack is full");
		}
		int val = arr[top];
		return val;
	}
	
	public int size() {
		  
		return top+1;
	}
	
	public void display() {
		
		for(int i = 0; i<=top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
