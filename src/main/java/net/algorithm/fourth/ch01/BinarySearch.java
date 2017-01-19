package net.algorithm.fourth.ch01;

import java.util.Arrays;

import com.algs4.stdlib.In;
import com.algs4.stdlib.StdIn;
import com.algs4.stdlib.StdOut;

public class BinarySearch {
	public static int rank(int key,int [] a){
		// 数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			// 被查找的键要么不存在, 要么必然存在于 a[lo..hi]之中
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]){
				hi = mid + 1;
			}else if (key > a[mid]){
				lo = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			// 读取键值, 如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if(rank(key, whitelist) < 0){
				StdOut.println(key);
			}
		}
	}
	
}
