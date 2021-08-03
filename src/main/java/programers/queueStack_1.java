package programers;

import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/42586?language=java#

public class queueStack_1 {
public int[] solution(int[] progresses, int[] speeds) {
   Queue<Integer> q = new LinkedList<>();
   ArrayList<Integer> list = new ArrayList<>();
   
   for(int i = 0; i < progresses.length; i++){
       int now = 0;
       if((100 - progresses[i]) % speeds[i] == 0){
           now = (100 - progresses[i]) / speeds[i];
       }
       else{
           now = ((100 - progresses[i]) / speeds[i]) + 1;
       }
       q.add(now);
   }
   
   int count = 0;
   while(!q.isEmpty()){
       int inew = q.peek();
       q.remove();
       count++;
       while(!q.isEmpty()){
           int ina = q.peek();
           if(inew >= ina){
               q.remove();
               count++;
           }else{
               break;
           }
       }
       list.add(count);
       if(q.isEmpty()) break;
       count = 0;
   }
   System.out.println(list);
   int[] answer = new int[list.size()];
   
   for(int k = 0; k < list.size(); k++){
       answer[k] = list.get(k);
   }
   
   return answer;
}
}

//진도가 100일때 서비스 반영이 가능
//각 기능의 개발속는 모두 다르다 --> 앞서서 시작한 기능이 늦게 개발될 수도 있다. --> 배포는 두개의 기능을 한꺼번에 실시 한다.
//