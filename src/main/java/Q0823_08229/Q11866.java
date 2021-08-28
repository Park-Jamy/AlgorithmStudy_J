package Q0823_08229;

import java.io.*;
import java.util.*;

public class Q11866 {
	//21.08.28 백준 11866  https://www.acmicpc.net/problem/11866

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s[] = br.readLine().split(" ");
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> list = new LinkedList<>();
		
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
			
		}
		
		int n = 0;
		while(q.size() > 0) {
			
			
			int now = q.poll();
		
			if((n+1)%K != 0) q.add(now);
			else {
				//bw.write(q.size() + " ");
				list.offer(now);
			}
			n++;
		}
		
		bw.write("<");
		for(int i = 0; i < N; i++) {
			if(i == N-1) bw.write(list.poll() + ">\n");
			else bw.write(list.poll() + ", ");
		}
		bw.close();
		
	}

}
