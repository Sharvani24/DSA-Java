public class CountEvenMethod {
    static int CountEven(int[] arr){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int count = CountEven(arr);
        System.out.println("Number of even elements: "+ count);
    }
}
