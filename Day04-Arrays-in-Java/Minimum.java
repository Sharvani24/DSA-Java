public class Minimum {
    static int findMinimum(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int min = findMinimum(arr);
        System.out.println("Minimum elements of array: "+min);
    }
}
