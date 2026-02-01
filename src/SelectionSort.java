public class SelectionSort implements SortingAlgorithm {

    public int[] sorty(int[] input){
        int smallest;
        int temp;
        for(int i=0; i<input.length-1; i++){
            smallest=i;
            for(int j=i+1; j<input.length; j++){
                if( input[smallest] > input[j]){
                    smallest=j;
                }
            }
            temp = input[i];
            input[i] = input[smallest];
            input[smallest] = temp;
        }
        return input;
    }
}
