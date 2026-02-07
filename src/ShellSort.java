/**
 * This class implements sorting algorithm and will perform shell sort.
 */
public class ShellSort implements SortingAlgorithm{

    /**
     * This method Implements the sorting algorithm's sorty method ot perform shell sort.
     * @param input This is the array to shell sort.
     * @return The sorted input array.
     */
    public int[] sorty(int[] input){

        for(int gap= input.length/2; gap >=1; gap = gap/2){

            for(int i=0; i<gap;i++){
                sortInterleave(input,i,gap);
            }
        }

        return input;
    }

    /**
     * This method takes in an array and find and sorts its interleaves by adding the gap to it
     * and using insertions sort to sort interleave.
     * @param input The array to sort.
     * @param start The starting point which determines which interleave is being sorted.
     * @param gap The gap, which determines the size between each value and which values are in
     *            interleave.
     */
    public void sortInterleave(int[] input, int start, int gap){

        int temp;
        //Insertion sort but start at stat+gap, the next value in interleave instead of
        //starting interleave value
        for(int j = start+gap; j< input.length; j= j+ gap){
        // Checks the previous interleaves by reducing by the gap instead of one.
            for(int k=j; k>=gap; k=k-gap){

                if(input[k-gap] > input[k]){
                    //swap if the previous is larger tah nthe current invterleave.
                    temp = input[k-gap];
                    input[k-gap] = input[k];
                    input[k] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
