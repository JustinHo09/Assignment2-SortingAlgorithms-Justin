public class InsertionSort implements SortingAlgorithm{

    public int[] sorty(int[] input){
        int temp;
        for(int i=1; i<input.length;i++){

            for(int j=i; j>0; j--){

                if (input[j] < input[j-1]){
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }else{
                    break;
                }
            }
        }
        return input;
    }
}
