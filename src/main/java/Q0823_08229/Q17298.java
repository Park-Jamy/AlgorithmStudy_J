package Q0823_08229;

import java.io.*;
import java.util.*;

public class Q17298 {
	//21.08.26 백준 17298  https://www.acmicpc.net/problem/17298

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String list[];
	static int count;
	static Stack<String> stack = new Stack<>();
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		count = Integer.parseInt(br.readLine());
		//list = new int[count];
		
		
		list = br.readLine().split(" ");
//		
//		for(int i = 0; i < count; i++) {
//			list[i] = Integer.parseInt(s[i]);
//		}
		
		for(int i = 0; i < count; i++) {
			if(i == count - 1) bw.write(-1 + " ");
			else bw.write(NGE(list[i], i) + " ");
		}
		
		bw.flush();
		bw.close();
		
		
	}
	
	static int NGE(String num, int gi) {
		int gNum = Integer.parseInt(num);
		
		for(int i = gi+1; i < count; i++) {
			stack.push(list[i]);
		}
		
		int result = -1;
		while(!stack.isEmpty()){
			int now = Integer.parseInt(stack.pop());
			if( now > gNum) result = now;
		}
		
		if( result == gNum) return -1;
		else return result;
	}

}
//크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. 
//Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
//
//예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. 
//A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.