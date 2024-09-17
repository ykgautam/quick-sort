package edu.practice.algos.sort.impl;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4 };
		MergeSort obj = new MergeSort();
		obj.mergeSort(arr, 0, 3);
	}
	int[] mergeSort(int[] arr, int s, int e) {
		if (arr.length == 1)
			return arr;
		else {		
		int m = (s + e) / 2;
		System.out.println("hii "+ e + " " + arr.length);
		int[] a = mergeSort(arr, s, m);
		int[] b = mergeSort(arr, m + 1, e);
		
		int[] c = merge(a, b);
		return c;
		}
	}

	private int[] merge(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int[] r = new int[a.length + b.length];
		while (i != a.length && j != b.length) {
			if (a[i] < b[j]) {
				r[k] = a[i];
				i++;
				k++;
			} else if (a[i] == b[j]) {
				r[k] = a[i];
				i++;
				j++;
				k++;
			} else if (a[i] > b[j]) {
				r[k] = b[j];
				j++;
				k++;
			}
		}
		if (i < a.length) {
			while (i != a.length) {
				r[k] = a[i];
				i++;
				k++;
			}
		} else if (j < b.length) {
			while (j != b.length) {
				r[k] = b[j];
				j++;
				k++;
			}
		}
		return r;
	}
		
}

