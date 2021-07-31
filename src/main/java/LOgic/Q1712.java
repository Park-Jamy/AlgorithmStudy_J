package LOgic;

import java.io.*;

public class Q1712 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 1712 https://www.acmicpc.net/problem/1712
		String s = br.readLine();
		String money[] = s.split(" "); 
		
		int A = Integer.parseInt(money[0]);
		int B = Integer.parseInt(money[1]);
		int C = Integer.parseInt(money[2]);
		
		bw.write(BEP(A, B, C) + "\n");
		bw.close();
	}

	public static int BEP(int A, int B, int C) throws IOException{
		bw.write("A "+A + " B "+B + " C "+ C + "\n");
		int result = 1;
		if(B - C >= 0) result = -1;
		else {
			while(true) {
				if(A < (C - B) * result) break;
				result++;
			}
		}
		return result;
	}
}
