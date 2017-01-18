package net.rzchina.sort;

/**
 * 选择排序
 *  双层循环. 用来比对计算
 * @author Administrator
 *
 */
public class SelectionSort {

	public static void sort(long[] arr){
		int k = 0;
		long tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			k = i;
			for (int j = i; j < arr.length - 1; j++) {
				if(arr[j] > arr[k]){
					k = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
	}
	
}
