package com.example.structure;

/**
 * 栈（Stack） 
 * @author wangfei
 */
public class Stack {
	
	ListNode top;
	
	public ListNode peek(){
		if(top != null){
			return top;
		}
		return null;
	}
	
	public ListNode pop(){
		if(top == null){
			return null;
		}else{
			ListNode temp = new ListNode(top.value);
			top = top.next;
			return temp;
		}
	}
	
	public void push(ListNode n){
		if(n != null){
			n.next = top;
			top = n;
		}
	}
}
