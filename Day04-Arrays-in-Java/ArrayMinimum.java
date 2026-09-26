package Day4;

public class ArrayMinimum {
    public static void main(String[] args){
        int[] arr = {10, 45, 23, 89, 12};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
