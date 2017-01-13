package com.example.sort;

/**
 * 直接插入排序 基本思想：
 * 	在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排 好顺序的，
 *  现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
 * @author wangfei
 */
public class DirectInsert {
	
	public static void main(String[] args) {
		int[] datas = DataUtils.getIntArray(10);
		insert(datas);
		DataUtils.printIntArr(datas);
	}
	
	public static void directInsert(int [] datas){
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
			DataUtils.printIntArr(datas);
		}
	}
	
	/**
	 * 算法导论版本的插入排序
	 *  分析过程: {31,41,59,26,41,58}
	 *  	
	 * @param datas
	 */
	public  static void insert(int [] datas){
		int key = 0;
		for(int j = 1;j < datas.length;j++){
			key = datas[j];
			int i = j - 1;
			while(i >= 0 && datas[i] > key){
				datas[i + 1] = datas[i];
				i= i - 1;
			}
			datas[i + 1] = key;
//			DataUtils.printIntArr(datas);
		}
	}
	
}
