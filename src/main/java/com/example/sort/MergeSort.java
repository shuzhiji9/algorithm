package com.example.sort;

/**
 * 归并排序
 * 基本排序：
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
 * @author Administrator
 *
 */
public class MergeSort {
	
	
	public static void mergeSort(int [] datas){
		mergeSort(datas,0,datas.length - 1);
	}

	private static void mergeSort(int[] datas, int left, int right) {
		if(left < right){
			// 找出中间索引
			int center = (left + right) /2;
			// 对左边的数组进行递归
			mergeSort(datas, left, center);
			// 对右边的数组进行递归
			mergeSort(datas, center + 1, right);
			// 合并
			merge(datas, left, center,right);
		}
	}

	// 合并
	private static void merge(int[] datas, int left, int center, int right) {
		int[] tmpArr = new int[datas.length];
		int mid = center + 1;
		// third 记录中间数组的索引
		int third = left;
		int tmp = left;
		while(left <= center && mid <= right){
			// 从两个数组中去除最小的放入中间数组
			if(datas[left] <= datas[mid]){
				tmpArr[third++] = datas[left++];
			}else{
				tmpArr[third++] = datas[mid++];
			}
		}
		// 剩余部分依次放入中间数组
		while(mid <= right){
			tmpArr[third++] = datas[mid++];
		}
		while(left <= center){
			tmpArr[third++] = datas[left++];
		}
		//将中间数组中的内容复制回原数组
		while(tmp <= right){
			datas[tmp] = tmpArr[tmp++];
		}
	}
	
}
