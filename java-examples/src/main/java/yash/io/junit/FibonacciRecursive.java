package yash.io.junit;

import java.util.ArrayList;

public class FibonacciRecursive {
	static int firstNumber = 0, secondNumber = 1, sum;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	FibonacciRecursive obj = new FibonacciRecursive();;

	static ArrayList<Integer> fibonacciSeries(int number) {
		if (firstNumber == 0 && secondNumber == 1) {
			list.add(firstNumber);
			list.add(secondNumber);
		}
		if (number >= 1) {
			sum = firstNumber + secondNumber;
			list.add(sum);
			firstNumber = secondNumber;
			secondNumber = sum;
			fibonacciSeries(number - 1);
		}
		return list;
	}

	public static void main(String[] args) {
		FibonacciRecursive.fibonacciSeries(6);
	}

	static int fibonacciSum(int digit) {
		int f[] = new int[30];
		for (int counter = 1; counter < f.length; counter++) {
			f[counter] = -1;
		}

		if (f[digit] < 0) {
			if (digit == 1 || digit == 2)
				f[digit] = 1;
			else
				f[digit] = fibonacciSum(digit - 1) + fibonacciSum(digit - 2);
		}
		return f[digit];
	}

}
