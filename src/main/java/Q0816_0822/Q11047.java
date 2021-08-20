package Q0816_0822;

import java.io.*;
import java.util.*;

public class Q11047 {
	//21.08.20 백준 11047  https://www.acmicpc.net/problem/11047

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String s[] = br.readLine().split(" ");
		int count = Integer.parseInt(s[0]);
		int target = Integer.parseInt(s[1]);
		int result = 0;
		
		int arr[] = new int[count];
		
		//지패 셋팅 
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = count - 1; i >= 0; i--) {
			if(target < arr[i]) continue;
			else {
				result += target/arr[i];
				if(target%arr[i] == 0) break;
				else target =  target%arr[i];
			}
		}
		
		bw.write(result + "\n");
		bw.close();
		
	}

}
