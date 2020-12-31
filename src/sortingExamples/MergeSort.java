package sortingExamples;

public class MergeSort {
	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		int[] inputArr = {50,10,30,20,40};
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i+" ");
		}
	}
	private void sort(int[] inputArr)  {
		this.array=inputArr;
		this.length= inputArr.length;
		this.tempMergeArr= new int[length];
	
		divideArray(0, length-1);			
	}
	
	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle = (higherIndex+lowerIndex)/2;
//			it will sort the left side of an array
			divideArray(lowerIndex, middle);
			
//			it will sort the right side of an array
			divideArray(middle+1, higherIndex);
			
			mergeArray(lowerIndex, middle, higherIndex);
		}

	}
	public void mergeArray(int lowerIndex,int middle, int higherIndex) {
		for(int i= lowerIndex;i<=higherIndex;i++) {
			tempMergeArr[i]= array[i]; // get values of array into tempMergeArr
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			}
			else {
				array[k] = tempMergeArr[j];
				j++;
				
			}//end of ef else
			k++;
		} // while ends here
		
		while(i<=middle) {
			array[k] = tempMergeArr[i];
			i++;
			k++;
		}
		
	}//mergeArray() ends here

}// class
