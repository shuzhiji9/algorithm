package net.algorithm.fourth.ch02;

/**
 * 希尔排序: 基于插入排序的排序算法
 * 	对于大规模乱序数组插入排序很慢,因为它只会交换相邻的元素.
 * 	希尔排序比插入排序和选择排序要快的多, 并且数组越大,优势越大
 * @author Administrator
 *
 */
public class ShellSort extends Example {

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while(h < N/3){
			h  =  3 * h + 1;
		}
		while(h >= 1){
			//将数组变为 h 有序
			for(int i = h;i < N;i++){
				// 将 a[i] 插入到 a[i-h],a[i-2*h],a[i-3*h]...之中
				for(int j = i;j >= h && less(a[j],a[j-h]);j -=h){
					exch(a, j, j -h);
				}
				h = h /3;
			}
		}
	}

}
