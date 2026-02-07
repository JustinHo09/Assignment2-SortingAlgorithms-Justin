/**
 * This class implements sorting algorithm to do insertion sort.
 */
public class InsertionSort implements SortingAlgorithm{

    /**
     * This method implement Sorting Algorithm's sorty method to do insertion sort.
     * @param input The array to sort.
     * @return The sorted array.
     */
    public int[] sorty(int[] input){
        //Starting position
        for(int i=1; i<input.length;i++){
            //Decrements until end is reached or the previous is not bigger than current
            for(int j=i; j>0; j--){
                //if previous is greater than current swap if not exit loop.
                if (input[j] < input[j-1]){
                    swap(input,j,j-1);
                }else{
                    break;
                }
            }
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
