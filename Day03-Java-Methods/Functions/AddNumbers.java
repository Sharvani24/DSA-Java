package Day3;

import java.util.Scanner;

public class AddNumbers {
    static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = add(a, b);
        System.out.println("Sum is: " + result);
    }
}
