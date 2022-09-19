//Program to print Factorial of a Number.

import java.util.Scanner;

public class Factorial {
    public static int calcFacto(int n) {
        if(n==1||n==0){
            return 1;
        }
        int fact_nm1=calcFacto(n-1);//factorial of (n-1)!
        int fact_n=n*fact_nm1;//factorial of n!
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int res=calcFacto(n);
        //sc.close();
        System.out.println(res);
    }
    
}
