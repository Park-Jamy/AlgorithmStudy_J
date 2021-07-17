package forLOgic;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.17 백준 2739 https://www.acmicpc.net/problem/2739
		
		Scanner s = new Scanner(System.in);
			
		int N = s.nextInt();
		
		for(int i = 1; i < 10; i++) {
			int A = 0;
			A = N*i;
			System.out.println(N + " * " + i + " = " +  A);
		}
	}

}
