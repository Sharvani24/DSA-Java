public class LastOccurence {
    static int lastOccurence(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10;
        int lastOccurence = lastOccurence(arr, target);
        System.out.println("Last Occurrence: " + lastOccurence);
    }
}
