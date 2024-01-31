interface Sortable {
    void sort(int[] array);
}
// BubbleSort class 
//Prob 98
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                    }
                }
          
            n--;
        } while (swapped);
    }
}   

// SelectionSort class
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}