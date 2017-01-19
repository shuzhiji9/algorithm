package net.algorithm.fourth.ch02;

public class Date implements Comparable<Date>{
	
	private final int day;
	private final int month;
	private final int year;
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int compareTo(Date that) {
		if(this.year > that.year){
			return 1;
		}
		if(this.year < that.year){
			return -1;
		}
		
		if(this.month > that.month){
			return 1;
		}
		if(this.month < that.month){
			return -1;
		}
		if(this.day > that.day){
			return 1;
		}
		if(this.day < that.day){
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

}
