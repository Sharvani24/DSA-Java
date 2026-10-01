public class SecondLargest {
    static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
     public static void main(String[] args){
        int[] arr = {10, 45, 23, 89, 12};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
}
