/**
 * This metheod implement Sorting Algorithm to do merge sort
 */
public class MergeSort implements SortingAlgorithm{

    /**
     * This method takes an array and then preformes merge sort to sort it
     * @param input The array to be sorted
     * @return A sorted array with identical contents to the input
     */
    public int[] sorty(int[] input){
        return mergeSort(input);
    }

    /**
     * The mergesort method to recursivly split the array
     * @param input The array to split and sort
     * @return The sorted array or sorted portion
     */
    public int[] mergeSort(int [] input){
        //only if array has more than one elemnet
        if(input.length>1){

            // gets the size of each half
            int mid = input.length/2;

            //sets sise of left and right halg
            int[] left = new int[mid];
            int[] right = new int[input.length-mid];

            //fills left  array
            for(int i = 0; i<mid; i++){
                left[i] = input[i];
            }
            int j=0;
            //fills right array
            for(int i = mid; i<input.length; i++){
                right[j] = input[i];
                j++;
            }
            // recursivly sort left and right sid eof the array
            int[] subLeft = mergeSort(left);
            int[] subRight = mergeSort(right);
            //merge the sorted left and right sub arrays.
            return merge(subLeft,subRight);
        }
        //base case
        return input;
    }

    /**
     * Merges two arrays together in sorted order.
     * @param left First array to merge.
     * @param right Second array to merge.
     * @return The sorted merged array.
     */
    public int[] merge(int[] left, int[] right){
        // new array is combined size of both
        int [] merged = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        // will add smallest value from each array until one is empty
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                merged[k]= left[i];
                i++;
            }else{
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        // if i is not empty add the rest of i to merged array
        if(i< left.length){
            while(i<left.length){
                merged[k]=left[i];
                i++;
                k++;
            }
            // if j is not empy add the rest of j to merged array
        }else if(j<right.length){
            while(j<right.length){
                merged[k] = right[j];
                j++;
                k++;
            }
        }
        return merged;
    }
}
