import java.util.HashSet;

public class Subsequences2 {
    public static void printSub(String str,int idx,String newStr,HashSet<String> set) {
        if(idx==str.length()){
            if(set.contains(newStr)){
            return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(idx);
        printSub(str, idx+1, newStr+currChar,set); 
        printSub(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String str="abcd";
        HashSet<String> set=new HashSet<>();
        printSub(str, 0, "",set);
    }
}
