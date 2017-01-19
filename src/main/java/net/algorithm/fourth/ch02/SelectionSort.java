package net.algorithm.fourth.ch02;

/**
 * 选择排序: 因为他再不断的选择剩余元素之中的最小者.
 * 	首先找到数组中最小的那个元素,其次,将它和数组的第一个元素交换位置.再次, 在剩下的元素中找到最小的元素,将它与数组的第二个元素狡猾位置,如此反复,直到将整个数组排序.
 * 特点:
 * 	运行时间和输入无关. (不管是否已经排序好了,都没有直接关系)
 * 	数据移动是最少的. ---- 交换次数和数组的大小是线性关系,排序用了N 次交换. (大部分的增长数量级都是线性对数或者是平方级别)
 * @author Administrator
 *
 */
public class SelectionSort extends Example{
	
	public static void sort(Comparable[] a){
		// 将 a[] 按照升序排列
		int N = a.length;  	///数组长度
		for (int i = 0; i < N; i++) {
			// 将a[i] 和 a[i+1..N] 中最小的元素交换
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if(less(a[j], a[min])){
					min = j;
				}
				exch(a, i, min);
			}
		}
	}
	
}
