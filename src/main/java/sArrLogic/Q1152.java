package sArrLogic;

import java.io.*;

public class Q1152 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// 21.07.26 백준 1152 https://www.acmicpc.net/problem/1152
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		String arr[] = s.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(!"".equals(arr[i])) count++;
		}
		
		bw.write(count + "\n");
		bw.close();
		
	}

}
