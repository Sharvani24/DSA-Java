public class ReverseArrayUsingPointers{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}