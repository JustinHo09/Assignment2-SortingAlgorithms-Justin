/**
 * This class implements sorting algorithm to do quicksort
 */
public class QuickSort implements SortingAlgorithm{

    /**
     * This method does quick srot
     * @param input The array to sort
     * @return the sorted array
     */
    public int[] sorty(int [] input){
        quickSort(input,0,input.length-1);
        return input;
    }

    /**
     * This method is the recursive quicksort method to do quick sort unwil the array is sorted
     * @param input The array to sort
     * @param low The index of the arrays start
     * @param high The last index of the array
     */
    public void quickSort(int [] input, int low, int high){
        // This will see if the parition only has one element inside of it
        if(high <= low){
            return;
        }
        int pivotIndex = partition(input,low,high);
        quickSort(input, low, pivotIndex-1);
        quickSort(input, pivotIndex+1, high);
    }

    /**
     * This method partitions the array so the pivot is found.
     * @param input The array to parition
     * @param low The starting point
     * @param high The end point
     * @return The index of the pivot
     */
    public int partition(int [] input, int low, int high){
        int pivot;
        int pivotIndex;
        // median of three method to assign a pivot
        int median = (high+low)/2;
        if((input[low] <= input[median] && input[median] <= input[high] )||
                (input[low] >= input[median] && input[median] >= input[high])){
            pivotIndex = median;
        }else if( (input[median] <= input[low] && input[low] <= input[high]) ||
                (input[high] <= input[low] && input[low] < input[median])){
            pivotIndex = low;
        }else{
            pivotIndex = high;
        }
        pivot = input[pivotIndex];

        //swap pivot with last element
        swap(input, pivotIndex, high);
        pivotIndex = high;

        int i = low;
        int j = high-1;

        // loops until they cross
        while(i <= j){

            // loops until i and j cross or i finds an element greater than pivot
            while(i<=j && input[i] < pivot){
                i++;
            }
            // loop suntil i and j cross of j find an elemnt less than pivot
            while(i<=j && input[j] > pivot){
                j--;
            }

            // if they cross swap them
            if(i<=j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        swap(input, pivotIndex, i);
        return i;
    }

    /**
     * This method swaps thw values of two specified indexs at the list.
     * @param input The list with values you want to swap.
     * @param first The index of the first element to swap.
     * @param second The index of the second element to swap.
     */
    public void swap(int[] input, int first, int second){
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }



}
