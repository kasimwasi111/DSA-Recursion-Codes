//Program to print Finonacci Series.

import java.util.Scanner;

public class FibonSeries {
    public static void printFib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        printFib(a, b, n-2);
    }
    
}
