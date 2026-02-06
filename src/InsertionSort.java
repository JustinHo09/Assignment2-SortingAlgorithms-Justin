public class InsertionSort implements SortingAlgorithm{

    public int[] sorty(int[] input){
        for(int i=1; i<input.length;i++){

            for(int j=i; j>0; j--){

                if (input[j] < input[j-1]){
                    swap(input,j,j-1);
                }else{
                    break;
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
