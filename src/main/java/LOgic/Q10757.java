package LOgic;

import java.io.*;

public class Q10757 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 21.07.31 백준 10757 https://www.acmicpc.net/problem/10757
		
		String s = br.readLine();
		
		String a[] = s.split(" ");
		
		int max_len = 0;
		
		if(a[0].length() > a[1].length()) max_len = a[0].length();
		else max_len = a[1].length();
		
		int A[] = new int[max_len + 1];
		int B[] = new int[max_len + 1];
		
		for(int i = a[0].length() - 1, id = 0; i >= 0 ; i--, id++) {
			A[id] = a[0].charAt(i) - '0';
  		}
		
		for(int i = a[1].length() - 1, id = 0; i >= 0; i--, id++) {
			B[id] = a[1].charAt(i) - '0';
  		}
		
		for(int i = 0; i < max_len; i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;
			A[i+1] += value / 10;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(A[max_len] != 0) {
			sb.append(A[max_len]);
		}
		for(int i = max_len - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		
		bw.write(sb + "\n");
		bw.close();
	}

}

///////BigInteger 활용해도 가능 
//A = A.add(B);


