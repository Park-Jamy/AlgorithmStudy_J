package Q0913_0919;

import java.io.*;

public class Q10026 {
	//21.09.18 백준 10026  https://www.acmicpc.net/problem/10026

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean chk[][];
	static String list[][];
	static int N;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		N = Integer.parseInt(br.readLine());
		
		list = new String[N][N];
		chk = new boolean[N][N];
		
		// 최초 세팅 
		for(int i = 0; i < N; i++) {
			String[] s = br.readLine().split("");
			for(int j = 0; j < N; j++) {
				list[i][j] = s[j];
				chk[i][j] = false;
			}
		}
		
		//정상인
		int count1 = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!chk[i][j]) {
					BFS(list[i][j], i, j);
					count1++;
				}
				
			}
		}
		
		// 적록색맹 세팅 
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				//G를 R로 바꿔서 저장
				if(list[i][j].equals("G")) list[i][j] = "R";
				chk[i][j] = false;
			}
		}
		
		//적록색맹 
		int count2= 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!chk[i][j]) {
					BFS(list[i][j], i, j);
					count2++;
				}
				
			}
		}
		
		bw.write(count1 + " " + count2 + "\n");
		bw.close();
	}
	
	
	public static void BFS(String color, int h, int w) {
		//값이 리스트 밖으로 넘어가거나 체크가 이미 된 곳은 리턴한다.
		if(w < 0 || w >= N || h < 0 || h >= N || chk[h][w] == true) return;
		else {
			// 값이 만약 다르다면 리턴 
			if(!color.equals(list[h][w])) return; 
			else {
				chk[h][w] = true;
				
				int[] wi = {-1, 1, 0, 0};
				int[] hi = {0, 0, -1, 1};
				
				for(int i = 0; i < 4; i++) {
					int wx = w + wi[i];
					int hx = h + hi[i];
					
					BFS(list[h][w], hx, wx);
				}
			}
		}
	}

}
