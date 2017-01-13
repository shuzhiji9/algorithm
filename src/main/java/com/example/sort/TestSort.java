package com.example.sort;

public class TestSort {
	public static void main(String[] args) {
//		int[] datas = DataUtils.getIntArray(25);
//		DataUtils.printIntArr(datas);
		int[] datas = {3,13,57,7,9,33,58,25};
		long start = System.currentTimeMillis();
		// 直接插入排序
//		DirectInsert.directInsert(datas);
		// 希尔排序
//		ShellSort.shellSort(datas);
		// 简单选择排序
		SimpleSelectSort.simpleSelectSort(datas);
		// 堆排序
//		HeapSort.heapSort(datas);
		// 冒泡排序
//		BubbleSort.bubbleSort(datas);
		// 快速排序
//		QuickSort.quickSort(datas);
		// 合并排序
//		MergeSort.mergeSort(datas);
		// 基数排序
//		RadixSort.radixSort(datas);
//		System.out.println("排序时间为: " + (System.currentTimeMillis() - start));
		DataUtils.printIntArr(datas);
	}
}
