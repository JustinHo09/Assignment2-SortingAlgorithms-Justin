import java.util.Random;

/**
 * This class will dod tests on the specified algrithm
 */
public class Tester {

    private SortingAlgorithm algor;
    private String k = "";

    /**
     * This will store the sorting algorithm to test.
     * @param sa The sorting algorithm to test
     */
    public Tester (SortingAlgorithm sa){
        algor= sa;
    }

    /**
     * Does a single test on the algorithm with a randomly filled array with the given size
     * @param size Size of the array to test the algorithm with
     * @return The time it takes for the algorithm to sort
     */
    public double singleTest(int size){
        double time;
        KSorted ksort = new KSorted();
        int[] sample = new int[size];
        Random gen = new Random();
        for(int i=0; i < size; i++){
            sample[i]= gen.nextInt();
        }
        // COmment this out to do random, uncomment to do k sort
        ksort.generateKSorted(sample); k="10-Sorted data of: ";

        long start_time = System.nanoTime();

        algor.sorty(sample);

        long end_time = System.nanoTime();

        time = (end_time - start_time)/1000000.0;

        return time;
    }

    /**
     * This method manuy tests to find the average time
     * @param iterations The number of iteratinos of test to run
     * @param size The size of the array to run
     * @return A string with the aveerage time and elemetn details
     */
    public String test(int iterations, int size){
        double sum=0;
        String output;
        for(int i = 0; i< iterations; i++){
            sum = sum+ singleTest(size);
        }

        double average = sum/iterations;
        output = "Sorted "+ k +size+" elements in "+ average+ " ms(average)";
        return output;
    }
}
