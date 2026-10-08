public class FindFloor {
    public static void main(String[] args){

        int[] arr = {2,5,8,12,16,20};

        int   target = 15;
        int low = 0;
        int high = arr.length - 1;

        int floor = -1;

        while(low<=high){
            int mid = low+(high - low)/2;

            if(arr[mid] == target){
                floor = mid;
                break;
            } else if (arr[mid] < target) {
                floor = mid;
                low = mid + 1;

            }else {
                high = mid - 1;
            }
        }
        System.out.println("Floor "+floor);
    }
}
