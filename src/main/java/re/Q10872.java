package re;

import java.io.*;

public class Q10872 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 10872 https://www.acmicpc.net/problem/10872
		
		int c = Integer.parseInt(br.readLine());
		int p = 1;
		if(c == 0) p = 1;
		else {
			for(int i = c; i > 0; i--) {
				p *= i;
			}
		}
		
		System.out.println(p);

	}

}
