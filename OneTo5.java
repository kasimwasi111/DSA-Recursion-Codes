//Program to print numbers from N to 1.
import java.util.Scanner;

public class OneTo5{
    public static void printNum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        printNum(n);
    }
}