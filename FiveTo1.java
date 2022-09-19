//Program to print numbers from 1 to N.

import java.util.Scanner;

public class FiveTo1{
    public static void printNum(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        printNum(n);
    }
}