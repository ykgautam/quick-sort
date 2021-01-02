package arrayExamples;

public class ArrayCopy {
	void copyArray(int[] n1) {
		int[] n2= new int[n1.length];
		System.arraycopy(n1, 0, n2, 0, 2);
//		n2[0]=111;
		System.out.println("elements of array n2 are ");
		for (int i : n2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayCopy obj= new ArrayCopy();
		int[] array= {10,20,30,40,50};
		
		int[] array2=array;   //assigning array to another array 
		System.out.println("elements of array2 by assigning are ");
		for (int i : array2) {
			System.out.println(i);			
		}
//		another way to copy 1 array elements to another using copyArray
		obj.copyArray(array);
	}
}
