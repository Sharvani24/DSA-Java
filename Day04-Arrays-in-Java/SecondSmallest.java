public class SecondSmallest {
    static int findSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
        }
        
        return secondSmallest;
    }
    public static void main(String[] args){
        int[] arr = {10, 45, 23, 89, 12};
        int secondSmallest = findSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}