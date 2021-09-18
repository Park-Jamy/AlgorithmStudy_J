package Q0913_0919;

import java.io.*;
import java.util.*;

public class Q5397 {
	//21.09.18 백준 5397  https://www.acmicpc.net/problem/5397

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int count = Integer.parseInt(br.readLine());

		
		for(int i = 0; i < count; i++) {
			Stack<String> s = new Stack<>();
			Stack<String> q = new Stack<>();
			
			String[] str = br.readLine().split("");
			
			for(int j = 0; j < str.length; j++) {
				if(str[j].equals("<")) {
					if(!s.isEmpty()) q.add(s.pop());
				}
				else if(str[j].equals(">")) {
					if(!q.isEmpty()) s.push(q.pop());
				}
				else if(str[j].equals("-")){
					if(!s.isEmpty()) s.pop();
				}
				else {
					s.push(str[j]);
				}
			}
			
			while(!s.isEmpty()) {
				q.push(s.pop());
			}
			
			while(!q.isEmpty()) {
				bw.write(q.pop());
			}
			
			bw.write("\n");
		}
		
		bw.close();
	}

}
