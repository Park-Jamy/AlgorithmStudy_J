package programers;
// 7576 백준 https://www.acmicpc.net/problem/7576
import java.io.*;
import java.util.*;


class tomato {
	int x;
	int y;
	tomato(int y, int x) {
		this.y = y;
		this.x = x;
	}
}
public class Q7576 {
	static int[][] map;
	static boolean[][] chk;
	static int M, N;
	static Queue<tomato> q;
	public static boolean checkNow(int y, int x) {
		if(x < 0 || x >= M || y < 0 || y >= N) return false;
		else if(map[y][x] == -1 || chk[y][x] == true) return false;
		else return true;
	}
	
	public static void bfs() {
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			q.remove();
			
			chk[y][x] = true;
			
			int xi[] = {-1, 1, 0, 0};
			int yi[] = {0, 0, -1, 1};
			
			
			for(int i = 0; i < 4; i++) {
				int xn = x + xi[i];
				int yn = y + yi[i];
				
				if(checkNow(yn, xn)) {
					q.add(new tomato(yn, xn));
					map[yn][xn] = map[y][x] + 1;
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		
		M = Integer.parseInt(s[0]);
		N = Integer.parseInt(s[1]);
		
		map = new int[N][M];
		chk = new boolean[N][M];
		
		q = new LinkedList<tomato>();
		
		for(int h = 0; h < N; h++) {
			String now[] = br.readLine().split(" ");
			
			for(int w = 0; w < M; w++) {
				map[h][w] = Integer.parseInt(now[w]);
				chk[h][w] = false;
				
				
				bw.write(map[h][w] + " ");
			}
			bw.write("\n");
		}
		
		
		for(int h = 0; h < N; h++) {
			
			for(int w = 0; w < M; w++) {
				if(checkNow(h,w) && map[h][w] == 1) {
					q.add(new tomato(h, w));
				}
			}
		}
		
		bfs();
		int max_day = 0;
		int check = 1;
		for(int h = 0; h < N; h++) {
			
			for(int w = 0; w < M; w++) {
				max_day = Math.max(max_day, map[h][w]);
				if(map[h][w] == 0) check = 0;
			}
		}
		
		if(check == 0) bw.write(-1 + "\n");
		else {
			max_day--;
			bw.write(max_day + "\n");
		}
		
		bw.close();
		
	}

}
