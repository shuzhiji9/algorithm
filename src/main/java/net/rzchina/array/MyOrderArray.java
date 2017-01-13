package net.rzchina.array;

/**
 * 有序数组
 * @author Administrator
 *
 */
public class MyOrderArray {
	private long [] arr;
	
	//表示有效数据的长度
	private int elements;
	
	public MyOrderArray() {
		arr = new long[50];
	}
	
	public MyOrderArray(int maxSize){
		arr = new long[maxSize];
	}
	
	/**
	 * 添加数据
	 */
	public void insert(long value){
		int i;
		for (i = 0; i < arr.length; i++) {
			if(arr[i] > value){
				break;
			}
		}
		for (int j = elements; j > i; j--) {
			arr[j] = arr[j - 1];
		}
		arr[i] = value;
		elements++;
	}
	
	/**
	 * 显示数据
	 */
	public void display(){
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	/**
	 * 查找数据
	 */
	public int search(long value){
		int i;
		for (i = 0; i < elements; i++) {
			if(value == arr[i]){
				break;
			}
		}
		if(i == elements){
			return -1;
		}else{
			return i;
		}
	}
	
	
	/**
	 * 二分法查找数据
	 */
	public int binarySearch(long value){
		int middle = 0;
		int low = 0;
		int pow = elements;
		while(true){
			// 取平均值
			middle = (pow+ low) / 2;
			if(arr[middle] == value){
				return middle;
			}else if(low > pow){
				return -1;
			}else{
				if(arr[middle] > value){
					pow = middle - 1;
				}else{
					low = middle + 1;
				}
			}
		}
	}
	
	/**
	 * 查找数据, 根据索引来查
	 * @param index
	 * @return
	 */
	public long get(int index){
		if(index >= elements || index < 0){
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[index];
	}
	
	/**
	 * 删除数据
	 */
	public void delete(int index){
		if(index >= elements || index < 0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			for (int i = 0; i < elements; i++) {
				arr[index] = arr[index + 1];
			}
			elements--;
		}
	}
	
	/**
	 * 
	 * @param index
	 * @param newvalue
	 */
	public void change(int index , int newvalue){
		if(index >= elements || index < 0){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			arr[index] = newvalue;
		}
	}
	
}
