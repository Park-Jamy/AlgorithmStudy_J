package Q0809_0815;

import java.io.*;

public class Q11729 {
	//21.08.14 백준 11729  https://www.acmicpc.net/problem/11729

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(br.readLine());
		 
		bw.write((int) (Math.pow(2, N) - 1) + "\n");
 
		Hanoi(N, 1, 2, 3);
		bw.flush();
		bw.close();
	}
	
	
	static void Hanoi(int N, int start, int mid, int to) throws IOException{
		 
		// 이동할 원반의 수가 1개라면?
		if (N == 1) {
			bw.write(start + " " + to + "\n");
			return;
		} 
	    
		// STEP 1 : N-1개를 A에서 B로 이동
		Hanoi(N - 1, start, to, mid);
	    
		// STEP 2 : 1개를 A에서 C로 이동
		bw.write(start + " " + to + "\n");
	    
		// STEP 3 : N-1개를 B에서 C로 이동
		Hanoi(N - 1, mid, start, to);
	}
}
