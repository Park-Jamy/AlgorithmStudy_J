package inOut;

import java.util.Scanner;

public class Q1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 1008 https://www.acmicpc.net/problem/1008
		Scanner s = new Scanner(System.in);
		
		double a = s.nextInt();
		double b = s.nextInt();
		
		if(a <= 0 || b >= 10) {
			System.out.println("오류");
		}else {
			System.out.println(a/b);
		}
	}


}