package com.example.structure;

/**
 * 队列（Queue）
 * @author wangfei
 */
public class Queue {
	
	ListNode first,last;
	
	public void enqueue(ListNode n){
		if(first ==null){
			first = n;
			last = first;
		}else{
			last.next = n;
			last = n;
		}
	}
	
	public ListNode dequeue(){
		if(first == null){
			return null;
		}else{
			ListNode temp = new ListNode(first.value);
			first = first.next;
			return temp;
		}
	}
	
}
