import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
        int[] numbers = {7, 2, 6, 1, 4, 7,1,5};
        Arrays.sort(numbers);
        //find Duplicate value in Array
        for (int i = 0; i < (numbers.length -1 ); i++) {
            for (int j =i+1; j < (numbers.length ); j++) {
                if (numbers[i]== numbers[j]) {
                    System.out.println( "Thr Duplicate elements is "+numbers[i]);
                }

            }

        }
            //sorting array by method
            Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        }

    }



