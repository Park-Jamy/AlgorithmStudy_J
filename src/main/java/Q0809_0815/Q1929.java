package Q0809_0815;

import java.io.*;
//21.08.13 백준 1929 https://www.acmicpc.net/problem/1929

public class Q1929 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s[] = br.readLine().split(" ");
		
		int min = Integer.parseInt(s[0]);
		int max = Integer.parseInt(s[1]);
		int a[] = new int[max + 1];
		
		for(int i = min; i <= max; i++) a[i] = 0;
		a[1] = 1;
		
		for (int i = 2; i <= max; i++)
			for (int j = 2; i*j <= max; j++)
				a[i * j] = 1;
		
		for(int i = min; i <= max; i++) 
			if(a[i] != 1) bw.write(i + "\n");
		
		
		bw.close();
	}

}
