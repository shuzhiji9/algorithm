package net.rzchina.sort.data;

/**
 * 链接点, 相当于车厢
 * @author Administrator
 *
 */
public class Node {
	
	// 数据域
	public long data;
	// 结点域 / 指针域
	public Node next;
	
	public Node(long value) {
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display(){
		System.out.print(data + " ");
	}
	
}
