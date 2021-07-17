package whileLOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1110 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 1110 https://www.acmicpc.net/problem/1110
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(br.readLine());
		
		int a,b,c;
		int count = 0;
		if( s/10 == 0 ) b = 0;
		
		a = s/10;
		b = s%10;
		
		int fa = a, fb = b;
				
		while(true) {
			c = a+b;
			a = b;
			if( c/10 == 0 ) b = c;
			else b = c%10;
				
			count++;
			if(fa == a && fb == b) break;
		}
		bw.write(count + "\n");
		bw.close();
	}

}
