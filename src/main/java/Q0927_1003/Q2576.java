
package Q0927_1003;

import java.io.*;
import java.util.Arrays;

public class Q2576 {
	//21.09.30 백준 2576  https://www.acmicpc.net/problem/2576

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int sum = 0;
		int list[] = new int[7];
		
		for(int i = 0; i < 7; i++) {
			int now = Integer.parseInt(br.readLine());
			
			if(now%2 == 1) {
				sum += now;
				list[i] = now;
			}else list[i] = 0;
		}
		
		Arrays.sort(list);
		
		if(sum == 0) {
			bw.write(-1 + "\n");
		}else {
			bw.write(sum + "\n");
			for(int i = 0; i < 7; i++) {
				if(list[i] != 0) {
					bw.write(list[i] + "\n");
					break;
				}
			}
		}
		
		bw.close();
	}
}
