import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(6,3,9,6,2,8,5,7);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }
}
