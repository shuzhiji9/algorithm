package com.example.sort;

/**
 * 希尔排序
 * 基本思想：算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，每组中记录的下标相差d.
 * 对每组中全部元素进行直接插入排序，然后再用一个较小的增量（d/2）对它进行分组，
 * 在每组中再进行直接插入排序。当增量减到1时，进行直接插入排序后，排序完成。
 * @author Administrator
 *
 */
public class ShellSort {
	
	public static void shellSort(int [] datas){
		double len = datas.length;
		int temp = 0;
		while(true){
			len= Math.ceil(len/2);
			int length = (int) len;
			for(int x = 0;x < length;x++){
				for(int i = x + length;i < datas.length;i += length){
					int j = i - length;
					temp = datas[i];
					for(;j >= 0 && temp < datas[j];j -= length){
						datas[j+length] = datas[j];
					}
					datas[j + length] = temp;
				}
			}
			if(length == 1){
				break;
			}
		}
	}
	
}
