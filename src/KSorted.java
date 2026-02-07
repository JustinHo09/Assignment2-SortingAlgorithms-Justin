/**
 * This class will ksort a list, specifially 10-sort it since it is hard codded to do
 * 10 sort.
 */
public class KSorted {

    /**
     * This method will take an array and 10-sort it to ensure all data is within 10 positions of
     * its correct location.
     * @param my_array The array to ksort
     */
    public void generateKSorted(int [] my_array){
        int gap = 10;
        //Ksort each interleave
        for( int i = 0; i<gap; i++) {
            sortInterleave(my_array,gap,i);
        }

    }

    /**
     * This method takes in an input and sorts its interleaves.
     * @param input Array to find and sort its interlaves
     * @param gap The distance betweenn each element of  interleave
     * @param start The starting position for  interleave
     */
    public void sortInterleave(int[] input, int gap, int start){
        int temp;

        //insertion sort to search
        for(int j=start+gap; j<input.length;j=j+gap){

            // decrease by 10
            for(int k=j; k>=gap; k=k-gap){

                //swap if previous is less than current and break if not.
                if(input[k-gap] > input[k]){
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
