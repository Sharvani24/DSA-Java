package Day3;

public class LargestOfTwoMethod {
    static int findLargest(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int result = findLargest(10,20);
        System.out.println("Largest number is: "+result);
    }
}
