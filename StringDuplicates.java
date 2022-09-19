public class StringDuplicates {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.print(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str, idx+1, newStr);
        } 
        else{
            newStr+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str="kasiammik";
        removeDuplicates(str,0,"");   
        }
}
