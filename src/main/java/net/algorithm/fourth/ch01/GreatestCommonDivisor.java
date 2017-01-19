package net.algorithm.fourth.ch01;

/**
 * 最大公约数求解
 * 	计算两个非负整数p 和 q 的最大公约数:
 * 		若q 是0,则最大公约数为 p. 否则,将p 除以 q 得到余数r,
 * 		p和q的最大公约数即为q和r的最大公约数
 * @author Administrator
 *
 */
public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		int gcd = gcd(15, 20);
		System.out.println(gcd);
	}
	
	/**
	 * 求解最大公约数
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p,int q){
		if (q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q,r);
	}
	
}
