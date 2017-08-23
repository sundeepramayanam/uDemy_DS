package sort;

import java.util.Arrays;

public class Utils {

	public static void displayIntArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void displayCharArr(char[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static int[] swapArr(int[] data, int left, int right) {
		int temp = data[right];
		data[right] = data [left];
		data[left] = temp;
		return null;
	}

}
