import java.io.FileWriter;
import java.io.IOException;

public class Performance {

    public static void main(String[] args) throws IOException {

        int [] sizes = {100,500,1000,2000,5000,10000,20000,75000,150000};
        int iterate = 20;
        Tester testing;

        SortingAlgorithm bubble = new BubbleSort();
        SortingAlgorithm insertion = new InsertionSort();
        SortingAlgorithm selection = new SelectionSort();
        SortingAlgorithm shell = new ShellSort();
        SortingAlgorithm quick = new QuickSort();
        SortingAlgorithm merge = new MergeSort();

        String fileName = "SortingAlgorithmReport.txt";
        FileWriter fw= new FileWriter(fileName);
        fw.write("Sorting Algorithm Report \n");
        // Bubble sort
        fw.write("\n Sorting algorithm - Bubble sort \n");
        testing= new Tester(bubble);
        for(int i=0; i<sizes.length; i++){
            if(sizes[i] <= 100) {
                fw.write(testing.test(iterate, sizes[i])+"\n");
            }
        }

        System.out.println();

        // Insertion sort
        fw.write("\n Sorting algorithm - Insertion sort \n");
        testing = new Tester(insertion);
        for(int i=0; i<sizes.length; i++){
            if(sizes[i] <= 100) {
                fw.write(testing.test(iterate, sizes[i])+"\n");
            }
        }

        System.out.println();

        // Selection sort
        fw.write("\n Sorting algorithm - Selection sort \n");
        testing = new Tester(selection);
        for(int i=0; i<sizes.length; i++){
            if(sizes[i] <= 100) {
                fw.write(testing.test(iterate, sizes[i])+"\n");
            }
        }

        System.out.println();

        // Shell sort
        fw.write("\n Sorting algorithm - Shell sort \n");
        testing = new Tester(shell);
        for( int i=0; i<sizes.length; i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }

        System.out.println();

        // Quick sort
        fw.write("\n Sorting algorithm - Quick sort \n");
        testing = new Tester(quick);
        for(int i = 0; i<sizes.length; i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }

        System.out.println();

        // Merge sort
        fw.write("\n Sorting algorithm - Merge sort \n");
        testing = new Tester(merge);
        for(int i=0; i<sizes.length;i++){
            fw.write(testing.test(iterate, sizes[i])+"\n");
        }
        fw.close();

    }
}
