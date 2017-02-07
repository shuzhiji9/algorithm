package net.algorithm.fourth.ch03;

public class ST<Key extends Comparable<Key>,Value> {
	public ST() {
	}
	
	// 将键值对存入表中
	void put(Key key,Value val){
	}
	
	// 获取键 key 对应的值
	Value get(Key key){
		return null;
	}
	
	// 从表中删去键key
	void delete(Key key){
		put(key, null);
	}

	//键 key 在表中是否有对应的值
	boolean contains(Key key){
		return get(key) != null;
	}
	
	// 表是否为空
	boolean isEmpty(){
		return size() == 0;
	}
	
	// 表中的键值对数量
	int size(){
		return 0;
	}
	
	// 最小的键
	Key min(){
		return null;
	}
	
	// 最大的键
	Key max(){
		return null;
	}
	
	// 小于等于 key 的最大值
	Key floor(Key key){
		return null;
	}
	
	// 大于等于key 的最小值
	Key ceiling(Key key){
		return null;
	}
	
	// 小于 key 的键的数量
	int rank(Key key){
		return 0;
	}
	
	// 排名为 k 的键
	Key select(int k){
		return null;
	}
	
	// 删除最小的键
	void deleteMin(){
		delete(min());
	}
	
	// 删除最大的键
	void deleteMax(){
		delete(max());
	}
	
	// [lo...hi] 之间键值的数量
	int size(Key lo, Key hi){
		if(hi.compareTo(lo) < 0){
			return 0;
		}else if(contains(hi)){
			return rank(hi) - rank(lo) + 1;
		}else{
			return  rank(hi) - rank(lo);
		}
	}
	
	// [lo...hi] 之间的所有键, 已排序
	Iterable<Key> keys(Key lo,Key hi){
		return null;
	}
	
	// 表中的所有键的集合
	Iterable<Key> keys(){
		return keys(min(),max());
	}
	
	
	
	
}
