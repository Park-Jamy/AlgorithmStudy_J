package ifLogic;

import java.util.Scanner;

public class Q2853 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.15 백준 2853 https://www.acmicpc.net/problem/2853

		Scanner s = new Scanner(System.in);
		
		int S = s.nextInt();
		
		if((S%4 == 0 && S%100 != 0) || S%400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
//	연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//	윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//	예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.


}
