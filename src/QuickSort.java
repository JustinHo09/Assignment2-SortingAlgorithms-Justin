public class QuickSort implements SortingAlgorithm{

    public int[] sorty(int [] input){
        quickSort(input,0,input.length-1);
        return input;
    }

    public void quickSort(int [] input, int low, int high){
        if(high <= low){
            return;
        }

    }


}
