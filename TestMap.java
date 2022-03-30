

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestMap {




    public static void main (String[] args){


        List<Integer> list = Arrays.asList(3,4,6,12,20);
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        map.put("1",list);
        System.out.println(map.values());

        map.values().stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);

    }
}
