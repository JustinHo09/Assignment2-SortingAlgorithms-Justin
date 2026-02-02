public class KSorted {

    public void generateKSorted(int [] my_array){
        int gap = 10;

        for( int i = 0; i<gap; i++) {
            sortInterleave(my_array,gap,i);
        }

    }

    public void sortInterleave(int[] input, int gap, int start){
        int temp;

        for(int j=start+gap; j<input.length;j=j+gap){

            for(int k=j; k>=gap; k=k-gap){

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
