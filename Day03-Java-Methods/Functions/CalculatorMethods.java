import java.util.*;

public class CalculatorMethods{
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int product(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition= " + add(a,b));
        System.out.println("Subtraction= " + subtract(a,b));
        System.out.println("Product= " + product(a,b));
        System.out.println("Division= " + divide(a,b));
    }

}