package forLOgic;

import java.io.*;

import java.util.StringTokenizer;

public class Q11021 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 11021 https://www.acmicpc.net/problem/11021
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= count; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = A + B;
			bw.write("Case #" + i + ": " + C + "\n");
		}
		
		bw.close();
	}

}
