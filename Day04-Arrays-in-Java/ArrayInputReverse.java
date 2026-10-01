import java.util.Scanner;

public class ArrayInputReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}