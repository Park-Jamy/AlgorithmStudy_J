package Q0809_0815;

import java.io.*;
import java.util.*;
//21.08.11 백준 2581 https://www.acmicpc.net/problem/2581

public class Q2581 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int MIN = Integer.parseInt(br.readLine());
		int MAX = Integer.parseInt(br.readLine());

		ArrayList<Integer> li = new ArrayList<>();

		
		int c = 0;
		for(int i = MIN; i < MAX + 1; i++) {
			int chk = 0;
			if(i != 1) {
				for(int j = 2; j < i; j++) {
					if(i%j == 0) {
						chk = 1;
						break;
					}
				}
			}else {
				chk = 1;
			}
			if(chk == 0) li.add(i);
		}
		
		
		if(li.size() == 0) {
			bw.write(-1 + "\n");
		}else {
			int sum = 0;
			for(int i = 0; i < li.size(); i++) {
				sum += li.get(i);
			}
			
			int min = 10000;
			for(int i = 0; i < li.size(); i++) {
				if(li.get(i) < min) min = li.get(i);
			}
			
			bw.write(sum + "\n");
			bw.write(min + "\n");
		}
		
		bw.close();
	}

}


// 에라스토테네스의 체 방식을 이용해 i번째 수의 배수들을 a[i] = 1으로 바꿔준 뒤, 출력 시 a[i] != 1인 경우의 i만 출력해준다.
//import java.util.*;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i, j, m = sc.nextInt(), n = sc.nextInt();
//		int a[] = new int[n + 1];
//		
//		for (i = 0; i <= n; i++) a[i] = 0;
//		a[1] = 1;
//		
//		for (i = 2; i <= n; i++)
//			for (j = 2; i*j <= n; j++)
//				a[i * j] = 1;
//
//		for (i = m; i <= n; i++) if(a[i] != 1) System.out.println(i);
//		sc.close();
//	}
//}