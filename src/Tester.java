import java.util.Random;

public class Tester {

    public Tester (SortingAlgorithm sa){

    }

    public double singleTest(int size){
        double time;

        int[] test = new int[size];
        Random gen = new Random();
        for(int i=0; i < size; i++){
            test[i]= gen.nextInt();
        }

        long start_time = System.nanoTime();
        // ADD THE SORTING METHOD CALL HERE
        long end_time = System.nanoTime();

        time = (end_time - start_time)/1000000;

        return time;
    }

    public void test(int iterations, int size){
        int sum;

        
    }
}
