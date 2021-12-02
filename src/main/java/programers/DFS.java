class Solution {
    static int[] gNumbers;
    static int gTarget;
    static int numLen;
    static int gAnswer;
    
    public int solution(int[] numbers, int target) {
        //글로벌 변수 값 설정 
        gAnswer = 0;
        numLen = numbers.length;
        gNumbers = new int[numLen];
        for(int i = 0; i < numLen; i++ )
            gNumbers[i] = numbers[i];
        gTarget = target;
        
        DFS(0, 0);
        
        int answer = gAnswer;
        return answer;
    }
    
    
    static void DFS(int anS, int depth){
        if(depth == numLen){ // 깊이 체크 만약 전부 체크했을 경우 벗어나기
            if(anS == gTarget) gAnswer++;
            return;
        }else{ // 아직 전부 체크 안했을 경우 
            int min = anS-gNumbers[depth];
            int max = anS+gNumbers[depth];
            
            depth++; 
            DFS(min, depth);
            DFS(max, depth);
        }
    }
    
    
}
