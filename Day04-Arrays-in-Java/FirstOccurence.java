public class FirstOccurence {
    static int firstOccurence(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 30, 20, 40};
        int target = 20;
        int firstOccurence = firstOccurence(arr, target);
        System.out.println("First Occurrence: " + firstOccurence);

    }
}
