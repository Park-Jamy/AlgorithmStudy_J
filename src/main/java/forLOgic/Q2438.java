package forLOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2438 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 2438  https://www.acmicpc.net/problem/2438 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < count+1; i++) {
			for(int j = 0; j < i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();

	}

}
