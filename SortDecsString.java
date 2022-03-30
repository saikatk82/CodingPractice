import java.util.Arrays;
import java.util.Collections;

public class SortDecsString {
    public static void main(String args[]) {
        String[] stringArr = {"Java", "Python", "PHP", "C#", "C++", "HTML", "XML", "SQL"};
     Arrays.sort(stringArr, Collections.reverseOrder());
     System.out.println(Arrays.toString(stringArr));

    }
}