package Q0920_0926;

import java.io.*;

import java.util.*;

public class Q1449 {
	//21.09.22 백준 1449  https://www.acmicpc.net/problem/1449

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s[] = br.readLine().split(" "); 
		
		int N = Integer.parseInt(s[0]);
		int L = Integer.parseInt(s[1]);
		
		String li[] = br.readLine().split(" ");
		
		int list[] = new int[N];
		
		for(int i = 0; i < N; i++)
			list[i] = Integer.parseInt(li[i]);
		
		Arrays.sort(list);
		
		int j = 0;
		int count = 0; 
		while(j < N) {
			int now = list[j];
			
			int n = j+1;
			while(n < N) {
				int chk = list[n] - now + 1;
				
				if( chk > L) {
					j = n;
					break;
				}
				n++;
			}
			
			if(n == N) j = n;
			
			count++;
		}
		
		
		bw.write(count + "\n");
		bw.close();
	}

}
