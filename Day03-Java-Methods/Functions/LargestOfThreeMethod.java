package Day3;

public class LargestOfThreeMethod {
    static int findLargest(int a, int b, int c){
        if(a>=b && a>=c){

            return a;
        }
        else if(b>=a &&b>=c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        int result = findLargest(10, 20, 30);
        System.out.println("Largest number is: "+ result);
    }
}
