import java.util.Random;

public class Tester {

    private SortingAlgorithm algor;
    private String k = "";

    public Tester (SortingAlgorithm sa){
        algor= sa;
    }

    public double singleTest(int size){
        double time;
        KSorted ksort = new KSorted();
        int[] sample = new int[size];
        Random gen = new Random();
        for(int i=0; i < size; i++){
            sample[i]= gen.nextInt();
        }

        ksort.generateKSorted(sample); k="10-Sorted data of: ";

        long start_time = System.nanoTime();

        algor.sorty(sample);

        long end_time = System.nanoTime();

        time = (end_time - start_time)/1000000.0;

        return time;
    }

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
