package com.example.sort;

/**
 * 简单选择排序
 * 基本思想：
 * 在要排序的一组数中，
 * 选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，
 * 如此循环到倒数第二个数和最后一个数比较为止。
 * @author wangfei
 *
 */
public class SimpleSelectSort {

	public static void simpleSelectSort(int[] datas){
		int position = 0;
		for (int i = 0; i < datas.length; i++) {
			int j = i + 1;
			position = i;
			int temp = datas[i];
			for(;j < datas.length;j++){
				if(datas[j] < temp){
					temp = datas[j];
					position = j;
				}
			}
			datas[position] = datas[i];
			datas[i] = temp;
		}
	}
	
}
