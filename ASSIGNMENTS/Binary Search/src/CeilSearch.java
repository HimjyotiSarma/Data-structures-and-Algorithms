public class CeilSearch {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 7, 11, 12, 15, 19, 21, 23};
        int[] arr = {25, 22, 20, 18, 15, 13, 12, 11, 10, 7, 6, 5, 2};
        int target = 17;
        int search = CeilBinarySearch(arr, target);
        System.out.println(search);
    }
    static int CeilBinarySearch(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1 ;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            if(isAsc){
                if(arr[mid] < target){
                    // Right Search
                    start = mid+1;
                }else{
                    // Left Search
                    end = mid -1;
                }
            }else{
                if(arr[mid] < target){
                    // Left Search
                    end = mid -1;
                }else{
                    // Right Search
                    start = mid+1;
                }
            }

        }
        return isAsc? (start< arr.length ? arr[start]: -1) : (end >= 0 ? arr[end]: -1);
    }



}
