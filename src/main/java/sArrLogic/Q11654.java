package sArrLogic;

import java.io.*;

public class Q11654 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 11654 https://www.acmicpc.net/problem/11654	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		int result = (int)s.toCharArray()[0];
		
		bw.write(result + "\n");
	    bw.close();
	}
}
