package com.example.sort;

/**
 * 冒泡排序
 * 基本思想：
 * 	在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * @author Administrator
 *
 */
public class BubbleSort {
	
	public static void bubbleSort(int[] datas){
		for (int i = 0; i < datas.length; i++) {
			for (int j = 0; j < datas.length - 1 -i; j++) {
				if(datas[i] > datas[j + 1]){
					DataUtils.swap(datas, j, j + 1);
				}
			}
		}
	}
	
}
