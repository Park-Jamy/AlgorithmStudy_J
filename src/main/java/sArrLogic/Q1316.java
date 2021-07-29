package sArrLogic;

import java.io.*;
import java.util.*;

public class Q1316 {
	// 21.07.29 백준 1316 https://www.acmicpc.net/problem/1316
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static boolean check(int count) throws IOException{
		
		int result = 0;
		int pak[] = new int[26];
		//로우 하나 읽기 
		String s = br.readLine();
		
		//길이 
		int len = s.length();
		
		int pre = 0;
		// j 번째 char 확인 
		for(int j = 0; j < len; j++) {
			
			// j 번째 char 확인 
			int c = s.charAt(j);
			
			// 만약 이전 문자와 현재 문자가 다르다 
			if(pre != c) {
				if(pak[ c - 'a'] == 0) {
					pak[ c - 'a'] = 1;
					pre = c;
				}
				
				else {
					return false;
				}
			}
			
			
			else {
				continue;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		int count = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < count; i++) {
			if(check(i)) {
				result++;
			}
		}

		bw.write(result + "\n");
		bw.close();

	}

}
