package arrayLogic;

import java.io.*;

public class Q2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.21 백준 2577 https://www.acmicpc.net/problem/2577
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int num = A*B*C;
		
		//bw.write(num + "\n");
		
		int[] arr = new int[10];
		while(true) {
			int now = num % 10; 
			arr[now]++;
			
			num = num / 10;
			
			if(num == 0) break;
		}
		
		for(int i = 0; i < 10; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.close();
		
	}

}
