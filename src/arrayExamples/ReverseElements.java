package arrayExamples;
import java.util.Stack;

public class ReverseElements {
	
	public static void main(String[] args) {
		int[]  array = { 1, 3, 5 };
		ReverseElements revObj= new ReverseElements();
		revObj.reverse(array);
	}

	final void reverse(int[] array) {
		Stack stack = new Stack();
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		System.out.println("elements of array in Reverse order are ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) stack.pop();
			System.out.println(array[i]);
		}
	}
}
