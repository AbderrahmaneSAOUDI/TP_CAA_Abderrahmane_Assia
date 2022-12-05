/**
 * The {@code Pile_Tableau} class represents a last-in-first-out
 * (LIFO) stack of objects stored in Array. It comes with those operations:
 * The usual {@code push} and {@code pop} operations are provided,
 * as well as a method to test for whether the stack {@code isEmpty},
 * a method {@code size}
 *
 * <p>When a stack is first created, it contains no items, and array created with {@param capacity} cells.
 *
 * <p><br>For example:
 * <pre>   {@code
 * Pile_Tableau<Integer> myStack = new Pile_Tableau<Integer>();}</pre>
 *
 * @param <myType> : Type of component elements
 * @Variable Node<myType> head : one cell of the LinkedList
 * @Variable int N : number of elements
 *
 * @author Abderrahmane SAOUDI
 * @author Assia CHAGHA
 */
public class Pile_Tableau<myType> {
	private myType[] tab;
	private int N = 0;

	/** Creates an empty Stack with {capacity} cells in array. */
	public Pile_Tableau (int capacity) {tab = (myType[]) new Object[capacity];}

	/**
	 * Test if the Stack is empty.
	 *
	 * @return  {@code true} if and only if this stack contains no items;
	 *          {@code false} otherwise.
	 */
	public boolean isEmpty () {return N == 0;}

	/**
	 * Pushes an item onto the top of this stack. This has exactly
	 *
	 * @param   value   the value to be pushed onto the stack.
	 */
	public void push (myType value) {
		if (N == tab.length)
			resize (2 * tab.length);
		tab[N++] = value;
	}

	/**
	 * Removes the object at the top of this stack and returns the value
	 * of that object as the value of this function.
	 *
	 * @return  The value of the object at the head of this stack.
	 */
	public myType pop () {
		myType value = tab[-- N];
		tab[N] = null;
		if (N > 0 && N == tab.length / 4) resize (tab.length / 2);
		return value;
	}

	/**
	 * @return  The number of elements in the stack.
	 */
	public int size () {return N;}

	/**
	 * Replace the current array with another array of
	 * {@param capacity} and copy the data from old array.
	 *
	 * @param   capacity   The size of the new array.
	 */
	private void resize (int capacity) {
		myType[] copy = (myType[]) new Object[capacity];
		for (int i = 0; i < N; i++)
			copy[i] = tab[i];
		tab = copy;
	}

	/**
	 * Test if the inner array is full.
	 *
	 * @return  {@code true} if and only if the inner array is full;
	 *          {@code false} otherwise.
	 */
	public boolean isFull () {
		return tab.length == N;
	}
}
