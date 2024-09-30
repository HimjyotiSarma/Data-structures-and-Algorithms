public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int Peak = PeakIndex(arr);
        int leftSearch = findInMountainArray(arr, 5, 0, Peak);
        if(leftSearch!= -1){
            System.out.println(leftSearch);
        }else{
            System.out.println(findInMountainArray(arr, 5, Peak, arr.length-1));
        }

    }
    private static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start < end ){
            int mid = start + (end - start) /2 ;
            if(arr[mid -1]> arr[mid]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    private static int findInMountainArray(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target ){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return  -1;
    }
}
