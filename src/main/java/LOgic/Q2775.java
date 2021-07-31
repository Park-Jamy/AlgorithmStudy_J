package LOgic;

import java.io.*;

public class Q2775 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int APT[][] = new int[15][15];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 2775 https://www.acmicpc.net/problem/2775
		mApt();
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			bw.write(APT[k][n] + "\n");
		}
		bw.close();
	}
	
	public static void mApt() {
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
	}

}
