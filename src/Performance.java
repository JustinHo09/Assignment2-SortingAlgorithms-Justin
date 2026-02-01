public class Performance {

    public static void main(String[] args){

        int [] sizes = {100,500,1000,2000,5000,10000,20000,75000,150000};
        int iterate = 20;

        Tester testing;

        SortingAlgorithm bubble = new BubbleSort();
        SortingAlgorithm insertion = new InsertionSort();
        SortingAlgorithm selection = new SelectionSort();
        SortingAlgorithm shell = new ShellSort();


        // Bubble sort
        System.out.println("Sorting algorithm - Bubble sort");
        testing= new Tester(bubble);
        for(int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        System.out.println();

        // Insertion sort
        System.out.println("Sorting algorithm - Insertion sort");
        testing = new Tester(insertion);
        for(int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        System.out.println();

        // Selection sort
        System.out.println("Sorting algorithm - Selection sort");
        testing = new Tester(selection);
        for(int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        System.out.println();

        // Shell sort
        System.out.println("Sorting algorithm - Shell sort");
        testing = new Tester(shell);
        for( int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        System.out.println();

        // Quick sort
        System.out.println("Sorting algorithm - Quick sort");

        System.out.println();

        // Merge sort
        System.out.println("Sorting algorithm - Merge sort");


    }
}
