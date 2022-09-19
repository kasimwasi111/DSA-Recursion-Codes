////Program to print X^N with stack height N.

import java.util.Scanner;

public class XpowerN1 {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowernm1=calPower(x, n-1);
        int xPowern=x*xPowernm1;
        return xPowern;
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
