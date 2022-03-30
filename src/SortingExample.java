public class SortingExample {
    public static void main(String[] args){
        int[] array = {7,5,3,9,2,0,6};

        for(int i=0; i< array.length  ; i++){
            for(int j=1; j < (array.length) -i ;j++) {
                if (array[j -1] > array[j]) {
                    int temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i:array){
            System.out.println(i);
        }
    }
}
