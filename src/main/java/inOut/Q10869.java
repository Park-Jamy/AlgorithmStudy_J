package inOut;

import java.util.Scanner;

public class Q10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 10869 https://www.acmicpc.net/problem/10869

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a < 1 || b > 10000) {
			System.out.println("오류");
		}else {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
	}

}
