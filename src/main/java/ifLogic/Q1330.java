package ifLogic;

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.15 백준 1330 https://www.acmicpc.net/problem/1330
		
		//-10,000 ≤ A, B ≤ 10,000
		
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
