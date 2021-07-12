package inOut;

import java.util.Scanner;

public class Q10998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 10998 https://www.acmicpc.net/problem/10998

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a <= 0 || b >= 10) {
			System.out.println("오류");
		}else {
			System.out.println(a*b);
		}
	}

}
