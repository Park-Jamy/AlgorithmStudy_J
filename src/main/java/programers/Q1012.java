package programers;

import java.io.*;
import java.util.*;

public class Q1012 {	
	static int[][] map;
	static boolean[][] chk;
	static int g_M, g_N;
	
	//false 조건 체크 
	public static boolean checkNow(int x, int y) {
		if(x < 0 || x >= g_M || y < 0 || y >= g_N) return false;
		else if(chk[x][y] == true || map[x][y] == 0) return false;
		else return true;
	}
	
	//dfs
	public static void dfs(int x, int y) {
		chk[x][y] = true;
		//위 아래 왼쪽 오른쪽 
		int xi[] = {1, -1, 0, 0};		
		int yi[] = {0, 0, -1, 1};
		
		
		//상하좌우체
		for(int i = 0; i < 4; i++) {
			int xn = x + xi[i];
			int yn = y + yi[i];
			
			if(checkNow(xn,yn)) dfs(xn,yn);
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 1012 백준 https://www.acmicpc.net/problem/1012
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//몇개의 맵인
		int count = Integer.parseInt(br.readLine());
		int result = 0;
		for(int j = 0; j < count; j++) {
			result = 0;
			
			String f_line[] = br.readLine().split(" ");
			int M = Integer.parseInt(f_line[0]);
			int N = Integer.parseInt(f_line[1]);
			int loop = Integer.parseInt(f_line[2]);
			
			g_M = M;
			g_N = N;
			
			map = new int[M][N];
			chk = new boolean[M][N];
			//map chk 초기 세팅 
			for(int w = 0; w < M; w++) {
				for(int h = 0; h < N; h++) {
					map[w][h] = 0;
					chk[w][h] = false;
				}
			}
			
			//배추 위치 확인 
			for(int map_c = 0; map_c < loop; map_c++) {
				String c_line[] = br.readLine().split(" ");
				int map_m = Integer.parseInt(c_line[0]); 
				int map_n = Integer.parseInt(c_line[1]);
				
				map[map_m][map_n] = 1;
			}
			
			
			for(int w = 0; w < M; w++) {
				for(int h = 0; h < N; h++) {
					if(checkNow(w,h)) {
						result++;
						dfs(w,h);
					}
				}
			}
			
			bw.write(result + "\n");
			

		}
		bw.close();

	}

}
