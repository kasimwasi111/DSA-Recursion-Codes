public class Subsequences {
    public static void printSub(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        printSub(str, idx+1, newStr+currChar); 
        printSub(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        printSub(str, 0, "");
    }
    
}
