package arrayLogic;

import java.io.*;

public class Q8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 21.07.23 백준 8958 https://www.acmicpc.net/problem/8958
		//자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < count; i++) {
			String ox = br.readLine();
			String[] oxx = ox.split("");
			int sum = 0;
			int now = 0;
			for(int j = 0; j < ox.length(); j++) {
				//현재 ox 뭔지 확인 
				if( "O".equals(oxx[j])) now++;
				else now = 0;
				
				sum += now;
			}
			bw.write(sum + "\n");
		}
		
		bw.close();
		
	}

}
