package Q0920_0926;

import java.io.*;
import java.util.*;
public class Q9237 {
	//21.09.24 백준 9237  https://www.acmicpc.net/problem/9237

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
				
		Integer list[] = new Integer[count];
		
		for(int i = 0; i < count; i++) {
			list[i] = Integer.parseInt(s[i]);
		}
		
		Arrays.sort(list, Collections.reverseOrder());
		
		int max = 0;
		for(int i = 0; i < count; i++) {//나무 자라는 일수+심는데 흐른 일수
			list[i] = list[i] + i + 1;
			if(list[i] > max) max = list[i];
		}
		
		max++;
		
		bw.write(max + "\n");
		bw.close();
	}

}
