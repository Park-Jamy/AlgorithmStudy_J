package LOgic;

import java.io.*;

public class Q1193 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 1712 https://www.acmicpc.net/problem/1712
		int n = Integer.parseInt(br.readLine());
		
		bw.write(fn(n) + "\n");
		bw.close();
	}
	
	public static String fn(int num) throws IOException{
		int result = 1;
		String ret = "";
		while(true) {
			if(num <= result) break;
			num -= result++;
		}
		//bw.write("num " + num + " result " + result + "\n");

		//ret = String.valueOf(result + 1 - num) + "/" + String.valueOf(num);

		if(result%2 == 0) ret = String.valueOf(num) + "/" + String.valueOf(result + 1 - num);
		else ret = String.valueOf(result + 1 - num) + "/" + String.valueOf(num);

		
		return ret;
	}

}
