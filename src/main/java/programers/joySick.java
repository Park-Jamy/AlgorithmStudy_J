class Solution {
    public int solution(String name) {
        int len = name.length();
        int answer = 0;
        //A 기본 세팅
        int minus[] = new int[len];
        int min = len - 1;
        for(int i = 0; i < len; i++){
            char nName = name.charAt(i);
            
            // 위아래 변경 횟수 
            minus[i] = nName - 'A' ;
            if(13 < minus[i]) minus[i] = 26 - minus[i];
            
            //총합  
            answer += minus[i];
            
            // 조이스틱 좌, 우 이동
            int nextIndex = i + 1;
            // 다음 단어가 A이고, 단어가 끝나기 전까지 nextIndex 증가
            while (nextIndex < len && name.charAt(nextIndex) == 'A')
              nextIndex++;

            min = Math.min(min, (i * 2) + len - nextIndex);
        }
        answer += min;
        
        return answer;
    }
}
