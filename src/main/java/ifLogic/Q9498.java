package ifLogic;

import java.util.Scanner;

public class Q9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21.07.15 백준 9498 https://www.acmicpc.net/problem/9498

		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.


		Scanner s = new Scanner(System.in);
		
		int S = s.nextInt();
		
		if(90 <= S && S <= 100) {
			System.out.println("A");
		}else if(80 <= S && S < 90) {
			System.out.println("B");
		}else if(70 <= S && S < 80) {
			System.out.println("C");
		}else if(60 <= S && S < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
