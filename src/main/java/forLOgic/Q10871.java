package forLOgic;

import java.io.*;

import java.util.StringTokenizer;

public class Q10871 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 10871 https://www.acmicpc.net/problem/10871
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		String count = br.readLine();
		st = new StringTokenizer(count);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		
		for(int i = 0; i < A; i++) {
			int C = Integer.parseInt(st.nextToken());
			if(C < B) bw.write(C + " ");
		}
		
		bw.close();
	}

}
