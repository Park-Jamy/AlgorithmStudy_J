package LOgic;

import java.io.*;
import java.util.StringTokenizer;

public class Q10250 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 10250 https://www.acmicpc.net/problem/10250
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s, " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//bw.write(H + " " + W + " " + N + "\n");
			
			int XX = 0;
			int YY = 0;
			if(N%H != 0) { 
				XX = (N/H) + 1;
				YY = (N%H) * 100;
			}
			else {
				XX = N/H;
				YY = H * 100;
			}
			bw.write( YY + XX + "\n");
		}
		
		bw.close();
	}

}
