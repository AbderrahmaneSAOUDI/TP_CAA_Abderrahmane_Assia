import java.util.Stack;

/**
 * The {@code Main} class represents the main part of the project.
 * <br>
 * It comes with those methods: <br>
 * {@code main} : the main method of the program.
 * other methods are detailed in its header.
 * <br>
 *
 * @author Abderrahmane SAOUDI
 * @author Assia CHAGHA
 */
public class Main {

	public static void main (String[] args) {
		int start_size = 1024, step = 1024, itteration = 20;

		/**
		 *
		* */
		System.out.println ("***********[Push]***********");
		for (int i = start_size; i < start_size + step * itteration; i += step) {
			Pile_Tableau<Integer> tableau = new Pile_Tableau<Integer> (1);
			Pile_LLC<Integer> list = new Pile_LLC<Integer> ();
			Stack<Integer> stack = new Stack<Integer> ();

			System.out.println (i + "\t" + push_N_Tableau (tableau, i) + "\t" + push_N_LLC (list, i) + "\t" + push_N_Stack (stack, i));
		}

		/**********************************/
		start_size = 1024;
		System.out.println ("\n\n\n***********[POP]***********");
		for (int i = start_size; i < start_size + step * itteration; i += step) {
			Pile_Tableau<Integer> tableau = new Pile_Tableau<Integer> (1);
			Pile_LLC<Integer> list = new Pile_LLC<Integer> ();
			Stack<Integer> stack = new Stack<Integer> ();

			fill_Tableaux (tableau, i);
			fill_LLC (list, i);
			fill_Stack (stack, i);

			System.out.println (i + "\t" + pop_Tableau (tableau) + "\t" + pop_LLC (list) + "\t" + pop_Stack (stack));
		}

		/**********************************/
		start_size = 1024;
		System.out.println ("\n\n\n***********[Push + Pop]***********");
		for (int i = start_size; i < (start_size + step * itteration) * 2; i *= 2) {
			Pile_Tableau<Integer> tableau = new Pile_Tableau<Integer> (1);
			Pile_LLC<Integer> list = new Pile_LLC<Integer> ();
			Stack<Integer> stack = new Stack<Integer> ();

			fill_Tableaux (tableau, i);
			fill_LLC (list, i);
			fill_Stack (stack, i);

			System.out.println (i + "\t" + push_pop_Tableau (tableau) + "\t" + push_pop_LLC (list) + "\t" + push_pop_Stack (stack));
		}


		/**********************************/
		start_size = 1024;
		System.out.println ("\n\n\n***********[Push + Pop]***********");

	}

	// Fill the user-defined Stack(Array) by [_num_itter] items.
	static void fill_Tableaux (Pile_Tableau<Integer> _tableau, int _num_itter) {
		for (int i = 0; i <= _num_itter; i++)
			_tableau.push (i);
	}

	// Fill the user-defined Stack(LinkedList) by [_num_itter] items.
	static void fill_LLC (Pile_LLC<Integer> _list, int _num_itter) {
		for (int i = 0; i <= _num_itter; i++)
			_list.push (i);
	}

	// Fill the java-defined Stack by [_num_itter] items.
	static void fill_Stack (Stack<Integer> _stack, int _num_itter) {
		for (int i = 0; i <= _num_itter; i++)
			_stack.push (i);
	}

	// calculate time spent to push [_num_itter] items in the user-defined Stack(Array).
	static long push_N_Tableau (Pile_Tableau<Integer> _tableau, int _num_itter) {
		long start = System.nanoTime ();
		for (int i = 0; i <= _num_itter; i++)
			_tableau.push (i);
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to push [_num_itter] items in the user-defined Stack(LinkedList).
	static long push_N_LLC (Pile_LLC<Integer> _list, int _num_itter) {
		long start = System.nanoTime ();
		for (int i = 0; i <= _num_itter; i++)
			_list.push (i);
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to push [_num_itter] items in the java-defined Stack.
	static long push_N_Stack (Stack<Integer> _stack, int _num_itter) {
		long start = System.nanoTime ();
		for (int i = 0; i <= _num_itter; i++)
			_stack.push (i);
		long end = System.nanoTime ();
		return end - start;
	}

	/**********************************/

	// calculate time spent to pop [_num_itter] items from the user-defined Stack(Array).
	static long pop_Tableau (Pile_Tableau<Integer> _tableau) {
		long start = System.nanoTime ();
		while (! _tableau.isEmpty ()) _tableau.pop ();
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to pop [_num_itter] items from the user-defined Stack(LinkedList).
	static long pop_LLC (Pile_LLC _list) {
		long start = System.nanoTime ();
		while (! _list.isEmpty ()) _list.pop ();
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to pop [_num_itter] items from the java-defined Stack.
	static long pop_Stack (Stack<Integer> _stack) {
		long start = System.nanoTime ();
		while (! _stack.isEmpty ()) _stack.pop ();
		long end = System.nanoTime ();
		return end - start;
	}

	/**********************************/

	// calculate time spent to push and pop one item in the user-defined Stack(Array).
	static long push_pop_Tableau (Pile_Tableau<Integer> _tableau) {
		long start = System.nanoTime ();
		_tableau.push (0);
		_tableau.pop ();
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to push and pop one item in the user-defined Stack(LinkedList).
	static long push_pop_LLC (Pile_LLC<Integer> _list) {
		long start = System.nanoTime ();
		_list.push (0);
		_list.pop ();
		long end = System.nanoTime ();
		return end - start;
	}

	// calculate time spent to push and pop one item in the java-defined Stack.
	static long push_pop_Stack (Stack<Integer> _stack) {
		long start = System.nanoTime ();
		_stack.push (0);
		_stack.pop ();
		long end = System.nanoTime ();
		return end - start;
	}
}
