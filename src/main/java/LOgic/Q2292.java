package LOgic;

import java.io.*;

public class Q2292 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 2292 https://www.acmicpc.net/problem/2292
		int num = Integer.parseInt(br.readLine());
		bw.write(nFn(num) + "\n");
		bw.close();
	}
	
	public static int nFn(int num) {
		int result = 1;
		
		if(num == 1) result = 1;
		else {
			num -= 1;
			while(true) {
				if(num <= result * 6) break;
				num -= result * 6;
				result++;
			}
			result++;
		}
		
		return result;
	}
}
