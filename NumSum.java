//Program to print the sum of numbers in a range.

public class NumSum {
    public static void printSum(int i, int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println("Sum of the given range is: "+sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);   
    }
    public static void main(String[] args) {
        printSum(1, 10, 0);
    }
    
}
