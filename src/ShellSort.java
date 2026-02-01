public class ShellSort implements SortingAlgorithm{

    public int[] sorty(int[] input){

        for(int gap= input.length/2; gap >=1; gap = gap/2){

            for(int i=0; i<gap;i++){
                sortInterleave(input,i,gap);
            }
        }

        return input;
    }

    public void sortInterleave(int[] input, int start, int gap){
        
    }
}
