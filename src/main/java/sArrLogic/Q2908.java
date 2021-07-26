package sArrLogic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2908 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// 21.07.26 백준 2908 https://www.acmicpc.net/problem/2908
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String s = br.readLine();
		
		String arr[] = s.split(" ");
		st = new StringTokenizer(s);
		
		int max = 0;
		for(int i = 0; i < 3; i++ ) {
			int a,b,c;
				for(int n = 0; n < 2; n++) {
					int A = Integer.parseInt(arr[n]);
					
					a = A%10;
					A = A/10;
					b = A%10;
					A = A/10;
					c = A%10;
					
					A = (100*a) + (10*b) + c;
					
					if(max < A) max = A;
				}
			
		}
		
		bw.write(max + "\n");
		bw.close();
		
	}
}
