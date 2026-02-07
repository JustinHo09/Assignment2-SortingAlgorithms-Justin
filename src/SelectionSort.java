/**
 * This method implement SortinAlgorithm to perform selection sort.
 */
public class SelectionSort implements SortingAlgorithm {

    /**
     * This method implements SOrtingAlgorithm's sorty method to do selectino sort.
     * @param input The array to sort.
     * @return The sorted array.
     */
    public int[] sorty(int[] input){
        //keeps track of smallest value
        int smallest;
        //starting position
        for(int i=0; i<input.length-1; i++){
            smallest=i;
            //find the index of smallest value, so far
            for(int j=i+1; j<input.length; j++){
                if( input[smallest] > input[j]){
                    smallest=j;
                }
            }
            swap(input,i,smallest);
        }
        return input;
    }

    /**
     * This method swaps the values of two elements in a list given their index.
     * @param input List with elements to swap.
     * @param index1 Index of first element to swap.
     * @param index2 Index of second element to swap.
     */
    public void swap(int [] input, int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
