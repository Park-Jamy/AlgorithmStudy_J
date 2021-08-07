package ArrayList;

import java.io.*;
import java.util.*;

public class Q1181 {
	static String[] list;
	
	public static boolean chk(String s, int i) {
		if(s.equals(list[i-1])) return false;
		else return true;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 1181 https://www.acmicpc.net/problem/1181
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = Integer.parseInt(br.readLine());
		list = new String[len];
		
		ArrayList<String> result = new ArrayList<>();
		
		for(int i = 0; i < len; i++) {
			String now = br.readLine();
			list[i] = now;
		}
		
		Arrays.sort(list, 
			new Comparator<String>(){
				public int compare(String s1, String s2) {
					if(s1.length() == s2.length()) {
						return s1.compareTo(s2);
					}else {
						return s1.length()- s2.length();
					}
				}
			}
		);
		
		
		for(int i = 0; i < list.length; i++) {
			if(i == 0) result.add(list[i]);
			else {
				if(chk(list[i], i)) result.add(list[i]);
			}
		}
		
		String[] answer = new String[result.size()];
		
		for(int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
			bw.write(answer[i] + "\n");
		}
		
		bw.close();
	}

}
