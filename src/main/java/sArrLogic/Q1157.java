package sArrLogic;

import java.io.*;

public class Q1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 1157 https://www.acmicpc.net/problem/1157
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		//a = 97, A = 65 // 32 
		int arr[] = new int[26];
		
		for(byte st : s.getBytes()) {
			int i = (int)st;
			
			if(i > 96) {
				i -= 32;
				st = (byte)i;
			}
			
			arr[st - 'A']++;
		}
		
		int max = 0;
		int result = 0;
		for(int i = 0; i < 26 ; i++) {
			if(max <= arr[i]) {
				max = arr[i];
				result = i;
			}
		}
		
		for(int i = 0; i < 26 ; i++) {
			if(i == result) break;
			if(max == arr[i]) result = -1;
		}
		
		char bq = (char)(result + 'A');
		
		if(result == -1) bw.write("?\n");
		else bw.write(bq + "\n");
	    bw.close();
	}
}
