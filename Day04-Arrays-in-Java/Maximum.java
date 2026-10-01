public class Maximum {
    static int findMaximum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int max = findMaximum(arr);
        System.out.println("Maximum elements of array: "+max);
    }
}
