package whileLOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 10951 https://www.acmicpc.net/problem/10951
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			String s = br.readLine();
			
			if(s == null) break;
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			int c = a + b;
			bw.write(c + "\n");
		}
		bw.close();
	}

}
