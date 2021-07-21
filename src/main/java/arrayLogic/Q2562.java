package arrayLogic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.21 백준 2562 https://www.acmicpc.net/problem/2562
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int max = 1, count = 0;
		int i = 0;
		while(i < 9) {
			int now = Integer.parseInt(br.readLine());
			
			if(max < now) {
				max = now;
				count = i + 1;
			}
			
			i++;
		}
		
		bw.write(max + "\n");
		bw.write(count + "\n");
		bw.close();
		
	}

}
