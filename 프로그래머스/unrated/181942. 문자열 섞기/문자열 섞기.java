class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int a = str1.length();
        for(int i=0;i<a*2;i++){
            if(i%2==0){
                sb.append(str1.charAt(i/2));
            }
            else{
                sb.append(str2.charAt(i/2));
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}