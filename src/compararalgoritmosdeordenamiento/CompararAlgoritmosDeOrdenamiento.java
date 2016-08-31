package compararalgoritmosdeordenamiento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CompararAlgoritmosDeOrdenamiento {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int cont = 0;
        while (cont <= 10) {
            cont++;
            String str = "";
            int[] input10 = new int[10];
            int[] input100 = new int[100];
            int[] input1000 = new int[1000];
            int[] input10000 = new int[10000];
            int[] input100000 = new int[100000];
            int[] input1000000 = new int[1000000];

            input10 = llenarArreglo(10);
            input100 = llenarArreglo(100);
            input1000 = llenarArreglo(1000);
            input10000 = llenarArreglo(10000);
            input100000 = llenarArreglo(100000);
            input1000000 = llenarArreglo(1000000);

            System.out.println("10 input: ");
            str += "10 input:*";
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input10) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input10) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input10) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input10) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input10) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input10) + "/";
            System.out.println("");
             System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input10,10) + "/";
            System.out.println("");

            System.out.println("100 input: ");
            str += "100 input:*";            
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input100) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input100) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input100) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input100) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input100) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input100) + "/";
            System.out.println("");
              System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input100,100) + "/";
            System.out.println("");

            System.out.println("1,000 input: ");
            str += "1,000 input:*";
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input1000) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input1000) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input1000) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input1000) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input1000) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input1000) + "/";
            System.out.println("");
              System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input1000,1000) + "/";
            System.out.println("");

            System.out.println("10,000 input: ");
            str += "10,000 input:*";
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input10000) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input10000) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input10000) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input10000) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input10000) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input10000) + "/";
            System.out.println(""); 
              System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input10000,10000) + "/";
            System.out.println("");

            System.out.println("100,000 input: ");
            str += "100,000 input:*";
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input100000) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input100000) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input100000) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input100000) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input100000) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input100000) + "/";
            System.out.println("");
            System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input100000,100000) + "/";
            System.out.println("");

            System.out.println("1,000,000 input: ");
            str += "1,000,000 input:*";
            System.out.print("BUBBLESORT: ");
            str += "BUBBLESORT-"+calcularBubbleSort(input1000000) + "/";
            System.out.println("");
            System.out.print("INSERTSORT: ");
            str += "INSERTSORT-"+calcularInsertionSort(input1000000) + "/";
            System.out.println("");
            System.out.print("SELECTIONSORT: ");
            str += "SELECTIONSORT-"+calcularSelectionSort(input1000000) + "/";
            System.out.println("");
            System.out.print("MERGESORT: ");
            str += "MERGESORT-"+calcularMergeSort(input1000000) + "/";
            System.out.println("");
            System.out.print("HEAPSORT: ");
            str += "HEAPSORT-"+calcularHeapSort(input1000000) + "/";
            System.out.println("");
            System.out.print("QUICKSORT: ");
            str += "QUICKSORT-"+calcularQuickSort(input1000000) + "/";
            System.out.println("");
            System.out.print("RADIXSORT: ");
            str += "RADIXSORT-"+calcularRadixSort(input1000000,1000000) + "/";
            System.out.println("");
            
            File archivo = new File("./Resultados_"+cont);
            BufferedWriter bw;
            
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(str);
            bw.close();
        }
    }

    public static int[] llenarArreglo(int tam) {
        Random ran = new Random();
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = ran.nextInt(100000);
        }
        return array;
    }

    //BUBBLE SORT ----------------------------------------------------------------------------
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    //INSERTION SORT ----------------------------------------------------------------------------
    public static void insertionSort(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
    }

    //SELECTION SORT ----------------------------------------------------------------------------
    public static void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    //MERGE SORT ----------------------------------------------------------------------------
    public static int[] mergeSort(int[] list) {
        if (list.length <= 1) {
            return list;
        }

        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        // Sort each half
        mergeSort(first);
        mergeSort(second);

        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return list;
    }

    private static void merge(int[] first, int[] second, int[] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

//HEAP SORT ----------------------------------------------------------------------------
    private static int N;
    /* Sort Function */

    public static void heapsort(int arr[]) {
        heapify(arr);
        for (int i = N; i > 0; i--) {
            swap(arr, 0, i);
            N = N - 1;
            maxheap(arr, 0);
        }
    }
    /* Function to build a heap */

    public static void heapify(int arr[]) {
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--) {
            maxheap(arr, i);
        }
    }
    /* Function to swap largest element in heap */

    public static void maxheap(int arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i]) {
            max = left;
        }
        if (right <= N && arr[right] > arr[max]) {
            max = right;
        }

        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

//QUICK SORT ----------------------------------------------------------------------------
    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }
//---Radix Sort---------------------------------------------------------------------------
      public static void radixSort( int[] a ,int c)
    {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[c];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[c];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }    
      
//--Calcular------
    public static String calcularBubbleSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        bubbleSort(lista);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

    public static String calcularInsertionSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        insertionSort(lista);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

    public static String calcularSelectionSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        selectionSort(lista);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

    public static String calcularMergeSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        mergeSort(lista);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

    public static String calcularHeapSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        heapsort(lista);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

    public static String calcularQuickSort(int[] lista) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        quickSort(lista, 0, lista.length - 1);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }
   public static String calcularRadixSort(int[] lista,int l) {
        String str = "";
        long time_start, time_end;
        time_start = System.nanoTime();
        radixSort(lista, l);
        time_end = System.nanoTime();
        str +="the task has taken " + (time_end - time_start) + " nanoseconds";
        System.out.println("the task has taken " + (time_end - time_start) + " nanoseconds");
        return str;
    }

}
