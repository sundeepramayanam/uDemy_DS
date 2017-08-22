package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = {2,5,3,9,4,7};
		new BubbleSort().sort(data);
		System.out.println(Arrays.toString(data));		
	}
	
	public void sort(int[] data) {
		int temp;
		
		for (int i=0; i< data.length; i++) {
			for(int j=0; j< data.length-1; j++) {
				if(data[j] > data [j+1]) {
					temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
	}

}
