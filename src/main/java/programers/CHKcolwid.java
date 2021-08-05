package programers;

import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/42842?language=java
class CHKcolwid {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        ArrayList<Integer> list = new ArrayList<>();
        boolean chk = true;
        
        for(int w = 3; w < brown+1; w++){
            for(int h = 3; h < brown+1; h++){
               if( (brown == 2*(w+h-2)) && (sum == w*h )) {
                   chk = false;
                   if(w > h) {
                       list.add(w);
                       list.add(h);
                   }else{
                       list.add(h);
                       list.add(w);
                   }
                   break;
               }
            }
            if(!chk) break;
        }
        
        System.out.println(list);
        
        int[] answer = {list.get(0), list.get(1)};
        
        return answer;
    }
}