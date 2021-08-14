package Q0809_0815;

import java.io.*;
//21.08.14 백준 10814 https://www.acmicpc.net/problem/10814
import java.util.*;

class Student{
	int no;
	int age;
	String name;
	Student(int no, int age, String name){
		this.no = no;
		this.age = age;
		this.name = name;
	}
}

public class Q10814 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = Integer.parseInt(br.readLine());
		
		Student list[] = new Student[count];
		
		for(int i = 0; i < count; i++) {
			String s[] = br.readLine().split(" ");
			int ageN = Integer.parseInt(s[0]);
			String nameN = s[1];
			
			list[i] = new Student(i,ageN,nameN);
		}
		
		Arrays.sort(list, 
				new Comparator<Student>(){
					public int compare(Student s1, Student s2) {
						return s1.age - s2.age;
					}
				}
		);
		
		for(int i = 0; i < count; i++) {
			bw.write(list[i].age + " " + list[i].name + "\n");
		}
		
		bw.close();
	}

}
