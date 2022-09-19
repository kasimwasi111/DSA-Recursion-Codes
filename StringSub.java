public class StringSub {
    public static boolean isSubsequence(String s, String t){
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        if(s.charAt(0)==t.charAt(0)){
            return isSubsequence(s.substring(1),t.substring(1));
        }
        return isSubsequence(s, t.substring(1));
    }
    public static void main(String[] args) {
        String s="Mohammad Kasim";
        String t="Kasim"; 
        isSubsequence(s,t);
    }
    
}
