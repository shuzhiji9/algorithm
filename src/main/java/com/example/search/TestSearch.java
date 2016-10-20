package com.example.search;

import com.example.sort.DataUtils;
import com.example.sort.HeapSort;

public class TestSearch {
	
	public static void main(String[] args) {
		int[] datas = DataUtils.getIntArray(100);
		HeapSort.heapSort(datas);
		DataUtils.printIntArr(datas);
		int data = BinarySearch.binarySearch(datas, datas[3]);
		System.out.println(data);
		
	}
	
}
