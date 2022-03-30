import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {


    public static void main(String args[]) {
// I chose to do a bubble sort of the array,
// but you are free to use any method you wish (e.g. Arrays.sort)
        int[] numbers = new int[]{7, 2, 6, 1, 4, 7};
        int temp = 0;
        int count =0;
        System.out.println("Duplicates values: ");
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 1; j < (numbers.length - i); ++j) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        // walk through the sorted array and count duplicates
        int numDup = 0, dupCount = 0;
        int previous = -1;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == previous) {
                ++numDup;
                if (numDup == 1) {
                    ++dupCount;
                    if (dupCount == 1) {
                        System.out.print(numbers[i]);
                    } else {
                        System.out.print(", " + numbers[i]);
                    }
                }
            } else {
                previous = numbers[i];
                numDup = 0;
            }
        }

        System.out.println("\nNumber of duplicates values: " + dupCount);


        int[] num = new int[]{7, 2, 6, 1, 4, 7};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length-1;++i){
            if(map.containsKey(num[i])){
                 count =map.get(i);
                map.put(num[i],count +1);
            }
            else{
                map.put(num[i],count );
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >1){
                System.out.println("duplicate :"+ entry.getKey() + "number of occurance :" +entry.getValue());
            }
        }
        }


}