/**
 * The {@code Pile_LLC} class represents a last-in-first-out
 * (LIFO) stack of objects stored in LinkedList. It comes with those operations:
 * The usual {@code push} and {@code pop} operations are provided,
 * as well as a method to test for whether the stack {@code isEmpty},
 * a method returns the {@code size} of the list.
 *
 * <p><br>When a stack is first created, it contains no items.
 *
 * <p>For example:
 * <pre>   {@code
 * Pile_LLC<Integer> myStack = new Pile_LLC<Integer>();}</pre>
 *
 * @param <myType> : Type of component elements
 *
 * @author Abderrahmane SAOUDI
 * @author Assia CHAGHA
 * @Variable Node <myType> head : one cell of the LinkedList
 * @Variable int N : number of elements
 */

public class Pile_LLC<myType> {
	private Node<myType> head;
	private int N = 0;
	/** Creates an empty Stack with #null head. */
	public Pile_LLC () {this.head = null;}

	/**
	 * Test if the Stack is empty.
	 *
	 * @return {@code true} if and only if this stack contains no items;
	 * {@code false} otherwise.
	 */
	public boolean isEmpty () {return head == null;}

	/**
	 * Pushes an item onto the top of this stack. This has exactly
	 *
	 * @param value the value to be pushed onto the stack.
	 */
	public void push (myType value) {
		Node<myType> oldHead = new Node<> ();
		oldHead.value = value;
		oldHead.next = head;
		head = oldHead;
		N++;
	}

	/**
	 * Removes the object at the top of this stack and returns the value
	 * of that object as the value of this function.
	 *
	 * @return The value of the object at the head of this stack.
	 */
	public myType pop () {
		myType value = head.value;
		head = head.next;
		N--;
		return value;
	}

	/**
	 * @return The number of elements in the stack.
	 */
	public int size () {return N;}

	private class Node<myType> {
		myType value;
		Node next;
	}
}
