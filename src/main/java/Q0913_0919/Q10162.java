package Q0913_0919;

import java.io.*;

public class Q10162 {
	//21.09.17 백준 1439  https://www.acmicpc.net/problem/1439

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String str[] = br.readLine().split("");
		int len = str.length;
		
		int zero = 0;
		int one = 0;
		
		
		if(str[0].equals("0")) zero++;
		else one++;
		
		for(int i = 1; i < len; i++) {
			String now = str[i];
			
			if(!str[i-1].equals(now)){
				if(now.equals("0")) zero++;
				else if(now.equals("1")) one++;
			}
			
		}
		
		if(one > zero) bw.write(zero + "\n");
		else bw.write(one + "\n");
		
		bw.flush();
		bw.close();
	}

}
