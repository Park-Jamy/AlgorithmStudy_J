package sArrLogic;

import java.io.*;

public class Q11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 11720 https://www.acmicpc.net/problem/11720
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		int count = Integer.parseInt(s);
		
		String num =  br.readLine();
		
		String arr[] = num.split("");
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		bw.write(sum + "\n");
	    bw.close();
	}
}
