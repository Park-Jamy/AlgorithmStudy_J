package Q0906_0912;

import java.io.*;
import java.util.*;
public class Q10799 {
		//21.09.11 백준 10799  https://www.acmicpc.net/problem/10799

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		String[] s = br.readLine().split("");
		
		int count = 0;
		int chk = 0;
		for(int i = 0; i < s.length; i++) {
			if("(".equals(s[i])) stack.push(s[i]);
			else {
				stack.pop();
				if(s[i-1].equals("(")) {
					count += stack.size();
				} else {
					count++;
				}
			}
		}
		
		bw.write(count + "\n");
		bw.close();
		
	}

}
