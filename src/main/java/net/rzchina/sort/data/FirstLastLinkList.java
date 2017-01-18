package net.rzchina.sort.data;

/**
 * 双端链表
 * 	从头部插入: 必须要对链表进行判断, 如果为空则设置尾节点为新添加的结点
 * 	从尾部插入: 如果链表为空, 则直接设置头结点为新添加的结点, 否则设置尾节点的后一个节点为新添加节点
 *  从头部删除: 判断头结点是否有一个节点,如果没有则设置为节点为 null 
 *  @author Administrator
 *
 */
public class FirstLastLinkList {
	// 头结点
	private Node first;

	// 尾节点
	private Node last;
	
	public FirstLastLinkList() {
		first = null;
		last = null;
	}

	/**
	 * 插入一个节点, 在头结点之后插入
	 */
	public void insertFirst(long value) {
		Node node = new Node(value);
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
		Node node = new Node(value);
		if(isEmpty()){
			first = node;
		} else {
			last.next = node;
		}
		last = node;
	}
	
	/**
	 * 删除一个节点, 在头结点后进行删除
	 */
	public Node deleteFirst() {
		Node tmp = first;
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
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * 查找方法
	 */
	public Node find(long value) {
		Node current = first;
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
	public Node delete(long value) {
		Node current = first;
		Node prev = first;
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
