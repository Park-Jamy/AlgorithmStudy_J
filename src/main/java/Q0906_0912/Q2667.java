package Q0906_0912;

import java.io.*;
import java.util.Arrays;

public class Q2667 {
	//21.09.08 백준 2667  https://www.acmicpc.net/problem/2667

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int count;
	static boolean[][] chk; 
	static int[][] list;
	
	static int[] result;
	
	static int num;
	static int c = 0;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		count = Integer.parseInt(br.readLine());
		list = new int[count][count];
		chk = new boolean[count][count];
		result = new int[count*count];
		//초기 세팅 
		for(int i = 0; i < count; i++) {
			String li[] = br.readLine().split("");
			for(int j = 0; j < count; j++) {
				list[i][j] = Integer.parseInt(li[j]);
				chk[i][j] = false;
			}
		}
		
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count; j++) {
				if(!chk[i][j]&& list[i][j] == 1) {
					c++;
					BFS(i, j);
				}
			}
		}
		
		Arrays.sort(result);
		
		bw.write(c + "\n");
		int a = 0;
		for(int i = 0; i < count*count; i++) {
			if(result[i] != 0) bw.write(result[i] + "\n");
		}
		
		bw.close();
		
	}
	
	public static void BFS(int h, int w) {
		
			chk[h][w] = true;
			result[c]++;
			int y[] = {-1, 1, 0, 0};
			int x[] = {0, 0, 1, -1};
			
			for(int i = 0; i < 4; i++) {
				int hi = h + y[i];
				int wi = w + x[i];
				if(hi < 0 || hi >= count || wi < 0 || wi >= count);
				else {
					if( list[hi][wi] == 1 && !chk[hi][wi] ) {
						BFS(hi,wi);
					}
				}
				
			}
		
	}

}
