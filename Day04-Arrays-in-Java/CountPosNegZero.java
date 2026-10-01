public class CountPosNegZero {
    static int[] CountPosNegZero(int[] arr){
        int[] count = new int[3];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                count[0]++;
            }
            else if(arr[i]<0){
                count[1]++;
            }
            else{
                count[2]++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {10, -5, 0, 20, -8, 0, 15};
        int[] count = CountPosNegZero(arr);
        System.out.println("Positive= " + count[0]);
        System.out.println("Negative= " + count[1]);
        System.out.println("Zero= " + count[2]);
    }
}
