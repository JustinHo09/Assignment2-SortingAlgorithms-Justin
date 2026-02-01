import java.util.Random;

public class Tester {

    private SortingAlgorithm algor;

    public Tester (SortingAlgorithm sa){
        algor= sa;
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
        double sum=0;

        for(int i = 0; i< iterations; i++){
            sum = sum+ singleTest(size);
        }

        double average = sum/iterations;
        System.out.println("Sorted "+ size+" elements in "+ average+ " ms(average)");

    }
}
