package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] data = {2,5,3,9,4,7};
		new InsertionSort().sort(data);
		System.out.println(Arrays.toString(data));	
	}

	public void sort(int[] data) {
		for (int x =1; x< data.length; x++) {
			int j = x-1;
			int i = x;
			while (j >= 0 && data[i] < data[j]){
				Utils.swapArr(data, i, j);
				i--;
				j--;
			}
		}
	}
}
