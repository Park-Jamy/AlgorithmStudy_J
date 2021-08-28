package Q0823_08229;

import java.io.*;
import java.util.*;

public class Q2164 {
	//21.08.28 백준 2164  https://www.acmicpc.net/problem/2164

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			q.offer(i) ;
			//bw.write(q.size() + " ");
		}
		
	
		int c = 0;
		while(true) {
			int now = q.poll();
			if( c == 0 ) {
				c = 1;
			}
			else {
				c = 0;
				q.offer(now);
			}
			
			if(q.size() == 1) break;
		}
		
		bw.write(q.poll() + "\n");
		bw.close();
	}

}
