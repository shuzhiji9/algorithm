package net.rzchina.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class BubbleSort {
	
	public  static void sort(long[] arr){
		long tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if(arr[j] < arr[j - 1]){
					// 进行交换
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 34;
		arr[1] = 332;
		arr[2] = 321;
		arr[3] = 34214;
		arr[4] = 3124;
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
