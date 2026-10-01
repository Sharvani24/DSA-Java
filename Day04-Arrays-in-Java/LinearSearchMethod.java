public class LinearSearchMethod {
    static boolean LinearSearch(int[] arr, int target){
        boolean found=false;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        
        return found;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        boolean result = LinearSearch(arr, target);
        if(result){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
        
}
