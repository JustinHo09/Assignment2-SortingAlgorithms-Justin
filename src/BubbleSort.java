public class BubbleSort implements  SortingAlgorithm{

    public int[] sorty(int[] input){
        for(int i =0; i<input.length-1; i++){
            for(int j=0; j<input.length-1-i; j++){
                if(input[j+1] < input[j]){
                    swap(input, j+1, j);
                }
            }
        }
        return input;
    }

    public void swap(int [] input, int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
