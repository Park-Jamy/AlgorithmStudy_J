package Q0809_0815;

import java.io.*;
import java.util.*;

public class Q4153 {
	//21.08.14 백준 4153  https://www.acmicpc.net/problem/4153 

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int num[] = new int[3];
		while(true) {
			String s[] = br.readLine().split(" ");
			
			num[0] = Integer.parseInt(s[0]);
			num[1] = Integer.parseInt(s[1]);
			num[2] = Integer.parseInt(s[2]);
			
			Arrays.sort(num);
			if(num[0] == 0 && num[1] == 0 && num[2] == 0) break;
			else {
				if(num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) bw.write("right" + "\n");
				else bw.write("wrong" + "\n");
			}
		}
		bw.close();
	}

}
