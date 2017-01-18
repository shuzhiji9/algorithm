package net.rzchina.sort.data;

/**
 * 双向链表: 每一个节点除了保存对下一个节点的引用, 还保存对上一个节点的引用
 *  @author Administrator
 *
 */
public class DoubleLinkList {
	// 头结点
	private DoubleNode first;

	// 尾节点
	private DoubleNode last;
	
	public DoubleLinkList() {
		first = null;
		last = null;
	}

	/**
	 * 插入一个节点, 在头结点之后插入
	 */
	public void insertFirst(long value) {
		DoubleNode node = new DoubleNode(value);
		if(isEmpty()){
			last = node;
		}
		node.next = first;
		first = node;
	}
	
	/**
	 * 插入一个节点, 从尾节点进行插入
	 */
	public void insertLast(long value){
		DoubleNode node = new DoubleNode(value);
		if(isEmpty()){
			first = node;
		} else {
			first.prev = node;
		}
		node.next = first;
		last = node;
	}
	
	/**
	 * 删除一个节点, 在头结点后进行删除
	 */
	public DoubleNode deleteFirst() {
		DoubleNode tmp = first;
		if(first.next == null){
			last = null;
		}
		// 相当于把要删除的数据跳过去. 然后让 GC 回收
		first = tmp.next;
		return tmp;
	}

	/**
	 * 显示方法
	 */
	public void display() {
		DoubleNode current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * 查找方法
	 */
	public DoubleNode find(long value) {
		DoubleNode current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * 删除方法, 根据数据域来进行删除
	 */
	public DoubleNode delete(long value) {
		DoubleNode current = first;
		DoubleNode prev = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			prev = current;
			current = current.next;
		}
		if (current == first) {
			first = first.next;
		} else {
			prev.next = current.next;
		}
		return current;
	}
	
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty(){
		return (first == null);
	}

}
