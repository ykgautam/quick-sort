package ExceptionExamples;

public class JavaException {
	public static void main(String args[]) {
		try {
			int data = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("outside of try catch block");
	}
}
