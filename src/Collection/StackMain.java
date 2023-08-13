package Collection;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Worker> stack = new Stack<>();
		stack.push(new Worker("Anzar", 20, 25000));
		stack.push(new Worker("Anzar", 23, 25000));
		stack.push(new Worker(null, 0, 0));
		stack.push(new Worker("Abuzar", 20, 35000));

		for (Worker worker : stack) {
			System.out.println(worker);
		}
	}
}
