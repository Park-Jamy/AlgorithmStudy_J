package programers;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        Queue<Integer> q = new LinkedList<>();
        int len = answers.length;
        
        int aList[] = {1,2,3,4,5}; 
        int bList[] = {2,1,2,3,2,4,2,5}; 
        int cList[] = {3,3,1,1,2,2,4,4,5,5}; 
        
        int list[] = {0,0,0};
        for(int i = 0; i < len; i++){
            int A = i%5;
            int B = i%8;
            int C = i%10;
            
            if(answers[i] == aList[A]) list[0]++;
            if(answers[i] == bList[B]) list[1]++;
            if(answers[i] == cList[C]) list[2]++;
        }
        int max = 0;
        for(int j = 0; j < 3; j++){
            int now = list[j];
            
            if(now > max) max = now;
        }
        
        for(int n = 0; n < 3; n++){
            int now = list[n];
            
            if(now == max) q.add(n+1);
        }
        
        int[] answer = new int[q.size()];
        int a = 0;
        while(!q.isEmpty()){
            answer[a] = q.peek();
            q.remove();
            a++;
        }
        
        return answer;
    }
}
// 1 12345 --5
// 2 21232425 --8
// 3 3311224455 --10