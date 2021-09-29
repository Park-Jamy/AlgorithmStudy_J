package Q0927_1003;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class book{
	String name = "";
	int num = 0;
	
	book(String name, int num){
		this.name = name;
		this.num = num;
	}
}

public class Q1302 {
	//21.09.29 백준 1302  https://www.acmicpc.net/problem/1302

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		
		book list[] = new book[count];
		
		String bl = "";
		
		for(int i = 0; i < count; i++)
			list[i] = new book(bl,0);
		
		int len = list.length;
		
		int a = 0;
		for(int i = 0; i < count; i++) {
			String s = br.readLine();
			boolean chk = false;
			for(int j = 0; j < len; j++) {
				String now = list[j].name;
				if(!now.equals("")) {
					if(s.equals(list[j].name)) {
						list[j].num++;
						chk = true;
					}	
				} else break;
			}
			
			if(chk == false) {
				list[a] = new book(s, 0);
				a++;
			}
		}
		
		book blist[] = new book[a];
		
		for(int i = 0; i < a; i++)
			blist[i] = new book(list[i].name,list[i].num);
		
		Arrays.sort(blist, new Comparator<>() {
			public int compare(book b1, book b2) {
				String nName = b1.name;
				
				if(b1.num == b2.num) return nName.compareTo(b2.name);
				else return b2.num - b1.num;
			}
		});
		
		bw.write(blist[0].name + "\n");
		bw.close();
	}

}
