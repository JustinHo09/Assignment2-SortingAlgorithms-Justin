public class MergeSort implements SortingAlgorithm{

    public int[] sorty(int[] input){
        return mergeSort(input);
    }

    public int[] mergeSort(int [] input){
        if(input.length>1){

            int mid = input.length/2;

            int[] left = new int[mid];
            int[] right = new int[input.length-mid];

            for(int i = 0; i<mid; i++){
                left[i] = input[i];
            }
            int j=0;
            for(int i = mid; i<input.length; i++){
                right[j] = input[i];
                j++;
            }
            int[] subLeft = mergeSort(left);
            int[] subRight = mergeSort(right);
            return merge(subLeft,subRight);
        }
        return input;
    }

    public int[] merge(int[] left, int[] right){
        int [] merged = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                merged[k]= left[i];
                i++;
            }else{
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        if(i< left.length){
            while(i<left.length){
                merged[k]=left[i];
                i++;
                k++;
            }
        }else if(j<right.length){
            while(j<right.length){
                merged[k] = right[j];
                j++;
                k++;
            }
        }
        return merged;
    }
}
