package Q1003_1010;

import java.io.*;
import java.util.*;

public class Q1448 {
	//21.10.07 백준 1448  https://www.acmicpc.net/problem/1448

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		int list[] = new int[count];
		int result = 0; 
		
		for(int i = 0; i < count; i++) {
			list[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(list);
		
		int one = list[count-1];
		int two = list[count-2];
		int three = 0;
		for(int i = count - 3; i > -1; i--) {
			three = list[i];
			if(one < two + three) {
				result = one + two + three;
				break;
			}
			one = two;
			two = three;
		}
		if(result == 0) {
			bw.write(-1 + "\n");
		}else {
			bw.write(result + "\n");
		}
		
		bw.close();
	}

}
