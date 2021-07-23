package arrayLogic;

import java.io.*;
import java.util.StringTokenizer;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.23 백준 4344 https://www.acmicpc.net/problem/4344
		//자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < count; i++) {
			String n = br.readLine();
			st = new StringTokenizer(n);
			
			int sCount = Integer.parseInt(st.nextToken());
			int arr[] = new int[sCount];

			int sum = 0;
			for(int j = 0; j < sCount; j++) {
				int now = Integer.parseInt(st.nextToken());
				arr[j] = now;
				sum += now;
			}
			
			int aver = sum/sCount;
			double avUp = 0;
			for(int o = 0; o < sCount; o++) if(aver < arr[o]) avUp++;

			double mt = avUp/sCount*100;
			String end = String.format("%.3f",mt);
			bw.write(end+"%"+"\n");
		}
		bw.close();
		
	}

}
