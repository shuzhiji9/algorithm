package net.algorithm.fourth.ch02;

import com.algs4.stdlib.Stopwatch;

public class SortCompare {
	public static double time(String alg,Comparable[] a){
		Stopwatch timer = new Stopwatch();
		if(alg.equals("Insertion")){
			InsertionSort.sort(a);
		}
		if(alg.equals("Selection")){
			SelectionSort.sort(a);
		}
		if(alg.equals("Selection")){
			ShellSort.sort(a);
		}
		if(alg.equals("Merger")){
			MergerSort.sort(a);
		}
		if(alg.equals("Quick")){
			QuickSort.sort(a);
		}
		if(alg.equals("Heap")){
			HeapSort.sort(a);
		}
		return timer.elapsedTime();
	}
	
	public static double timeRandomInput(String alg,int N,int T){
		double total = 0.0;
		Double [] a  = new Double[N];
		for (int t = 0; t < T; t++) {
		}
		return total;
	}
	
	
}
