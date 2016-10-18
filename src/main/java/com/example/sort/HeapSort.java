package com.example.sort;


/**
 * 堆排序
 * 基本思想：堆排序是一种树形选择排序，是对直接选择排序的有效改进。
 * 堆的定义如下：
 * 具有n个元素的序列（h1,h2,...,hn), 
 * 当且仅当满足（hi>=h2i,hi>=2i+1）或（hi<=h2i,hi<=2i+1）(i=1,2,...,n/2)时称 之为堆。
 * 在这里只讨论满足前者条件的堆。由堆的定义可以看出，
 * 堆顶元素（即第一个元素）必为最大项（大顶堆）。
 * 完全二叉树可以很直观地表示堆的结构。堆顶 为根，其它为左子树、右子树。初始时把要排序的数的序列看作是一棵顺序存储的二叉树，调整它们的存储序，使之成为一个堆，这时堆的根节点的数最大。
 * 然后将 根节点与堆的最后一个节点交换。然后对前面(n-1)个数重新调整使之成为堆。依此类推，直到只有两个节点的堆，并对它们作交换，最后得到有n个节点的有 序序列。
 * 从算法描述来看，堆排序需要两个过程，一是建立堆，二是堆顶与堆的最后一个元素交换位置。所以堆排序有两个函数组成。一是建堆的渗透函数，二是反 复调用渗透函数实现排序的函数。
 * @author wangfei
 *
 */
public class HeapSort {
	
	public static void heapSort(int[] datas){
		int len = datas.length;
		// 循环建堆
		for (int i = 0; i < len; i++) {
			// 建堆
			buildMaxHeap(datas,len  -1 -i);
			// 交换堆顶和最后一个元素
			DataUtils.swap(datas,0,len -1 -i);
		}
	}
	
	//对 datas 数组从0 到 len 建堆
	private static void buildMaxHeap(int[] datas, int len) {
		// 从 len 处节点(最后一个节点) 的父节点开始
		for (int i = (len - 1) /2; i >= 0; i--) {
			// k 保存正在判断的节点
			int k = i;
			//如果当前 k 节点的子节点存在
			while(k * 2 + 1 <= len){
				// k 节点的左子结点的索引
				int biggerIndex = 2 * k + 1;
				// 如果 biggerIndex 小于 len,即 biggerIndex+1 代表的k 节点的右子节点存在
				if(biggerIndex < len){
					// 如果右子节点的值比较大
					if(datas[biggerIndex] < datas[biggerIndex + 1]){
						// biggerIndex 总是记录较大子节点的索引
						biggerIndex ++;
					}
				}
				// 如果 k 节点的值小于其较大的子节点的值
				if(datas[k] < datas[biggerIndex]){
					// 交换他们
					DataUtils.swap(datas, k, biggerIndex);
					// 将 biggerIndex 赋予k, 开始while 循环的下一次循环. 重新保证 k 节点的值大于其左右子节点的值
					k = biggerIndex;
				}else{
					break;
				}
			}
			
		}
	}


}
