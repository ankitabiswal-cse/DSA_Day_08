public class CountOccurrence {
    public static void main(String[] args){

        int[] arr = {2,4,4,4,5,7,9};

        int target = 4;
        int low = 0;
        int high =arr.length - 1;

        int first = -1;

        while(low<=high){
            int mid = low+(high - low)/2;

            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length-1;
        int last = -1;

        //Last Occurrence
        while(low<=high){
            int mid = low+(high - low)/2;

            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            } else if (arr[mid] < target){
                low = mid+1;
            }else{
                high =    mid-1;
            }
        }
        int count = last - first + 1;

        if(first == -1){
            System.out.println("Element Not Found");
        }else{
            System.out.println(target+" Occurs "+count+" times ");
        }
    }
}
