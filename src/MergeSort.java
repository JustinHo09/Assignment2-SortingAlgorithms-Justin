public class MergeSort implements SortingAlgorithm{

    public int[] sorty(int[] input){
        
    }

    public int[] mergeSort(int [] input){
        if(input.length>1){

            int mid = input.length/2;

            int[] left = new int[mid];
            int[] right = new int[input.length-mid];

            for(int i = 0; i<mid; i++){
                left[i] = input[i];
            }

            for(int i = mid; i<input.length; i++){
                right[i] = input[i];
            }
            int[] subLeft = mergeSort(left);
            int[] subRight = mergeSort(right);
            return merge(subLeft,subRight);
        }
        return input;
    }

    public int[] merge(int[] left, int[] right){

    }
}
