public class Performance {

    public void main(){

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

        // Insertion sort
        System.out.println("Sorting algorithm - Insertion sort");
        testing = new Tester(insertion);
        for(int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        // Selection sort
        System.out.println("Sorting algorithm - Selection sort");
        testing = new Tester(selection);
        for(int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        // Shell sort
        System.out.println("Sorting algorithm - Shell sort");
        testing = new Tester(shell);
        for( int i=0; i<sizes.length; i++){
            testing.test(iterate,sizes[i]);
        }

        // Quick sort
        System.out.println("Sorting algorithm - Quick sort");


        // Merge sort
        System.out.println("Sorting algorithm - Merge sort");


    }
}
