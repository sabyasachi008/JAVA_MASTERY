package lecture_36;

public class Stack_client {
	
	public static void main(String[] args) throws Exception {
		
		Stack st = new Stack();	
		st.push(56);
		st.push(6);
		st.push(2);
		st.push(90);
		st.push(1);
		
		System.out.println(st.peek());				//Top Element
		
		st.display();								//To view the whole stack
		
		 System.out.println(st.pop());				//To remove the top element 
		 
		 st.display();								//To Display after removing the peek element
		 st.push(91);								//To add new element
		 st.display();								//To view the whole stack
		 System.out.println(st.size());				//To print the size of the stack
		 
	}

}
