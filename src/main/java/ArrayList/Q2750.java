package ArrayList;

import java.io.*;
import java.util.*;


public class Q2750 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 2750 https://www.acmicpc.net/problem/2750
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		int[] list =  new int[count];
		for(int i = 0; i < count; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		for(int i = 0; i < count; i++) {
			bw.write(list[i] + "\n");
		}
		
		bw.close();
	}

}
