package net.algorithm.fourth.ch04;

import java.util.Stack;

/**
 * 深度优先路径计算
 * @author Administrator
 *
 */
public class DepthFirstPaths {
	
	private boolean[] marked;
	private int[] edgoTo;
	private final int s;
	
	public DepthFirstPaths(Graph G,int s){
		marked = new boolean[G.V()];
		edgoTo = new int[G.V()];
		this.s = s;
		dfs(G,s);
	}

	private void dfs(Graph G, int v) {
		marked[v] = true;
		for(int w: G.adj(v)){
			if(!marked[w]){
				edgoTo[w] = v;
				dfs(G, w);
			}
		}
	}
	
	public boolean hasPathTo(int v){
		return marked[v];
	}
	
	public Iterable<Integer> pathTo(int v){
		if(!hasPathTo(v)){
			return null;
		}
		Stack<Integer> path = new Stack<Integer>();
		for(int x = v;x != s;x = edgoTo[x]){
			path.push(s);
		}
		return path;
	}
	
	
	
	
}
