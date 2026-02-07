/**
 * This class implements Sorting algorithm to perform bubble sort on
 * an array its method is given as input
 */
public class BubbleSort implements  SortingAlgorithm{

    /**
     * This method implements the sorty method of Sorting Algorithm to do bubble sort.
     * @param input The array to sort.
     * @return The sorted input array
     */
    public int[] sorty(int[] input){
        //starting position
        for(int i =0; i<input.length-1; i++){
            //loops and swaps with the next largest value
            for(int j=0; j<input.length-1-i; j++){
                if(input[j+1] < input[j]){
                    swap(input, j+1, j);
                }
            }
        }
        return input;
    }

    /**
     * This method swaps thw values of two specified indexs at the list.
     * @param input The list with values you want to swap.
     * @param index1 The index of the first element to swap.
     * @param index2 The index of the second element to swap.
     */
    public void swap(int [] input, int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
