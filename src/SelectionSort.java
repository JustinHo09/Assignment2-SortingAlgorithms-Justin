public class SelectionSort implements SortingAlgorithm {

    public int[] sorty(int[] input){
        int smallest;
        for(int i=0; i<input.length-1; i++){
            smallest=i;
            for(int j=i+1; j<input.length; j++){
                if( input[smallest] > input[j]){
                    smallest=j;
                }
            }
            swap(input,i,smallest);
        }
        return input;
    }

    public void swap(int [] input, int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
