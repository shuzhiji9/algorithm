package com.example.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 模拟获取一些数据
 * @author Administrator
 *
 */
public class DataUtils {
	
	/**
	 * 获取一个有数据的数据
	 * @param count
	 * @return
	 */
	public static int[] getIntArray(int count){
		int [] datas = new int[count];
		Random r = new Random();
		for (int i = 0; i < datas.length; i++) {
			int data = r.nextInt(500);
			datas[i] = data;
		}
		return datas;
	}
	
	/**
	 * 打印int 数组
	 * @param datas
	 */
	public static void printIntArr(int[] datas){
//		System.out.print("[");
//		for (int i = 0; i < datas.length; i++) {
//			System.out.print(datas[i] + ",");
//		}
//		System.out.print("]");
//		System.out.println();
		System.out.println(Arrays.toString(datas));
	}
	
	// 交换元素
	public static void swap(int[] datas, int i, int j) {
		int temp = datas[i];
		datas[i] = datas[j];
		datas[j] = temp;
	}
}
