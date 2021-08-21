package Q0816_0822;

import java.io.*;
import java.util.*;

public class Q1541 {
	//21.08.21 백준 1541  https://www.acmicpc.net/problem/1541

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String mNum[] = br.readLine().split("-");
		int len = mNum.length;
		
		int list[] = new int[len];
		
		for(int i = 0; i < len; i++) {
			if(mNum[i] == "0") {
				list[i] = 0; 
				continue;
			}
			String now[] = mNum[i].split("\\+");
			for(int c = 0; c < now.length; c++) {
				list[i] += Integer.parseInt(now[c]);
			}
		}
		int result = list[0];
		
		for(int i = 1; i < list.length; i++) {
			result -= list[i];
		}
		
		bw.write(result + "\n");
		bw.close();
	}

}
