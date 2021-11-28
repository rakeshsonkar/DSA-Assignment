class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < sLen; i++){
            if(st1.size() == 0 && s.charAt(i) == '#') continue;
            if(s.charAt(i) == '#') st1.pop();
            else st1.push(s.charAt(i));
        }
        for(int i = 0; i < tLen; i++){
            if(st2.size() == 0 && t.charAt(i) == '#') continue;
            if(t.charAt(i) == '#') st2.pop();
            else st2.push(t.charAt(i));
        }
        if(st1.size() != st2.size()) return false;
        while(!st1.isEmpty()){
            if(st1.pop() != st2.pop()) return false;
        }
        return true;
    }
}