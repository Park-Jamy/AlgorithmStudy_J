package LOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 2869 https://www.acmicpc.net/problem/2869
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
 
		int day = (len - down) / (up - down);
		if ((len - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}
}
