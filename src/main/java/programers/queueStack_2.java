package programers;

import java.util.*;

class queueStack_2 {
    class Task{
        int location;
        int priority;
        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Task> q = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            q.add(new Task(i, priorities[i]));
        }
        int len = q.size();
        
        int[] list = new int[len];
        
        int count = 1;
        while(!q.isEmpty()){
            int j = q.peek().priority;
            
            boolean chk = true;
            
            for(Task now : q){
                if(j < now.priority) {
                    chk = false;
                    break;   
                }
            }
            
            if(chk == false) {
                q.offer(q.poll());
            } else {
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
				}
            }
            
        }
        return answer;
    }
}