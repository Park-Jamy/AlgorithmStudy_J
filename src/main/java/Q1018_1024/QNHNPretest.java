package Q1018_1024;

import java.io.*;
import java.util.*;

public class QNHNPretest {
	//21.10.20
	static int list[][];
	static boolean chk[][];
	static int count;
	static int gNum;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		count = Integer.parseInt(br.readLine());

		list = new int[count][count];
		chk = new boolean[count][count];
		
		//기본세팅 
		for(int i = 0; i < count; i++) {
			String s[] = br.readLine().split(" ");
			for(int j = 0; j < count; j++) {
				list[i][j] = Integer.parseInt(s[j]);
				chk[i][j] = false;
			}
		}
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count; j++) {
				if(!chk[i][j] && list[i][j] == 1) {
					
					gNum = 0;
					DFS(i, j);
					chk[i][j] = true;
					//bw.write(gNum + "\n");
					st.push(gNum);
				}
			}
		}
		
		int len = st.size();
		bw.write(len + "\n");
		if(len != 0) {
			int list[] = new int[len];
			
			for(int i = 0; i < len; i++) {
				list[i] = st.pop();
			}
			
			Arrays.sort(list);
			
			for(int i = 0; i < len; i++) {
				bw.write(list[i] + " ");
			}
			bw.write("\n");
		}
		bw.close();
	}
	
	public static void DFS(int x, int y) throws IOException{
		if(x < 0 || x >= count || y < 0 || y >= count) {
			return;
		}else if(chk[x][y] || list[x][y] == 0){
			return;
		}else {
			chk[x][y] = true;
			gNum++;
			int xi[] = {-1, 1, 0, 0};
			int yi[] = {0, 0, 1, -1};
			
			for(int i = 0; i < 4; i++) {
				int xx = x + xi[i];
				int yy = y + yi[i];
				
				DFS(xx, yy);
			}
			//bw.write(gNum + "\n");
			return;
		}
	}
}