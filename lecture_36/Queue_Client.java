/*Enqueue -> adding an element to the rear(end) of the queue.
 *Dequeue -> removing an element from the front of the queue.
 */

package lecture_36;

public class Queue_Client {
	public static void main(String[] args) throws Exception {
		
		Queue q = new Queue();
		
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(-20);
		q.Enqueue(-30);
		q.Enqueue(-40);
		q.Display();

	}
}
