import java.util.Random;

public class Tester {

    public Tester (SortingAlgorithm sa){

    }

    public double singleTest(int size){
        int time=0;
        
        int[] test = new int[size];
        Random gen = new Random();
        for(int i=0; i < size; i++){
            test[i]= gen.nextInt();
        }

        return time;
    }

}
