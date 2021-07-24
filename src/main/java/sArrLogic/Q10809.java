package sArrLogic;

import java.io.*;

public class Q10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.24 백준 10809 https://www.acmicpc.net/problem/10809
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		
		int count = 0;
		int arr[] = new int[26];
		
		for(int j = 0; j < 26; j++) arr[j] = -1;
		
		for(byte st : s.getBytes()) {
			int i = st - 'a';
			
			if(arr[i] == -1) arr[i] = count;
			
			count++;
		}
		
		for(int n = 0; n < 26; n++) bw.write(arr[n] + " ");
		
		bw.flush();
	    bw.close();
	}
}
