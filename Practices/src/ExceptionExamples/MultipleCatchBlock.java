package ExceptionExamples;
public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[2] = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs here");
		}
		System.out.println("outside of try catch block");
	}
}
