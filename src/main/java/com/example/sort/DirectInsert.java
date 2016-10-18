package com.example.sort;

/**
 * 直接插入排序 基本思想：
 * 	在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排 好顺序的，
 *  现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
 * @author wangfei
 */
public class DirectInsert {
	
	public static synchronized void directInsert(int [] datas){
		int temp=0;
		for (int i = 1; i < datas.length; i++) {
			// 获取前一个数据的下标
			int j = i -1;
			// 将当前的数据赋值给临时变量
			temp = datas[i];
			for(;j >= 0 && temp < datas[j];j--){
				datas[j+1] = datas[j];		//将大于temp的值都整体后移一个单位
			}
			datas[j+1] = temp;
		}
	}
	
}
