public class InterviewTest {

    public static void main(String[] args) {

        Rearrange1(new int[]{5, 3, -3, -4, 0, 2, -1, 4, -7, 2});


    }


    static void Rearrange1(int[] inputData) {
        int[] array = new int[]{5, 3, -3, -4, 0, 2, -1, 4, -7, 2};

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length) - i; j++) {
                if (array[j - 1] < array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

}





