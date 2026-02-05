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
            pivot = input[median];
            pivotIndex = median;
        }else if( (input[median] <= input[low] && input[low] <= input[high]) ||
                (input[high] <= input[low] && input[low] < input[median])){
            pivot = input[low];
            pivotIndex = low;
        }else{
            pivot = input[high];
            pivotIndex = high;
        }
        //swap pivot with last element
        if(pivot != input[high]){
            swap(input, pivotIndex, high);
            pivotIndex = high;
        }

        boolean crossed=false;

        while(!crossed){

            while(input[low] < input[pivot]){
                low++;
            }

            while(input[high-1] > input[pivot]){
                high--;
            }

            if(high < low){
                crossed = true;
                swap(input, pivotIndex, low);
            }else{
                swap(input, low, high);
                low++;
                high--;
            }
        }

        return low;
    }

    public void swap(int[] input, int first, int second){
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }



}
