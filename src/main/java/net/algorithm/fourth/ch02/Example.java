package net.algorithm.fourth.ch02;

import com.algs4.stdlib.StdOut;

public class Example {
	
	public static void sort(Comparable[] a){
		
	}
	
	protected static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	
	protected static void exch(Comparable [] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable [] a){
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable [] a){
		//测试数组元素是否有序
		for (int i = 0; i < a.length; i++) {
			if(less(a[i],a[i-1])){
				return false;
			}
		}
		return true;
	}
	
}
