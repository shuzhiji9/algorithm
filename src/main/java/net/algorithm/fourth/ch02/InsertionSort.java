package net.algorithm.fourth.ch02;

/**
 * 插入排序: 
 * 	为了要给插入的元素腾出空间, 我们需要将其余所有元素在插入之前都向右移动一位.这种算法叫做插入排序.
 * 	与选择排序一样,当前索引左边的元素都是有序的,但他们的最终位置还不确定,为了给更小的元素腾出空间,他们可能会被移动,但是当索引到达数组的右端时,数组排序就完成了
 * 	和选择排序不同的是,插入排序所需的时间取决于输入中元素的初始顺序.
 * @author Administrator
 *
 */
public class InsertionSort extends Example{
	
	public static void sort(Comparable[] a){
		//将 a[] 按升序排序
		int N = a.length;
		for (int i = 1; i < N; i++) {
			// 将 a[i] 插入到 a[i-1]、a[i-2]、...之中
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exch(a, j, j -1 );
			}
		}
	}
	
}
