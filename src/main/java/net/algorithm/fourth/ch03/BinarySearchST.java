package net.algorithm.fourth.ch03;

import com.example.structure.Queue;

public class BinarySearchST<Key extends Comparable<Key>, Value> extends ST<Key, Value>{
	private Key[] keys;
	private Value[] vals;
	private int N;
	
	public BinarySearchST(int capacity) {
		//调整数组大小的标准代码请见算法 1.1 
		keys = (Key[]) new Comparable[capacity];
		vals = (Value[]) new Comparable[capacity];
	}
	
	public int size(){
		return N;
	}
	
	public Value get(Key key){
		if(isEmpty()) return null;
		int i = rank(key);
		if(i < N && keys[i].compareTo(key) == 0) return vals[i];
		else return null;
	}
	
	@Override
	int rank(Key key) {
		int lo = 0, hi = N -1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			int cmp = key.compareTo(keys[mid]);
			if(cmp < 0) hi = mid - 1;
			else if(cmp > 0) lo = mid + 1;
			else return mid;
		}
		return lo;
	}
	
	// 递归的二分查找
	public int rank(Key key,int lo,int hi) {
		if(hi < lo){
			return lo;
		}
		int mid = lo + (hi - lo) / 2;
		int cmp = key.compareTo(keys[mid]);
		if(cmp < 0){
			return rank(key,lo,mid - 1);
		}else if(cmp > 0 ){
			return rank(key, mid + 1,hi);
		}else {
			return mid;
		}
	}
	
	@Override
	public void put(Key key, Value val) {
		// 查找键,找到则更新值, 否则创建新的元素
		int i = rank(key);
		if(i < N && keys[i].compareTo(key) == 0){
			vals[i] = val; 
			return ;
		}
		for(int j = N;j > i;j--){
			keys[j] = keys[j - 1];
			vals[j] = vals[j - 1];
		}
		keys[i] = key;
		vals[i] = val;
		N++;
	}
	
	@Override
	public Key min() {
		return keys[0];
	}
	
	@Override
	public Key max() {
		return keys[N - 1];
	}
	
	@Override
	public Key select(int k) {
		return keys[k];
	}
	
	@Override
	Key ceiling(Key key) {
		int i = rank(key);
		return keys[i];
	}
	
	@Override
	Iterable<Key> keys(Key lo, Key hi) {
		return null;
		// 这个地方的实现还有一些问题. 但是可以借鉴
//		Queue<Key> q = new Queue<Key>();
//		for(int i = rank(lo);i < rank(hi);i++){
//			q.enqueue(keys[i]);
//		}
//		if(contains(hi)){
//			q.enqueue(keys[rank(hi)]);
//		}
//		return q;
	}
	
	
	
	
}
