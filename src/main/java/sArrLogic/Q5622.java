package sArrLogic;

import java.io.*;
public class Q5622 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.28 백준 5622 https://www.acmicpc.net/problem/5622
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String a[] = s.split("");
		
		//abc/def/ghi/jkl/mno/pqrs/tuv/wxyz
		//2  /3  //4///5///6////7 //8////9//
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			byte n[] = a[i].getBytes();
			if( 65 <= n[0] && n[0] < 68 ) {
				count += 3;
			}
			else if(68 <= n[0] && n[0] < 71) {
				count += 4;
			}else if(71 <= n[0] && n[0] < 74) {
				count += 5;
			}else if(74 <= n[0] && n[0] < 77) {
				count += 6;
			}else if(77 <= n[0] && n[0] < 80) {
				count += 7;
			}else if(80 <= n[0] && n[0] < 84) {
				count += 8;
			}else if(84 <= n[0] && n[0] < 87){
				count += 9;
			}else {
				count += 10;
			}
		}
		bw.write(count + "\n");
		bw.close();
	}

}


