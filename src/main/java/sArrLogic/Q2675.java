package sArrLogic;

import java.io.*;

public class Q2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 2675 https://www.acmicpc.net/problem/2675
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());
		for(int i = 0; i < c ; i++) {
			String s[] = br.readLine().split(" ");
			String st = s[1];
			
			int count = Integer.parseInt(s[0]);
			
			for(int n = 0; n < st.length(); n++) {
				for(int j = 0; j < count; j++) bw.write(st.charAt(n));
			}
			bw.write("\n");
		}
		bw.flush();
	    bw.close();
	}
}
