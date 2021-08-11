package Q0809_0815;

import java.io.*;
import java.util.*;
//21.08.11 백준 11653 https://www.acmicpc.net/problem/11653

public class Q11653 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int num = Integer.parseInt(br.readLine());

		ArrayList<Integer> li = new ArrayList<>();
		
		
		for(int i = 2; i*i < num+1; i++ ) {
			while(num%i==0) {
				li.add(i);
				num /= i;
			}
		}
		
		if (num != 1) {
			li.add(num);
		}
		
		for(int i = 0; i < li.size(); i++) {
			bw.write(li.get(i) + "\n");
		}
		

		bw.close();
	}

}

