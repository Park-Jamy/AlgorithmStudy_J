package Q0816_0822;

import java.io.*;
import java.util.*;

public class Q10828 {
		//21.08.21 백준 Q10828  https://www.acmicpc.net/problem/10828

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int list[];
	static int gNum = 0;
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		list = new int[count];
		for(int i = 0; i < count; i++) {
			String s[] = br.readLine().split(" ");
			
			switch (s[0]) {
			
			case "push":
				push(Integer.parseInt(s[1]));
				break;
			
			case "pop":
				bw.write(pop() + "\n");
				break;
				
			case "size":
				bw.write(size() + "\n");
				break;
				
			case "empty":
				bw.write(empty() + "\n");
				break;
				
			case "top":
				bw.write(top() + "\n");
				break;
				
			}
		} 
		
		bw.close();
		
	}
	
	public static void push(int num){
		list[gNum] = num;
		gNum++;
	}
	
	public static int pop() {
		if(gNum == 0) return -1;
		else {
			gNum--;
			int result = list[gNum];
			list[gNum] = 0;
			return result;
		}
	}
	
	public static int size() {
		return gNum;
	}
	
	public static int empty() {
		if(gNum == 0) return 1;
		else return 0;
	}
	
	public static int top() {
		if(gNum == 0) return -1;
		else return list[gNum-1];
	}

}
