public class BubbleSort implements  SortingAlgorithm{

    public int[] sorty(int[] input){
        int temp;
        for(int i =0; i<input.length-1; i++){
            for(int j=0; j<input.length-1-i; j++){
                if(input[j+1] < input[j]){
                    temp=input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }
}
