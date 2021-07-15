package ifLogic;

import java.util.Scanner;

public class Q14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.15 백준 14681 https://www.acmicpc.net/problem/14681

		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if( 0 < A && 0 < B) {
			System.out.println(1);
		}else if( 0 > A && 0 < B) {
			System.out.println(2);
		}else if( 0 > A && 0 > B) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}

}
