package Q0816_0822;

import java.io.*;
import java.util.*;

public class Q11399 {
	//21.08.21 백준 11399  https://www.acmicpc.net/problem/11399

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());
		String stime[] = br.readLine().split(" ");
		int time[] = new int[num];
		for(int i = 0; i < num; i++) {
			time[i] = Integer.parseInt(stime[i]);
		}
		
		Arrays.sort(time);
		
		int result = 0;
		
		for(int i = num, c = 0; i > 0; i--, c++) {
			result += time[c] * i;
		}
		
		bw.write(result + "\n");
		bw.close();
	}

}
