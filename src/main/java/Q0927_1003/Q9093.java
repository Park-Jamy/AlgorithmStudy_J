package Q0927_1003;

import java.io.*;

public class Q9093 {
	//21.09.27 백준 9093  https://www.acmicpc.net/problem/9093

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			String list[] = br.readLine().split(" ");
			
			int len = list.length;
			
			for(int j = 0; j < len; j++) {
				int nowLen = list[j].length();
				String nowS = list[j];
				
				for(int n = nowLen - 1; n > -1; n--) {
					bw.write(nowS.charAt(n));
				}
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.close();
	}

}
