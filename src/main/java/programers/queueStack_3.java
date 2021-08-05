package programers;

import java.util.*;

import java.util.*;

class queueStack_3 {
    public int[] solution(int[] prices) {
        Stack<Integer> s = new Stack<>();
        
        int len = prices.length;
        int[] answer = new int[len];
        answer[len-1] = 0;
        for(int i = 0; i < len-1; i++){
            int now = prices[i];
            int count = 0;
            
            for(int j = i+1; j < len; j++){
                int n_now = now - prices[j];
                if(n_now <= 0) s.push(prices[j]);
                else {
                    s.push(prices[j]);
                    break;
                }
            }
            answer[i] = s.size();
            
            while(!s.isEmpty()){
                s.pop();
            }
        }
        
        return answer;
    }
}