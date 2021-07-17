package forLOgic;

import java.io.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.17 백준 15552  https://www.acmicpc.net/problem/15552 
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(bf.readLine()); // readLine 사용시에는 IOException 설 
		
		for(int i = 0; i < count; i++) {
			String S = bf.readLine();

			StringTokenizer st = new StringTokenizer(S);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = A + B;
			bw.write(C + "\n");
		}
		
		
//		StringTokenizer st = new StringTokenizer(s);
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		String array[] = s.split(" "); 
		
		// 버퍼 사용시 라인으로만 데이터를 받기 때문에 
		// 1. 스트링 토큰으로 나누기.
		// 2. 배열에서 split으로 나누기.
		
		bw.flush();
		bw.close();
	}

}
