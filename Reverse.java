public class Reverse {
    public static void stringRev(String str,int idx) {
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringRev(str, idx-1);  
    }
    public static void main(String[] args) {
        String str="kasim";
        stringRev(str, str.length()-1);
    }
}
