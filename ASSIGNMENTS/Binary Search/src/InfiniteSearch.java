public class InfiniteSearch {
    public static void main(String[] args) {
        int[] arr = {3, 10,15, 22, 27, 35, 41, 47, 52, 59, 63, 65, 72, 88, 90, 91, 94, 96, 99, 100, 121, 123, 135, 149, 169, 153, 162, 168, 172, 189, 191, 193, 195, 199, 201};
        int result = findInPackSearch(arr, 201);
        System.out.println(result);
    }
    private static int findInPackSearch(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end] ){
            int newStart = end +1 ;
            end = end + (end - start +1) * 2;
            if(end > arr.length -1 ){
                end = arr.length -1;
            }
            start = newStart;
        }
        return Search(arr, target, start,end);
    }
    private static int Search(int[] arr, int target, int start, int end){

        while(start<= end){
            int mid = start + (end - start) /2;

            if(arr[mid] < target){
                start = mid +1;
            } else if (arr[mid] > target ) {
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
