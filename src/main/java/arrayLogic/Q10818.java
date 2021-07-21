package arrayLogic;

import java.io.*;
import java.util.StringTokenizer;

public class Q10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.21 백준 10818 https://www.acmicpc.net/problem/10818
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stNum;
		
		
		int count = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		stNum = new StringTokenizer(num);
		int max = -1000000, min = 1000000;
		for(int i = 0; i < count; i++) {
			int now = Integer.parseInt(stNum.nextToken());
			
			if(max < now) max = now;
			if(min > now) min = now;
		}
		
		bw.write(min + " " + max + "\n");
		bw.close();
		
	}

}
