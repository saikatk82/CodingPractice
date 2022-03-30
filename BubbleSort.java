import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String [] args){
        int[] array ={6,8,1,9,5,2,7,4};

        System.out.println("Unsorted data:");
        PrintArray(array);

        System.out.println("sorted data:");
        bubble_sort(array);
        PrintArray(array);
    }

    private static void PrintArray(int[] data){

        String result = Arrays.stream(data).mapToObj(String::valueOf).collect(Collectors.joining(","));

        System.out.println(result);
    }

    private static void bubble_sort(int [] input){
        bubble_sort(input,true);
    }

    private static void bubble_sort(int[] input, boolean ascending) {

        int inputLength = input.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {

                if (ascending) {
                    if (input[j - 1] > input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }
                } else {
                    if (input[j - 1] < input[j]) {
                        temp = input[j - 1];
                        input[j - 1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }

                }

            }

            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;

        }

    }



}

