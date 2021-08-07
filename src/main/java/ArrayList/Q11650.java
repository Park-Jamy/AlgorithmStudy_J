package ArrayList;

import java.io.*;
import java.util.*;

class Xy{
	int x;
	int y;
	Xy(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Q11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 11650 https://www.acmicpc.net/problem/11650
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = Integer.parseInt(br.readLine());
		Xy[] li = new Xy[len];
		
		for(int i = 0; i < len; i++) {
			String s[] = br.readLine().split(" ");
			li[i] = new Xy(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		
		Arrays.sort(li, 
			new Comparator<Xy>() {
				public int compare(Xy s1, Xy s2) {
					if(s1.x == s2.x) return s1.y - s2.y;
					else return s1.x - s2.x;
				}
			}
		);
		
		for(int i = 0; i < len; i++) {
			bw.write(li[i].x + " " + li[i].y + "\n");
		}
		
		bw.close();
	}


}
