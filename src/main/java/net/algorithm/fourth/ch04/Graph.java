package net.algorithm.fourth.ch04;

import com.algs4.stdlib.In;

/**
 * 图的几种表示方法: (它必须为可能在应用中碰到得各种类型的图预留出足够的空间/Graph 的实例方法的实现一定要快 --- 他们是开发处理图的各种用例的基础)
 *  邻接矩阵: 我们可以使用一个 V 乘以 V 的布尔矩阵. 
 *  边的数组: 我们可以使用一个 Edge 类,它含有两个int 实例变量.
 *  邻接表数组: 我们可以用一个顶点为索引的列表数组,其中每个元素都是和该顶点相邻的顶点列表.
 * 
 * @author Administrator
 *
 */
public class Graph {
	
	//创建一个含有V 个顶点但不含有边的图
	public Graph(int V) {
		
	}
	
	// 从标准流 in 读入一幅图 
	public Graph(In in) {
	}
	
	// 顶点数
	int V(){
		return 0;
	}
	
	// 边数
	int E(){
		return 0;
	}
	
	// 向图中添加一条边 v-w
	void addEdge(int v,int w){
		
	}
	
	//和 v 相邻的所有顶点
	Iterable<Integer> adj(int v){
		return null;
	}
	
	// 计算 v 的度数
	public static int degree(Graph G,int v){
		int degree = 0;
		for(int w : G.adj(v)){
			degree++;
		}
		return degree;
	}
	
	// 计算所有顶点的最大度数
	public static int maxDegree(Graph G){
		int max = 0;
		for(int v = 0;v < G.V();v++){
			if(degree(G, v) > max){
				max = degree(G, v);
			}
		}
		return max;
	}
	
	//计算所有顶点的平均度数
	public static double avgDegree(Graph G){
		return 2 * G.E() / G.V();
	}
	
	// 计算自环的个数
	public static int numberOfSelfLoops(Graph G){
		int count = 0;
		for (int v = 0; v < G.V() ; v++) {
			for(int w : G.adj(v)){
				if(v == w){
					count++;
				}
			}
		}
		return count / 2;
	}

	// 对象的字符串表示
	@Override
	public String toString() {
		String s = V() + "vertices, " + E() + "edges\n";
		for(int v = 0; v < V();v++){
			s += v + ": ";
			for(int w : this.adj(v)){
				s += w + " ";
			}
			s += "\n";
		}
		return s;
	}
	
}
