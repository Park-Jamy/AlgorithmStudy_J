package Q0809_0815;

import java.io.*;

public class Q10870 {
	//21.08.14 백준 10870  https://www.acmicpc.net/problem/10870 

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		int i = 2;
		
		int pre = 0;
		int now = 1;
		
		while(i <= count) {
			int fut  = now + pre;
			pre = now;
			now = fut;
			i++;
		}
		
		if(count == 0) bw.write(0 + "\n");
		else bw.write(now + "\n");
		
		bw.close();
	}

}
