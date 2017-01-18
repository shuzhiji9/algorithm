package net.rzchina.sort.data;

/**
 * 链表, 相当于火车
 * @author Administrator
 */
public class LinkList {
	// 头结点
	private Node first;
	
	public LinkList() {
		first = null;
	}
	
	/**
	 * 插入一个节点, 在头结点之后插入
	 */
	public void insertFirst(long value){
		Node node = new Node(value);
		node.next = first;
		first = node;
	}
	
	/**
	 * 删除一个节点, 在头结点后进行删除
	 */
	public Node deleteFirst(){
		Node tmp = first;
		// 相当于把要删除的数据跳过去. 然后让 GC 回收
		first = tmp.next;
		return tmp;
	}
	
	/**
	 * 显示方法
	 */
	public void display(){
		Node current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	
	/**
	 * 查找方法
	 */
	public Node find(long value){
		Node current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current = current.next;
		}
		return current;
	}
	
	/**
	 * 删除方法, 根据数据域来进行删除
	 */
	public Node delete(long value){
		Node current = first;
		Node prev = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			prev = current;
			current = current.next;
		}
		if(current == first){
			first = first.next;
		}else{
			prev.next = current.next;
		}
		return current;
	}
	
}
