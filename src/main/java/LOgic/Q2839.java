package LOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q2839 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 2839 https://www.acmicpc.net/problem/2839
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int kg = Integer.parseInt(br.readLine());
		int k5 = 0, k3 = 0; 
		int cnt = (kg / 3) + 1;
		
		
		if(kg%5 == 0) {
			k5 = kg / 5;
		}
		else {
			for(int i = 1; i <= cnt; i++) {
				kg -= 3;
				if(kg%5 == 0) {
					k5 = kg / 5;
					k3 = i;
					break;
				}
				k5 = -1;
			}
		}
		if(k5 == -1) bw.write(-1 + "\n");
		else bw.write(k5+k3+"\n");
		bw.close();
	}
}
