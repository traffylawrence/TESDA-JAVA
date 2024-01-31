public class sort {
   public static void main(String[] args) {
        int[] array = {4,2,0,3,1,6,8};

        // Print BubbleSort
        Sortable bubbleSort = new BubbleSort();
        int[] bubbleSortedArray = array.clone();
        bubbleSort.sort(bubbleSortedArray);
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(bubbleSortedArray));

        // Print SelectionSort
        Sortable selectionSort = new SelectionSort();
        int[] selectionSortedArray = array.clone();
        selectionSort.sort(selectionSortedArray);
        System.out.println("Selection Sort: " + java.util.Arrays.toString(selectionSortedArray));
    }
}