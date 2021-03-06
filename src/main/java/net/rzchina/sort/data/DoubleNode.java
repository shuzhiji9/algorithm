package net.rzchina.sort.data;

/**
 * 链接点, 双向列表的结点 相当于车厢
 * @author Administrator
 *
 */
public class DoubleNode {
	
	// 数据域
	public long data;
	// 结点域 / 指针域
	public DoubleNode next;
	// 结点域 / 指针域
	public DoubleNode prev;
	
	public DoubleNode(long value) {
		this.data = value;
	}
	
	/**
	 * 显示方法
	 */
	public void display(){
		System.out.print(data + " ");
	}
	
}
