package arrayLogic;

import java.io.*;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.23 백준 1546 https://www.acmicpc.net/problem/1546
		//자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		float arr[] = new float[count];
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		
		float max = 0;
		for(int i = 0; i < count; i++){
			float now = Integer.parseInt(st.nextToken());
			arr[i] = now;
			
			
			if(max < now) max = now;
		}
		
		float sum = 0;
		for(int j = 0; j < count; j++){
			float now = arr[j];
			
			now = now/max*100;
			
			sum += now;
		}
		
		float avr = sum/count; 
		
		bw.write(avr + "\n");
		bw.close();
		
	}

}
