package Q0809_0815;

import java.io.*;

public class Q3009 {
	//21.08.13 백준 3009 https://www.acmicpc.net/problem/3009
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int resulta[] = new int[3];
		int resultb[] = new int[3];
		int result[] = new int[2];
		for(int i = 0; i < 3; i++) {
			String s[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			resulta[i] = a; 
			resultb[i] = b;
		}
		
		if(resulta[0] == resulta[1]) result[0] = resulta[2];
		if(resulta[2] == resulta[1]) result[0] = resulta[0];
		if(resulta[0] == resulta[2]) result[0] = resulta[1];
		bw.write(result[0] + " ");
		
		if(resultb[0] == resultb[1]) result[1] = resultb[2];
		if(resultb[2] == resultb[1]) result[1] = resultb[0];
		if(resultb[0] == resultb[2]) result[1] = resultb[1];
		bw.write(result[1] + "\n");
		bw.close();
	}

}
