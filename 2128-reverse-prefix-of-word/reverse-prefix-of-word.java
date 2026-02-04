class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        for(i = 0; i < word.length(); i++){
            if(word.charAt(i) != ch){
                st.push(word.charAt(i));
            }else{
                break;
            }
        }
        if(i == word.length()){
            return word;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(i));
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.append(word.substring(i+1));

        return sb.toString();
    }
}