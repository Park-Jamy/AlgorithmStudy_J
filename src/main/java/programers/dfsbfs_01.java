package programers;

import java.util.*;
// https://programmers.co.kr/learn/courses/30/lessons/43165?language=java
class dfsbfs_01 {
    static int[] g_numbers;
    static int g_answer = 0;
    public void chk(int to_t, int count, int len, int i_target){
        if(count == len) {
            if(to_t == i_target) g_answer++;
            return;
        }
        else{
            int now = count;
            count++;
            chk(to_t+g_numbers[now], count, len, i_target);
            chk(to_t-g_numbers[now], count, len, i_target);
        }
    }
    
    
    public int solution(int[] numbers, int target) {
        int len = numbers.length;
        g_numbers = new int[len];
        
        for(int i = 0; i < len; i++) g_numbers[i] = numbers[i];
        
        chk(0,0,len,target);
        
        int answer = g_answer;
        return answer;
    }
}
