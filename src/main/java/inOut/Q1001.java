package inOut;

import java.util.Scanner;

public class Q1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 1001 https://www.acmicpc.net/problem/1001

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a <= 0 || b >= 10) {
			System.out.println("오류");
		}else {
			System.out.println(a-b);
		}
	}

}
//(0 < A, B < 10)