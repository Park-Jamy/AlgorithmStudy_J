package Q0809_0815;

import java.io.*;
// 21.08.11 백준 1978 https://www.acmicpc.net/problem/1978

public class Q1978 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		
		int[] list = new int[count];
		
		for(int i = 0; i < count; i++) {
			list[i] = Integer.parseInt(s[i]);
		}
		
		
		
		int c = 0;
		for(int i = 0; i < count; i++) {
			int chk = 0;
			if(list[i] != 1) {
				for(int j = 2; j < list[i]; j++) {
					if(list[i]%j == 0) {
						chk = 1;
						break;
					}
				}
			}else {
				chk = 1;
			}
			if(chk == 0) c++;
		}
		
		bw.write(c + "\n");
		bw.close();
	}

}
