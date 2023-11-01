class Solution {
    public int solution(int[] topping) {        
        if(topping.length==1){
            return 0;
        }
        int answer = 0;
        
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        
        int kind1 = 1; int kind2 = 0;
        
        cnt1[topping[0]]++;
        
        for(int i=1;i<topping.length;i++){
            if(cnt2[topping[i]] == 0){
                kind2++;
            }            
            cnt2[topping[i]]++;            
        }
        
        if(kind1 == kind2){
            answer++;
        }
        
        for(int i=1;i<topping.length-1;i++){
            if(cnt1[topping[i]]++ == 0 ){
                ++kind1;
            }
            if(--cnt2[topping[i]]==0){
                --kind2;
            }

            if(kind1 == kind2){
                answer++;
            }
        }
        return answer;
    }
}