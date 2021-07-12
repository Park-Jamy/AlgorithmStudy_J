package inOut;

import java.util.Scanner;

public class Q10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.12 백준 10430 https://www.acmicpc.net/problem/10430
		
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
	}

}
//2 ≤ A, B, C ≤ 10000)  첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

