package Q0920_0926;

import java.io.*;
import java.util.*;

public class Q11497 {
	//21.09.24 백준 11497  https://www.acmicpc.net/problem/11497

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			int arr[] = new int[num];
			
			String s[] = br.readLine().split(" ");
			int list[] = new int[num];
			for(int j = 0; j < num; j++) 
				list[j] = Integer.parseInt(s[j]);
			
			
			Arrays.sort(list);
			
			for(int j = 0; j < num; j++) {
				
				int now = j/2;
				
				if(j%2 == 0) arr[now] = list[j];
				else {
					arr[num - 1 - now] = list[j];
				}
				
			}
			
			int max = 0;
			for(int j = 0; j < num; j++) {
				bw.write(arr[j] + " ");
				int now = 0;
				if(j != num - 1)
					now = Math.abs(arr[j] - arr[j+1]);
				else 
					now = Math.abs(arr[j] - arr[0]);
				
				
				if(max < now) max = now;
			}
			
			bw.write(max + "kk\n");
		}
		bw.close();
	}

}
