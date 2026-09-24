package Day3;

public class CountDigitsMethod {
    static int countDigits(int num){
        int  count=0;
        while(num!=0){
        num=num/10;
        count++;
        }
        return count;
    } 
    public static void main(String[] args){
        int result = countDigits(123456);
        System.out.println(result);
    }
}
