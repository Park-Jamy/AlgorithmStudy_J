package Q1018_1024;

import java.io.*;
import java.util.*;

public class Q1662 {
	//21.10.21 백준 1662  https://www.acmicpc.net/problem/1662

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s[] = br.readLine().split("");
		int len = s.length;
		Stack<String> st = new Stack<>();
		
		int result = 0;
		
		for(int i = 0; i < len; i++) {
			if(s[i].equals(")")) {
				int count = 0;
				while(!st.peek().equals("(")) {
					String now = st.pop();
					if(now.equals("*")) {
						int pre = Integer.parseInt(st.pop());
						count += pre;
					}else {
						count++;
					}
				}
				st.pop();
				int cnt = Integer.parseInt(st.pop());
				count *= cnt;
				st.push(String.valueOf(count));
				st.push("*");
			}else {
				st.push(s[i]);
			}
		}
		
		int answer = 0;
		
		while(!st.isEmpty()) {
			if(st.peek().equals("*")) {
				st.pop();
				answer += Integer.parseInt(st.pop());
			}else {
				st.pop();
				answer++;
			}
		}
		
		bw.write(answer + "\n");
		bw.close();
		
	}

}

//괄호 안에 문자열 길이 체크
//( 바로 앞 숫자 확인 및 문자열 길이와 *
// + ( 전까지 문자열 개수 더하기 제귀;;
//압축되지 않은 문자열 S가 주어졌을 때, 이 문자열중 어떤 부분 문자열은 K(Q)와 같이 압축 할 수 있다. K는 한자리 정수이고, Q는 0자리 이상의 문자열이다. 
//이 Q라는 문자열이 K번 반복된다는 뜻이다. 압축된 문자열이 주어졌을 때, 이 문자열을 다시 압축을 푸는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 압축된 문자열 S가 들어온다. S의 길이는 최대 50이다. 문자열은 (, ), 0-9사이의 숫자로만 들어온다.
//
//출력
//첫째 줄에 압축되지 않은 문자열의 길이를 출력한다. 이 값은 2,147,473,647 보다 작거나 같다.
//
//예제 입력 1 
//33(562(71(9)))
