/**
 * 
 */
package edu.practice.datastructure.linearsearch;

/**
 * @author yash
 *
 */
public class LinearSearchImplementation implements LinearSearch {

	public int searchElementIndex(int[] arr, int key) {
		int length = arr.length;
		for (int index = 0; index < length; index++) {
			if (arr[index] == key)
				return index;
		}
		return -1;

	}

}