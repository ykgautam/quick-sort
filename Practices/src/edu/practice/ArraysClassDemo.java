package edu.practice;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int[] array = {4,1,2,3,5,7,6};
System.out.println("before sorting array ");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println("\n aftr sorting array ");
		Arrays.sort(array);	
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(array, 4));
		
		
		
	}

}
