package com.example.sort;

/**
 * 快速排序
 * 	基本思想：
 * 	选择一个基准元素,通常选择第一个元素或者最后一个元素,
 * 	通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 	此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 * @author Administrator
 *
 */
public class QuickSort {
	
	public static void quickSort(int [] datas){
		if(datas.length > 0){
			quickSort(datas,0,datas.length -1);
		}
	}

	public static void quickSort(int[] datas, int low, int high) {
		if(low < high){
			int middle = getMiddle(datas,low,high); // 将datas 数组进行一分为二
			quickSort(datas, low, middle -1); //　对低字段进行递归排序
			quickSort(datas, middle + 1, high); //　对高字段进行递归排序
		}
	}

	public static int getMiddle(int[] datas, int low, int high) {
		int tmp = datas[low]; // 将数组的第一个作为中轴
		while(low < high){
			while(low < high && datas[high] >= tmp){
				high--;
			}
			datas[low] = datas[high]; // 比中轴大的记录移到低端
			while(low < high && datas[low] <= tmp){
				low++;
			}
			datas[high] = datas[low]; // 比中轴大的记录移到高端
		}
		datas[low] = tmp; //中轴记录到尾
		return low;
	}
	
}
