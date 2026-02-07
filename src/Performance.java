import java.io.FileWriter;
import java.io.IOException;

/**
 * This mehtod will frind da report of all algorithsm pereforamnce
 */
public class Performance {

    public static void main(String[] args) throws IOException {

        // sores all sizes so we can use a loop to go thoguh eaach size
        int [] sizes = {100,500,1000,2000,5000,10000,20000,75000,150000};
        int iterate = 20;
        Tester testing;

        // creates all algorithm object
        SortingAlgorithm bubble = new BubbleSort();
        SortingAlgorithm insertion = new InsertionSort();
        SortingAlgorithm selection = new SelectionSort();
        SortingAlgorithm shell = new ShellSort();
        SortingAlgorithm quick = new QuickSort();
        SortingAlgorithm merge = new MergeSort();

        //creates the files name and starts file writer
        String fileName = "SortingAlgorithmReport.txt";
        FileWriter fw= new FileWriter(fileName);
        fw.write("Sorting Algorithm Report \n");

        // Bubble sort and writes its time in the file
        fw.write("\n Sorting algorithm - Bubble sort \n");
        testing= new Tester(bubble);
        for(int i=0; i<sizes.length; i++){

                fw.write(testing.test(iterate, sizes[i])+"\n");

        }


        // Insertion sort andd writes its time in the file
        fw.write("\n Sorting algorithm - Insertion sort \n");
        testing = new Tester(insertion);
        for(int i=0; i<sizes.length; i++){

                fw.write(testing.test(iterate, sizes[i])+"\n");

        }


        // Selection sort and wrties its time in the file
        fw.write("\n Sorting algorithm - Selection sort \n");
        testing = new Tester(selection);
        for(int i=0; i<sizes.length; i++){

                fw.write(testing.test(iterate, sizes[i])+"\n");

        }


        // Shell sort and writes its time in teh file
        fw.write("\n Sorting algorithm - Shell sort \n");
        testing = new Tester(shell);
        for( int i=0; i<sizes.length; i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }


        // Quick sort and wrteies its time in teh file
        fw.write("\n Sorting algorithm - Quick sort \n");
        testing = new Tester(quick);
        for(int i = 0; i<sizes.length; i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }


        // Merge sort and writes its time in the file
        fw.write("\n Sorting algorithm - Merge sort \n");
        testing = new Tester(merge);
        for(int i=0; i<sizes.length;i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }
        //closes the file
        fw.close();
        // Tells user report is done.
        System.out.println("Algorithm report finished and ready in: "+fileName);
    }
}
