package com.example.structure;

/**
 * 构建二叉树
 * 	插入的复杂度本身并不高，只是简单的节点添加。
 * 	但是因为寻找插入位置的查找操作的复杂度跟树的高度相关为logn,
 * 	极差的情况下可能接近于线性查找。
 * 	** 平衡二叉树, 算法中增加了左旋和右旋的操作,插入复杂度会高一些,但是会得到不错的查找性能
 * @author wangfei
 */
public class BinaryTreeNode {
	
	int value;
	BinaryTreeNode left; 	//左节点
	BinaryTreeNode right;	//右节点
	public BinaryTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * 插入元素
	 * @param value
	 */
	public void add(int value){
		if(value > this.value){
			if(this.right != null){
				this.right.add(value);
			}else{
				this.right = new BinaryTreeNode(value);
			}
		}else{
			if(this.left != null){
				this.left.add(value);
			}else{
				this.left = new BinaryTreeNode(value);
			}
		}
	}
	
	/**
	 * 中序查找
	 * @param value
	 * @return
	 */
	public BinaryTreeNode get(int value){
		if(this.value == value){
			return this;
		}
		if(this.value > value){
			return this.left.get(value);
		}
		if(this.value < value){
			return this.right.get(value);
		}
		return null;
	}
	
}
