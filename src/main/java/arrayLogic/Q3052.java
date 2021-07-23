package arrayLogic;

import java.io.*;

public class Q3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.23 백준 3052 https://www.acmicpc.net/problem/3052
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[42];
		int count = 0;
		for(int i = 0; i < 10; i++){
			int now = Integer.parseInt(br.readLine());
			
			now = now % 42; 
			
			arr[now]++;
		}
		
		for(int j = 0; j < 42; j++) {
			if(arr[j] > 0) count++;
		}
		bw.write(count + "\n");
		bw.close();
		
	}

}
