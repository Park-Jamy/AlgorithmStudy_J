package inOut;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 2588 https://www.acmicpc.net/problem/2588.

		Scanner s = new Scanner(System.in);
		
		int B = s.nextInt();
		int A = s.nextInt();
		
		int a1 = (A/100)*B; 
		int a2 = ((A/10)*B) - (10*a1); 
		int a3 = A*B - (10*a2) - (100*a1);
		
		System.out.println(a3);
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(A*B);
	}

}
