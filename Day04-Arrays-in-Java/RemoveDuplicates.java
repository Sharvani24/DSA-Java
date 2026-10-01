public class RemoveDuplicates {
    static int RemoveDuplicates(int[] arr){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                arr[count++]=arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength =RemoveDuplicates(arr);
        for(int i = 0; i < newLength; i++){
          System.out.print(arr[i] + " ");
        }
    }
}
