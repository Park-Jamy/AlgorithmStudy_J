package forLOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2742 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 2742 https://www.acmicpc.net/problem/2742
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		
		for(int i = count; i > 0; i--) {
			bw.write(i + "\n");
		}
		
		bw.close();
	}

}
