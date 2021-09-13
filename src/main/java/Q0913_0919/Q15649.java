package Q0913_0919;

import java.io.*;
public class Q15649 {
	//21.09.13 백준 15649  https://www.acmicpc.net/problem/15649

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N,M;
	static int[] list;
	static boolean[] chk;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String[] A = br.readLine().split(" ");
		N = Integer.parseInt(A[0]);
		M = Integer.parseInt(A[1]);
		
		list = new int[M];
		chk = new boolean[N+1];
		
		DFS(0);
		bw.close();
	}
		
	static void DFS(int num) throws IOException{
		if(num == M) {
			for(int i = 0; i < M; i++) {
				bw.write(list[i] + " ");
			}
			bw.write("\n");
		}else {
			for(int i = 1; i <= N; i++) {
				if(!chk[i]) {
					list[num] = i;
					chk[i] = true;
					DFS(num+1);
					chk[i] = false;
				}
			}
		}
	}
}

//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
//입력
//첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
//
//출력
//한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
//
//수열은 사전 순으로 증가하는 순서로 출력해야 한다.