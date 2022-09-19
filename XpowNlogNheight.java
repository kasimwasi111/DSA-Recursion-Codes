//Program to print X^N with stack height logN.

import java.util.Scanner;
public class XpowNlogNheight {
    public static int calPower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calPower(x, n/2)*calPower(x, n/2);
        }
        else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=calPower(x, n);
        System.out.println(ans);
        sc.close();
    }
    
}
