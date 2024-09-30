public class FloorSearch {
    public static void main(String[] args) {
        int[] arr = {25, 22, 20, 18, 15, 13, 12, 11, 10, 7, 6, 5, 2};
        int target = 4
                ;
        int search = FloorBinarySearch(arr, target);
        System.out.println(search);
    }

    static int FloorBinarySearch(int[] arr, int target){
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
        return isAsc? (end >= 0 ? arr[end]: -1) : (start< arr.length ? arr[start]: -1);
    }
}
