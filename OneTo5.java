//Program to print numbers from N to 1.

public class OneTo5{
    public static void printNum(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}