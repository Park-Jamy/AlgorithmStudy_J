package Q0816_0822;

import java.io.*;
import java.util.*;

class timeTable{
	int start;
	int end;
	timeTable (int start, int end){
		this.start = start;
		this.end = end;
	}
}


public class Q1931 {
	//21.08.20 백준 1931  https://www.acmicpc.net/problem/1931

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static timeTable tT[];
	static int count;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		count = Integer.parseInt(br.readLine());
		
		tT = new timeTable[count];
		for(int i = 0; i < count; i++) {
			String s[] = br.readLine().split(" ");
			tT[i] = new timeTable(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		
		Arrays.sort(tT, new Comparator<timeTable>() {
				public int compare(timeTable t1, timeTable t2) {
					if(t1.end == t2.end) return t1.start - t2.start;
					else return t1.end - t2.end;
				}
			}
		);
		
		int result = 0;
		int pre_end = 0;
		for(int i = 0; i < count; i++) {
			if(pre_end <= tT[i].start) {
				pre_end = tT[i].end;
				
				result++;
			}
		}
		
		bw.write(result + "\n");
		bw.close();
	}
	

}
