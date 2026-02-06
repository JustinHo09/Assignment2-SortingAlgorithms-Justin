public class QuickSort implements SortingAlgorithm{

    public int[] sorty(int [] input){
        quickSort(input,0,input.length-1);
        return input;
    }

    public void quickSort(int [] input, int low, int high){
        // This will see if the parition only has one element inside of it
        if(high <= low){
            return;
        }
        int pivot = partition(input,low,high);
        quickSort(input, low, pivot-1);
        quickSort(input, pivot+1, high);
    }

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

        while(i <= j){

            while(i<=j && input[i] < pivot){
                i++;
            }

            while(i<=j && input[j] > pivot){
                j--;
            }

            if(i<=j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        swap(input, pivotIndex, i);
        return i;
    }

    public void swap(int[] input, int first, int second){
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }



}
