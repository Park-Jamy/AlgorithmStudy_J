package forLOgic;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.17 백준 8393  https://www.acmicpc.net/problem/8393 
		
		
		
		Scanner s = new Scanner(System.in);
			
		int N = s.nextInt();
		
		for(int i = N-1; i > 0; i--) {
			N += i;
		}
		
		System.out.println(N);
	}

}
