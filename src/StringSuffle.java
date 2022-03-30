import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Shuffle {
    public static void main(String[] args) {
      String str ="Hello World";
      String result =shuffle(str);


        System.out.println("Actual String : " + str);
        System.out.println("Shuffled String : " + result);

    }

    public static String shuffle(String s) {
        List<String> letters = Arrays.asList(s.split(""));
        Collections.shuffle(letters);
        StringBuilder sb = new StringBuilder(s.length());
        for (String str : letters) {
            sb.append(str);
        }
        return sb.toString();
    }

}