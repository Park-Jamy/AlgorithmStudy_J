package Q0913_0919;

import java.io.*;

public class Q2010 {
	//21.09.18 백준 2010  https://www.acmicpc.net/problem/2010

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		
		int result = 0; 
		for(int i = 0; i < count; i++) {
			result += Integer.parseInt(br.readLine());
		}
		
		result = result - count + 1;
		
		bw.write(result + "\n");
		bw.close();
	}

}
