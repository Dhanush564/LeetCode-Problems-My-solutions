class Solution {
    public String reverseWords(String s) {
        
        String[] sr=s.trim().split("\\s+");
        String out=" ";
        for(int i=sr.length-1;i>=0;i--){
            out+=sr[i]+" ";
        }
        return out.trim();
    }
}